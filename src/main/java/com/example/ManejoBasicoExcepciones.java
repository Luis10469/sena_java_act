package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        System.out.println("=== Try-Catch: División ===");

        try {
            int numerador = 10;
            int denominador = 0;

            int resultado = numerador / denominador;

            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero.");
        }
    }

    public static void ejemploTryCatchInput() {
        System.out.println("\n=== Try-Catch: Entrada de datos ===");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            System.out.println("Número ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un número entero.");
        }
    }

    public static void ejemploBloqueFinally() {
        System.out.println("\n=== Bloque Finally ===");

        try {
            System.out.println("Ejecutando bloque try...");
            int resultado = 10 / 2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error matemático.");
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }
    }

    public static void evitarCierrePrograma() {
        System.out.println("\n=== Evitar cierre del programa ===");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un entero: ");
            int numero = scanner.nextInt();

            System.out.println("Número ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. El programa continúa.");
        }

        System.out.println("El programa sigue ejecutándose normalmente.");
    }
}