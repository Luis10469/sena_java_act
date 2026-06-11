package com.example;

public class Operadores {

    public static void demostrarAritmeticos() {
        int a = 10;
        int b = 3;

        System.out.println("=== Operadores Aritméticos ===");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
    }

    public static void demostrarIncrementoDecremento() {
        int x = 5;

        System.out.println("\n=== Incremento y Decremento ===");
        System.out.println("Valor inicial: " + x);

        System.out.println("Post-incremento (x++): " + (x++));
        System.out.println("Después de x++: " + x);

        System.out.println("Pre-incremento (++x): " + (++x));

        System.out.println("Post-decremento (x--): " + (x--));
        System.out.println("Después de x--: " + x);

        System.out.println("Pre-decremento (--x): " + (--x));
    }

    public static void demostrarRelacionales() {
        int a = 10;
        int b = 20;

        System.out.println("\n=== Operadores Relacionales ===");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }

    public static void demostrarLogicos() {
        boolean tieneLicencia = true;
        boolean tieneVehiculo = false;

        System.out.println("\n=== Operadores Lógicos ===");
        System.out.println("AND (&&): " + (tieneLicencia && tieneVehiculo));
        System.out.println("OR (||): " + (tieneLicencia || tieneVehiculo));
        System.out.println("NOT (!): " + (!tieneLicencia));
    }

    public static void demostrarAsignacionCompuesta() {
        int numero = 10;

        System.out.println("\n=== Asignación Compuesta ===");
        System.out.println("Inicial: " + numero);

        numero += 5;
        System.out.println("numero += 5 -> " + numero);

        numero -= 3;
        System.out.println("numero -= 3 -> " + numero);

        numero *= 2;
        System.out.println("numero *= 2 -> " + numero);

        numero /= 4;
        System.out.println("numero /= 4 -> " + numero);

        numero %= 3;
        System.out.println("numero %= 3 -> " + numero);
    }

    public static void demostrarOperadorTernario() {
        int edad = 20;

        String resultado = (edad >= 18)
                ? "Mayor de edad"
                : "Menor de edad";

        System.out.println("\n=== Operador Ternario ===");
        System.out.println("Edad: " + edad);
        System.out.println("Resultado: " + resultado);
    }
}