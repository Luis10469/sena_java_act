package com.example;

public class ArreglosBidimensionales {

    public static void declararCrearMatrices() {
        System.out.println("=== Declarar y Crear Matrices ===");

        // Forma 1: inicialización directa
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Forma 2: creación con tamaño fijo
        int[][] matriz2 = new int[2][3];
        matriz2[0][0] = 10;
        matriz2[0][1] = 20;
        matriz2[0][2] = 30;
        matriz2[1][0] = 40;
        matriz2[1][1] = 50;
        matriz2[1][2] = 60;

        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);

        System.out.println("\nMatriz 2:");
        imprimirMatriz(matriz2);
    }

    public static void recorrerMatriz() {
        System.out.println("\n=== Recorrer Matriz ===");

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejemploUsosTipicos() {
        System.out.println("\n=== Usos Típicos de Matrices ===");

        // Ejemplo: tabla de multiplicar
        int[][] tabla = new int[5][5];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Tabla de multiplicar:");
        imprimirMatriz(tabla);

        // Ejemplo: recorrido de coordenadas
        System.out.println("\nCoordenadas:");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.println("(" + i + "," + j + ") = " + tabla[i][j]);
            }
        }
    }

    // Método auxiliar
    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}