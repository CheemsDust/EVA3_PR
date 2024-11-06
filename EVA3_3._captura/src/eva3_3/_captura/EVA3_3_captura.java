/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3._captura;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA3_3_captura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = capturarTexto("cual es tu nombre");
        String apellido = capturarTexto("cual es tu apellido");
            //edad
        int edad=capturaEdad("cual es tu edad");
        System.out.println("nombre"+nombre);
        System.out.println("apellido"+apellido);
     
     
    }
            //captura de texto
            public static String capturarTexto(String mensaje ){
            Scanner captu = new Scanner(System.in);
            System.out.println(mensaje);
            String texto=captu.nextLine();
            return texto;
        }
            //metodo para capturar enteros (con edad)
            public static int capturaEdad(String mensaje ){
            Scanner captu = new Scanner(System.in);
            System.out.println(mensaje);
            String texto=captu.nextLine();
        return texto;
    }
        //metodo para capturar double (captura salario)
        public static double capturaSalario(String mensaje ){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        String texto=captu.nextLine();
        return texto;
        
    }

}
