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
    
        
    public int[] iniciarVec(int[] vector){
       // Scanner sc = new Scanner(System.in);
        int vec[] = vector;
        for(int i = 0; i<=vec.length-1;i++){
            vec[i]=i;
        }
        return vec;
    }
    public String mostrarVec(int[] vec){
        String frase= "";
        for(int i = 0; i<=vec.length-1;i++){
            frase = frase + vec[i] +", ";
        }
        return frase;
    }
    //Sintaxis de una matriz int mat[][] new mat[2][3];
    public int[][] iniciarMat(int[][] matriz,int filas, int colum){
        int mat[][] = matriz;
        
        for(int i = 0; i<filas;i++){
            for(int j = 0; j<colum;j++){
                mat[i][j]=(j+i);
            }
        }
        return mat;
    }
    
}
