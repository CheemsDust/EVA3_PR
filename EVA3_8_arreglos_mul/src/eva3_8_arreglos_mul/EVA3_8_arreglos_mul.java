/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_arreglos_mul;

/**
 *
 * @author calza
 */
public class EVA3_8_arreglos_mul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][][] cubo = new int [10][10][10];
        System.out.println(cubo.length);
        System.out.println(cubo[1].length);
        System.out.println(cubo[0][0].length);
        for (int i = 0; i < cubo.length; i++) {//primer dimensopn
            for (int j = 0; j < cubo[i].length; j++) {//segunada dimension 
                for (int k = 0; k < cubo[i][j].length; k++) {// tercera dimension 
                  
                   cubo [i][j][k]=(int)(Math.random()*100);//esto es un casting le quita el valor de punto decimal al Math
                }
            }
        }
      for (int i = 0; i < cubo.length; i++) {//primer dimensopn
            for (int j = 0; j < cubo[i].length; j++) {//segunada dimension 
                for (int k = 0; k < cubo[i][j].length; k++) {// tercera dimension 
                     System.out.println("["+ cubo [i][j][k]+"]"); 
                  
                }
            }
        }
    }
    
}
