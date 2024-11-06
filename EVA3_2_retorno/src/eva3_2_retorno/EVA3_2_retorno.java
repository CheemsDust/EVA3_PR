/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_retorno;

/**
 *
 * @author calza
 */
public class EVA3_2_retorno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //necesitamos rrecuperar el valor, para hacer algo con el
        int resu;
        resu = sumarDosNumeros(5 , 10);
        System.out.println("Resultado = " + resu);
        //no les interesa el resultado
    }
    
    public static int sumarDosNumeros(int num1, int num2){
        return num1 + num2;
    }
}
