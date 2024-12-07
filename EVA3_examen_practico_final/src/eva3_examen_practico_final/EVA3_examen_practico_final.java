/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_examen_practico_final;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA3_examen_practico_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               Scanner captu = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = captu.nextInt();
        if (numEstudiantes <= 0) {
            System.out.println("El número de estudiantes debe ser mayor a 0.");
            return;
        }
        double[] calificaciones = new double[numEstudiantes];
        for (int i = 0; i < numEstudiantes; i++) {
            double calificacion;
            do {
                System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
                calificacion = captu.nextDouble();

                if (calificacion < 0 || calificacion > 100) {
                    System.out.println("La calificación debe estar entre 0 y 100.");
                }
            } while (calificacion < 0 || calificacion > 100);

            calificaciones[i] = calificacion;
        }
        double promedio = calcularPromedio(calificaciones);
        int mayoresAlPromedio = contarCalificacionesMayores(calificaciones, promedio);
        double calificacionMaxima = obtenerCalificacionMasAlta(calificaciones);
        double calificacionMinima = obtenerCalificacionMasBaja(calificaciones);

        System.out.printf("Promedio de calificaciones: %.2f%n", promedio);
        System.out.println("Número de calificaciones mayores o iguales al promedio: " + mayoresAlPromedio);
        System.out.println("Calificación más alta: " + calificacionMaxima);
        System.out.println("Calificación más baja: " + calificacionMinima);
    }


    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
    public static int contarCalificacionesMayores(double[] calificaciones, double promedio) {
        int contador = 0;
        for (double calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }
    public static double obtenerCalificacionMasAlta(double[] calificaciones) {
        double maxima = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion > maxima) {
                maxima = calificacion;
            }
        }
        return maxima;
    }
    public static double obtenerCalificacionMasBaja(double[] calificaciones) {
        double minima = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < minima) {
                minima = calificacion;
            }
        }
        return minima;
    }
    
}
