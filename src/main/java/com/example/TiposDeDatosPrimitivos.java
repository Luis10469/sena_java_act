package com.example;

public class TiposDeDatosPrimitivos {

    public static void demostrarEnteros() {
        byte edad = 25;
        short anio = 2025;
        int poblacion = 1000000;
        long distanciaEstrellas = 9460730472580L;

        System.out.println("=== Enteros ===");
        System.out.println("byte: " + edad);
        System.out.println("short: " + anio);
        System.out.println("int: " + poblacion);
        System.out.println("long: " + distanciaEstrellas);
    }

    public static void demostrarFlotantes() {
        float temperatura = 36.5f;
        double pi = 3.141592653589793;

        System.out.println("\n=== Flotantes ===");
        System.out.println("float: " + temperatura);
        System.out.println("double: " + pi);
    }

    public static void demostrarCaracteres() {
        char letra = 'A';
        char simbolo = '@';

        System.out.println("\n=== Caracteres ===");
        System.out.println("char letra: " + letra);
        System.out.println("char símbolo: " + simbolo);
    }

    public static void demostrarBooleanos() {
        boolean esJavaDivertido = true;
        boolean estaLloviendo = false;

        System.out.println("\n=== Booleanos ===");
        System.out.println("esJavaDivertido: " + esJavaDivertido);
        System.out.println("estaLloviendo: " + estaLloviendo);
    }

    public static void demostrarValoresPorDefecto() {
        System.out.println("\n=== Valores por defecto ===");
        System.out.println("Los valores por defecto solo aplican a atributos de instancia.");
        System.out.println("byte, short, int, long -> 0");
        System.out.println("float -> 0.0f");
        System.out.println("double -> 0.0");
        System.out.println("char -> '\\u0000'");
        System.out.println("boolean -> false");
    }
}