/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_metodo;

import static eva3_4_metodo.EVA3_4_metodo.DiasSemana.obtenerDiaSemana;

/**
 *
 * @author calza
 */
public class EVA3_4_metodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(encontrarMayor(8, 7));
        
        System.out.println(obtenerDiaSemana(1)); // Lunes
        System.out.println(obtenerDiaSemana(2)); //martes
        System.out.println(obtenerDiaSemana(3)); //miercoles
        System.out.println(obtenerDiaSemana(4)); // Jueves
        System.out.println(obtenerDiaSemana(5)); // viernes
        System.out.println(obtenerDiaSemana(6)); // sabado
        System.out.println(obtenerDiaSemana(7)); // Domingo
    }
    //valor mas grande
    public static int encontrarMayor(int num1, int num2){
        int resu;
        if(num1 > num2)
            resu = num1;
        else
            resu = num2;
        return resu;
    }
    public class DiasSemana {

    public static String obtenerDiaSemana(int numero) {
        switch (numero) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miércoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sábado";
            case 7: return "Domingo";
            
            }
        return null;
        }
    }
}
