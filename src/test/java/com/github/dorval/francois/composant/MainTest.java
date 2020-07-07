package com.github.dorval.francois.composant;


import com.github.dorval.francois.controller.Main;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class MainTest {

    @Test
    public void testCasPassantBeteEtMechant() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        Main.main(new String[]{"6", "2"});

        // pas d'erreur de mon côté, un \n apparaît des 2 côtés de la comparaison et les tests passent (linux)
        Assert.assertEquals("6/2=3\n", bos.toString());

        System.setOut(originalOut);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifieDivisionParZero() {
        Main.main(new String[]{"6", "0"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCasKo() {
        Main.main(new String[]{"abcd"});
    }
}
