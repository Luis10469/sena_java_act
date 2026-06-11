package com.example;

public class VariablesYConstantes {
    
    /**
     * Demuestra la declaración y asignación de variables en Java
     */
    public static void demostrarDeclaracionAsignacion() {
        System.out.println("=== DEMOSTRACIÓN: Declaración y Asignación de Variables ===\n");
        
        // Declaración de variables (sin inicializar)
        int edad;
        double altura;
        String nombre;
        boolean esActivo;
        
        // Asignación de valores
        edad = 25;
        altura = 1.75;
        nombre = "Juan Pérez";
        esActivo = true;
        
        System.out.println("Variables declaradas y luego asignadas:");
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Nombre: " + nombre);
        System.out.println("Activo: " + esActivo);
        
        System.out.println("\n---\n");
        
        // Declaración e inicialización en una sola línea
        int contador = 0;
        double temperatura = 36.5;
        String ciudad = "Bogotá";
        boolean completado = false;
        
        System.out.println("Variables declaradas e inicializadas juntas:");
        System.out.println("Contador: " + contador);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Completado: " + completado);
        
        System.out.println("\n---\n");
        
        // Múltiples variables del mismo tipo
        int a = 10, b = 20, c = 30;
        System.out.println("Múltiples variables en una línea: a=" + a + ", b=" + b + ", c=" + c);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    /**
     * Demuestra las convenciones de nombres en Java
     */
    public static void demostrarConvencionesNombres() {
        System.out.println("=== DEMOSTRACIÓN: Convenciones de Nombres en Java ===\n");
        
        // 1. Variables y métodos: camelCase (empiezan con minúscula)
        System.out.println("1. camelCase para variables y métodos:");
        int numeroDeEstudiantes = 30;
        String nombreCompleto = "María García";
        double precioDelProducto = 99.99;
        
        System.out.println("   - numeroDeEstudiantes: " + numeroDeEstudiantes);
        System.out.println("   - nombreCompleto: " + nombreCompleto);
        System.out.println("   - precioDelProducto: " + precioDelProducto);
        
        System.out.println("\n2. PascalCase para clases e interfaces:");
        System.out.println("   - class VariablesYConstantes");
        System.out.println("   - class MiPrimeraClase");
        System.out.println("   - interface Runnable");
        
        System.out.println("\n3. UPPER_SNAKE_CASE para constantes (con final):");
        final int MAXIMO_INTENTOS = 3;
        final double PI = 3.14159;
        final String MENSAJE_BIENVENIDA = "Hola Mundo";
        
        System.out.println("   - MAXIMO_INTENTOS: " + MAXIMO_INTENTOS);
        System.out.println("   - PI: " + PI);
        System.out.println("   - MENSAJE_BIENVENIDA: " + MENSAJE_BIENVENIDA);
        
        System.out.println("\n4. Nombres descriptivos y significativos:");
        // Mal ejemplo:
        int x = 5; // ¿qué representa x?
        
        // Buen ejemplo:
        int horasTrabajadas = 40;
        double salarioPorHora = 15.5;
        double salarioTotal = horasTrabajadas * salarioPorHora;
        
        System.out.println("   - horasTrabajadas = " + horasTrabajadas);
        System.out.println("   - salarioPorHora = " + salarioPorHora);
        System.out.println("   - salarioTotal = " + salarioTotal);
        
        System.out.println("\n5. Reglas adicionales:");
        System.out.println("   ✓ Los nombres pueden contener letras, dígitos, _ y $");
        System.out.println("   ✓ No pueden empezar con números");
        System.out.println("   ✓ No son palabras reservadas (int, class, public, etc.)");
        System.out.println("   ✓ Son case-sensitive (edad != Edad)");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    /**
     * Demuestra el uso de constantes en Java
     */
    public static void demostrarConstantes() {
        System.out.println("=== DEMOSTRACIÓN: Constantes en Java ===\n");
        
        // Constantes se declaran con 'final'
        // Convención: nombres en MAYÚSCULAS con guiones bajos
        
        // Constantes primitivas
        final double GRAVEDAD = 9.81;
        final int DIAS_SEMANA = 7;
        final boolean ACTIVO_POR_DEFECTO = true;
        
        System.out.println("Constantes primitivas:");
        System.out.println("GRAVEDAD = " + GRAVEDAD + " m/s²");
        System.out.println("DIAS_SEMANA = " + DIAS_SEMANA);
        System.out.println("ACTIVO_POR_DEFECTO = " + ACTIVO_POR_DEFECTO);
        
        System.out.println("\n---\n");
        
        // Constantes de tipo String
        final String NOMBRE_APLICACION = "MiApp";
        final String VERSION = "1.0.0";
        final String URL_API = "https://api.miapp.com";
        
        System.out.println("Constantes String:");
        System.out.println("NOMBRE_APLICACION = " + NOMBRE_APLICACION);
        System.out.println("VERSION = " + VERSION);
        System.out.println("URL_API = " + URL_API);
        
        System.out.println("\n---\n");
        
        // Demostración de que las constantes NO se pueden modificar
        final int LIMITE = 100;
        System.out.println("Constante LIMITE = " + LIMITE);
        System.out.println("Si intentamos modificar LIMITE = 200, causaría error de compilación");
        // LIMITE = 200; // ❌ Esto causaría error: cannot assign a value to final variable
        
        System.out.println("\n---\n");
        
        // Constantes de clase (static final)
        System.out.println("Constantes de clase (static final):");
        System.out.println("Math.PI = " + Math.PI);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        
        System.out.println("\n---\n");
        
        // Ejemplo práctico con constantes
        System.out.println("Ejemplo práctico: Cálculo del perímetro de un círculo");
        final double RADIO = 5.0;
        // Usando Math.PI (constante de la clase Math)
        double perimetro = 2 * Math.PI * RADIO;
        double area = Math.PI * RADIO * RADIO;
        
        System.out.printf("Radio: %.2f%n", RADIO);
        System.out.printf("Perímetro: 2 * π * %.2f = %.2f%n", RADIO, perimetro);
        System.out.printf("Área: π * %.2f² = %.2f%n", RADIO, area);
        
        System.out.println("\n" + "=".repeat(50));
    }
    
    // Método main para probar todos los métodos
    public static void main(String[] args) {
        demostrarDeclaracionAsignacion();
        demostrarConvencionesNombres();
        demostrarConstantes();
    }
}