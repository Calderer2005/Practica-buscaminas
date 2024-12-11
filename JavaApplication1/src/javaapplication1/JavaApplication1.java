/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author EAG
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor indique el grado de dificultad:");
        System.out.print("1] Principiante (8x8 casillas y 10 bombas),\n2] Intermedio (16x16 casillas y 40 bombas),\n3] Experto (16x30 casillas y 99 bombas),\n4] Personalizado ( usted indica el tamaño y la cantidad de las bombas).\n>");
        
        int op = sc.nextInt();
        //mathrandom math.random()*max-0;
        switch (op) {
            case 1  :
                    int filas = 8;
                    int colum = 8;
                    
                    Random ale  = new Random();
                    
                    int[][] plantilla = new int[filas][colum];
                    
                    for(int i = 0; i < filas; i++){
                        for(int j = 0; j < colum; j++){
                           plantilla[i][j]=ale.nextInt(1)-0;
                        }
                    }
                    
                    String imprimir = "";
                    for(int i = 0; i < filas; i++){
                        for(int j = 0; j < colum; j++){
                            imprimir = imprimir+"| "+plantilla[i][j];
                        }
                        imprimir=imprimir+" |\n";
                    }System.out.println(imprimir);
                    break;


            case 2  :
                     
                    break;
            case 3  :
                                          
                    break;
            case 4  :
                                             
                    break;
                    
        }            
    }
    
}
