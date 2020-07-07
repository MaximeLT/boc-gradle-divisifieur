package com.github.dorval.francois.controller;

import com.github.dorval.francois.business.Divisifieur;
import com.github.dorval.francois.util.Errors;
import com.github.dorval.francois.util.MathUtils;

public class Main {

    /**
     * fonction principale du programme
     * @param args
     */
    public static void main(final String[] args) {
        if (args.length!=2){
            throw new IllegalArgumentException(Errors.DEUX_ARGUMENTS_ATTENDUS);
        }
        int dividende = MathUtils.parseIntegerString(args[0]);
        int diviseur = MathUtils.parseIntegerString(args[1]);

        if (diviseur == 0){
            throw new IllegalArgumentException(Errors.DIVISION_PAR_ZERO);
        }

        int quotient = Divisifieur.diviser(dividende, diviseur);

        System.out.println(dividende+"/"+diviseur+"=" +quotient);


    }

}

