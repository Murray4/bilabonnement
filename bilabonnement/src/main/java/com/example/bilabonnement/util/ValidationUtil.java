package com.example.bilabonnement.util;

import java.math.BigDecimal;

//Hjælpemetoder til inputvalidering
//Valideringsmetoder til inputs (tom streng, ugyldig dato osv.).


// privat, tom constructor, som Forhindrer at nogen kan lave new ValidationUtil()
public final class ValidationUtil {

        private ValidationUtil() { /* util-klasse */ }

// Tjekker: null er OK (valgfrit felt), ellers >= 0 og max N cifre
        public static boolean isNullOrNonNegativeIntegerWithMaxDigits(Integer value, int maxDigits) {
            if (value == null) return true;              // tillad null, hvis feltet ikke er påkrævet
            if (value < 0) return false;                 // må ikke være negativt
            // antal heltalscifre (uden fortegn)
            int digits = String.valueOf(Math.abs(value)).length();
            return digits <= maxDigits;
        }

// Tjekker BigDecimal: null OK, ellers >= 0, max 'intDigits' heltalscifre og max 'fracDigits' decimaler
        public static boolean isNonNegativeWithMaxDigits(BigDecimal value, int intDigits, int fracDigits) {
            if (value == null) return true;              // tillad null (tom pris)
            if (value.signum() < 0) return false;        // må ikke være negativ
            BigDecimal abs = value.stripTrailingZeros().abs();

            // antal decimaler
            int scale = Math.max(abs.scale(), 0);
            if (scale > fracDigits) return false;

            // heltalscifre = antal cifre før komma
            // for BigDecimal gælder: precision = totale cifre, integerDigits ~ precision - scale (når scale >= 0)
            int precision = abs.precision();
            int integerDigits = precision - scale;
            return integerDigits <= intDigits;
        }
    }


