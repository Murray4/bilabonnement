package com.example.bilabonnement.util.test;

import org.junit.Test;

//public class ValidationUtilsTest {
//
//    // --- KM: heltal 0..999999; null/blank accepteres (controller håndterer det) ---
//    @Test
//    void km_isValidated() {
//        assertTrue(ValidationUtil.isValidKm(null));        // tomt → ok
//        assertTrue(ValidationUtil.isValidKm(""));          // tomt → ok
//        assertTrue(ValidationUtil.isValidKm("0"));         // kant
//        assertTrue(ValidationUtil.isValidKm("999999"));    // kant
//        assertTrue(ValidationUtil.isValidKm(" 123 "));     // whitespace
//        assertFalse(ValidationUtil.isValidKm("-1"));       // negativ
//        assertFalse(ValidationUtil.isValidKm("1000000"));  // over max
//        assertFalse(ValidationUtil.isValidKm("12a3"));     // ikke tal
//    }
//
//    // --- Pris: max 6 heltalscifre + valgfri .xx (eller ,xx); null/blank accepteres ---
//    @Test
//    void price_isValidated() {
//        assertTrue(ValidationUtil.isValidPrice(null));        // tomt → ok
//        assertTrue(ValidationUtil.isValidPrice(""));          // tomt → ok
//        assertTrue(ValidationUtil.isValidPrice("123"));       // heltal
//        assertTrue(ValidationUtil.isValidPrice("123.45"));    // punktum
//        assertTrue(ValidationUtil.isValidPrice("123,45"));    // komma
//        assertTrue(ValidationUtil.isValidPrice("123456"));    // 6 cifre
//        assertTrue(ValidationUtil.isValidPrice("123456.78")); // 6 + 2 dec
//        assertFalse(ValidationUtil.isValidPrice("1234567"));  // 7 cifre
//        assertFalse(ValidationUtil.isValidPrice("12.345"));   // 3 decimaler
//        assertFalse(ValidationUtil.isValidPrice("-10"));      // negativ
//        assertFalse(ValidationUtil.isValidPrice("12x"));      // ikke tal
//    }
//}


