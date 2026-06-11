package com.example;

public class ConversionDeTipos {

    public static void demostrarCastingImplicitito() {
        System.out.println("=== Casting Implícito (Widening) ===");

        int numeroEntero = 100;
        double numeroDecimal = numeroEntero; // int -> double

        System.out.println("int original: " + numeroEntero);
        System.out.println("double convertido: " + numeroDecimal);
    }

    public static void demostrarCastingExplicito() {
        System.out.println("\n=== Casting Explícito (Narrowing) ===");

        double numeroDecimal = 99.99;
        int numeroEntero = (int) numeroDecimal; // double -> int

        System.out.println("double original: " + numeroDecimal);
        System.out.println("int convertido: " + numeroEntero);

        long numeroGrande = 1000L;
        short numeroCorto = (short) numeroGrande;

        System.out.println("long original: " + numeroGrande);
        System.out.println("short convertido: " + numeroCorto);
    }

    public static void demostrarProblemasDePrecision() {
        System.out.println("\n=== Problemas de Precisión ===");

        double a = 0.1;
        double b = 0.2;
        double suma = a + b;

        System.out.println("0.1 + 0.2 = " + suma);

        int grande = 130;
        byte pequeno = (byte) grande;

        System.out.println("int original: " + grande);
        System.out.println("byte convertido: " + pequeno);
        System.out.println("Se produjo desbordamiento (overflow).");
    }
}