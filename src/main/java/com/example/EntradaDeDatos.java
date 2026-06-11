package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void leerVariosTipos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Leer varios tipos de datos ===");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Altura (metros): ");
        double altura = scanner.nextDouble();

        System.out.print("¿Es estudiante? (true/false): ");
        boolean estudiante = scanner.nextBoolean();

        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Estudiante: " + estudiante);
    }

    public static void manejarSaltoDeLineaPendiente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Manejar salto de línea pendiente ===");

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Consumir el '\n' que queda pendiente
        scanner.nextLine();

        System.out.print("Ingrese su nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.println("\nInformación ingresada:");
        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
    }
}