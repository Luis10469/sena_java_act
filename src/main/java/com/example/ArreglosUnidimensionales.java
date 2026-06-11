package com.example;

import java.util.Arrays;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar() {
        System.out.println("=== Declarar, Crear e Inicializar ===");

        // Forma 1: declaración e inicialización
        int[] numeros = {10, 20, 30, 40, 50};

        // Forma 2: declaración y creación separadas
        String[] nombres = new String[3];
        nombres[0] = "Ana";
        nombres[1] = "Luis";
        nombres[2] = "Carlos";

        System.out.println("Números: " + Arrays.toString(numeros));
        System.out.println("Nombres: " + Arrays.toString(nombres));
    }

    public static void mostrarLongitud() {
        System.out.println("\n=== Longitud del Arreglo ===");

        int[] numeros = {5, 10, 15, 20};

        System.out.println("Arreglo: " + Arrays.toString(numeros));
        System.out.println("Longitud: " + numeros.length);
    }

    public static void recorrerConForClasico() {
        System.out.println("\n=== Recorrer con For Clásico ===");

        int[] numeros = {10, 20, 30, 40, 50};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
    }

    public static void recorrerConForEach() {
        System.out.println("\n=== Recorrer con For-Each ===");

        int[] numeros = {10, 20, 30, 40, 50};

        for (int numero : numeros) {
            System.out.println("Valor: " + numero);
        }
    }

    public static int[] arrayComoParametroYRetorno(int[] array) {
        System.out.println("\n=== Array como Parámetro y Retorno ===");

        // Duplicar cada elemento
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }

        return array;
    }
}