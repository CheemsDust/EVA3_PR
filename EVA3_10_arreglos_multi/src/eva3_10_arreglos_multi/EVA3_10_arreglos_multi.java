/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_arreglos_multi;

/**
 *
 * @author calza
 */
public class EVA3_10_arreglos_multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaración de un arreglo de 5 dimensiones
         // Declaración de un arreglo de 5 dimensiones
        int[][][][][] hipercubo = new int[3][3][3][3][3];

        // Llenado del arreglo de 5 dimensiones con valores aleatorios
        for (int i = 0; i < hipercubo.length; i++) { // primera dimensión
            for (int j = 0; j < hipercubo[i].length; j++) { // segunda dimensión
                for (int k = 0; k < hipercubo[i][j].length; k++) { // tercera dimensión
                    for (int l = 0; l < hipercubo[i][j][k].length; l++) { // cuarta dimensión
                        for (int m = 0; m < hipercubo[i][j][k][l].length; m++) { // quinta dimensión
                            hipercubo[i][j][k][l][m] = (int)(Math.random() * 100); // Asignar valor aleatorio
                        }
                    }
                }
            }
        }

        // Impresión de cada valor en el arreglo de 5 dimensiones
        for (int i = 0; i < hipercubo.length; i++) { // primera dimensión
            for (int j = 0; j < hipercubo[i].length; j++) { // segunda dimensión
                for (int k = 0; k < hipercubo[i][j].length; k++) { // tercera dimensión
                    for (int l = 0; l < hipercubo[i][j][k].length; l++) { // cuarta dimensión
                        for (int m = 0; m < hipercubo[i][j][k][l].length; m++) { // quinta dimensión
                            System.out.print("[" + hipercubo[i][j][k][l][m] + "] ");
                        }
                        System.out.println(); // Salto de línea después de la quinta dimensión
                    }
                    System.out.println(); // Salto de línea después de la cuarta dimensión
                }
                System.out.println(); // Salto de línea después de la tercera dimensión
            }
            System.out.println(); // Salto de línea después de la segunda dimensión
        }

      }
    
}
