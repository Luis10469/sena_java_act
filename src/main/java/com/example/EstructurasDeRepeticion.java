package com.example;

public class EstructurasDeRepeticion {

    public static void ejemploWhile() {
        System.out.println("=== While ===");

        int contador = 1;

        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }

    public static void ejemploDoWhile() {
        System.out.println("\n=== Do-While ===");

        int contador = 1;

        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 5);
    }

    public static void ejemploForClasico() {
        System.out.println("\n=== For Clásico ===");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void ejemploForAnidado() {
        System.out.println("\n=== For Anidado ===");

        for (int fila = 1; fila <= 3; fila++) {
            for (int columna = 1; columna <= 3; columna++) {
                System.out.print("(" + fila + "," + columna + ") ");
            }
            System.out.println();
        }
    }

    public static void ejemploBreakContinue() {
        System.out.println("\n=== Break y Continue ===");

        for (int i = 1; i <= 10; i++) {

            if (i == 3) {
                System.out.println("Se omite el número 3");
                continue;
            }

            if (i == 8) {
                System.out.println("Se detiene el ciclo en 8");
                break;
            }

            System.out.println(i);
        }
    }

    public static void ejemploEtiquetas() {
        System.out.println("\n=== Etiquetas (Labels) ===");

        externo:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {

                if (i == 2 && j == 2) {
                    System.out.println("Saliendo de ambos ciclos...");
                    break externo;
                }

                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}