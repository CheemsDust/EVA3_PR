/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_metodos_arreglos;

/**
 *
 * @author calza
 */
public class EVA3_5_metodos_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diasSemana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        imprimirArreglo(diasSemana);
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviemebre", "diciembre"};
        imprimirArreglo(meses);
        int billetes[] = {20 , 50, 100, 200, 500, 1000};
        imprimirBilletes(billetes);
    }
    
    public static void imprimirArreglo(String[] arreglo){
        for(int i = 0; i < arreglo.length; i++)
           System.out.println(arreglo[i]); 
    }
    public static void imprimirBilletes(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        } 
    }
}
