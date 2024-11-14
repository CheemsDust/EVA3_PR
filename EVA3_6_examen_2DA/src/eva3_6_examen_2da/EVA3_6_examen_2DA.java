/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_examen_2da;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA3_6_examen_2DA {
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERAS = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jugadaUsu;
        int jugadaCompu = generarJugadaCompu();
        int resuJugada;
        do{
        jugadaUsu = capturarJugadas ("introduce tu jugada (1- piedra, 2-papel, 3-tijeras, 0-salir)");
        jugadaCompu = generarJugadaCompu();
            System.out.println(jugadaCompu);
        resuJugada = evaluarJugada(jugadaUsu, jugadaCompu);
        }while(jugadaUsu != 0);
 
       
        System.out.println(jugadaCompu);
    }
    //pedir los datos al usuario
    public static int capturarJugadas(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int resu = captu.nextInt();
        return resu;
    }
    //generar jugada de la computadora
    public static int generarJugadaCompu(){
        int resu;
        double valor = Math.random();
        if((valor >= 0) && (valor < 0.3))
            resu = 1; //piedra
        else if((valor >= 0.3) && (valor < 0.6))
            resu = 2; //papel
        else 
            resu = 3;//tijeras
        return resu;
    }
    //evaluar jugadas 0 empate 1 gana 2 pierde
    public static int evaluarJugadas(int jugadaU, int jugadaC){
        //9 posibles combinaciones
        int resu;
        if((jugadaU == 1) && (jugadaC == 1))
            resu = 0;
        else if((jugadaU == 1) && (jugadaC == 2))
            resu = 2;
        else if((jugadaU == 1) && (jugadaC == 3))
            resu = 1;
        else if((jugadaU == 2) && (jugadaC == 1))
            resu = 1;
        else if((jugadaU == 2) && (jugadaC == 2))
            resu = 0;
        else if((jugadaU == 2) && (jugadaC == 3))
            resu = 2;
        else if((jugadaU == 3) && (jugadaC == 1))
            resu = 2;
        else if((jugadaU == 3) && (jugadaC == 2))
            resu = 1;
        else if((jugadaU == 3) && (jugadaC == 3))
            resu = 0;
        
        return resu;
    }
    
}
