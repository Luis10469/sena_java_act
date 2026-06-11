package com.example;

public class ManipulacionCadenas {

    public static void demostrarConcatenacion() {
        String nombre = "Ana";
        String apellido = "García";

        String nombreCompleto = nombre + " " + apellido;

        System.out.println("=== Concatenación ===");
        System.out.println("Nombre completo: " + nombreCompleto);
    }

    public static void demostrarMetodosUtiles() {
        String texto = "  Hola Mundo  ";

        System.out.println("\n=== Métodos Útiles ===");
        System.out.println("Original: '" + texto + "'");
        System.out.println("Longitud: " + texto.length());
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("Minúsculas: " + texto.toLowerCase());
        System.out.println("Sin espacios extremos: '" + texto.trim() + "'");
        System.out.println("Contiene 'Mundo': " + texto.contains("Mundo"));
        System.out.println("Reemplazar: " + texto.replace("Mundo", "Java"));
    }

    public static void demostrarInmutabilidad() {
        String texto = "Hola";

        System.out.println("\n=== Inmutabilidad ===");
        System.out.println("Original: " + texto);

        texto.concat(" Mundo"); // No modifica la cadena original
        System.out.println("Después de concat sin asignar: " + texto);

        texto = texto.concat(" Mundo");
        System.out.println("Después de concat asignando: " + texto);
    }

    public static void usarStringBuilder() {
        StringBuilder sb = new StringBuilder();

        sb.append("Hola");
        sb.append(" ");
        sb.append("Mundo");
        sb.append("!");

        System.out.println("\n=== StringBuilder ===");
        System.out.println("Resultado: " + sb.toString());

        sb.insert(5, ",");
        System.out.println("Después de insert: " + sb);

        sb.replace(0, 4, "Saludos");
        System.out.println("Después de replace: " + sb);

        sb.deleteCharAt(sb.length() - 1);
        System.out.println("Después de deleteCharAt: " + sb);
    }
}