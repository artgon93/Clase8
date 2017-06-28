/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Clase8 {
    
    
    int vec[] = new int[5];
    
        
    public void iniciarVec(){
        Scanner sc = new Scanner(System.in);        
        for(int i = 0; i<5;i++){
            System.out.println("Digite un número");
            vec[i] = sc.nextInt();
        }
        System.out.println("El numero en la posicion 5 es: "+vec[4]);
    }
    
}
