package clase8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Semana8 {
    
    public static void main(String[] args) {
       
        Clase8 clase1 = new Clase8();
        int vec[] = new int[10];
        vec = clase1.iniciarVec(vec);
        System.out.println(clase1.mostrarVec(vec));
        
        int mat[][] = new int[10][10];
        mat = clase1.iniciarMat(mat, 5, 5);
        System.out.println("");
    }
}
