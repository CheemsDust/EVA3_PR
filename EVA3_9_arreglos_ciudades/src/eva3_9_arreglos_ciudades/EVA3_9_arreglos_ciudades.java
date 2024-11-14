/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_arreglos_ciudades;

/**
 *
 * @author calza
 */
public class EVA3_9_arreglos_ciudades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] ciudades = {{"Aguascalientes", "calvillo", "jesus maria"},
            {"ensenada", "mexicali", "tecate", "tijuana"},
            {"la paz", "cabo san lucas", "san jose"}};
            
        System.out.println(ciudades[0].length);
        for (int i = 0; i < ciudades.length; i++) {
            for (int j = 0; j < ciudades[i].length; j++) {
                System.out.println(ciudades[i][j]);
            }
            
        }
    }
    
}
