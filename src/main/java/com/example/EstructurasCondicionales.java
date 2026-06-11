package com.example;

public class EstructurasCondicionales {

    public static void ejemploIf() {
        System.out.println("=== If ===");

        int edad = 20;

        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        }
    }

    public static void ejemploIfElse() {
        System.out.println("\n=== If-Else ===");

        int numero = 7;

        if (numero % 2 == 0) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }
    }

    public static void ejemploIfElseIfElse() {
        System.out.println("\n=== If-Else If-Else ===");

        int nota = 85;

        if (nota >= 90) {
            System.out.println("Calificación: A");
        } else if (nota >= 80) {
            System.out.println("Calificación: B");
        } else if (nota >= 70) {
            System.out.println("Calificación: C");
        } else if (nota >= 60) {
            System.out.println("Calificación: D");
        } else {
            System.out.println("Calificación: F");
        }
    }

    public static void ejemploSwitch() {
        System.out.println("\n=== Switch ===");

        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Fin de semana u opción inválida");
        }
    }

    public static void ejemploSwitchExpression() {
        System.out.println("\n=== Switch Expression ===");

        int mes = 7;

        String estacion = switch (mes) {
            case 12, 1, 2 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Mes inválido";
        };

        System.out.println("Estación: " + estacion);
    }
}