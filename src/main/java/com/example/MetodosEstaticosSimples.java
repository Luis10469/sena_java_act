package com.example;

public class MetodosEstaticosSimples {

    public static void ejemploDeclaracionLlamada() {
        System.out.println("Ejemplo de declaración y llamada de un método estático.");
    }

    public static void ejemploPasoParametros(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static int ejemploRetornoValores() {
        int a = 10;
        int b = 20;
        return a + b;
    }

    public static void ejemploSobrecarga() {
        System.out.println("Método sobrecargado sin parámetros.");
    }

    public static void ejemploSobrecarga(int n) {
        System.out.println("Método sobrecargado con parámetro: " + n);
    }
}