/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static boolean main(String[] args) {
        // TODO code application logic here
        /*
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
        }    */  
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Cual es tu nombre?");
        String nombre = sc.nextLine();
        System.out.println("Suerte, " + nombre);
        boolean levelOne = false;
        boolean perdido = false;
        char[][] matriz = null;
        char[][] matrizMinas = null;
        int numeroMinas = 0;
        do {
            System.out.println("1.-Para eligir difilcutad");
            System.out.println("2.-Para generar el tablero");
            System.out.println("3.-Para imprimir el tablero ");
            System.out.println("4.-Para generar minas");
            System.out.println("5.-Para imprimir tablero con minas");
            System.out.println("6.-Empezamos el juego " + nombre + " , deberá introducir coordenadas");
            System.out.println("");
            System.out.println("0.-Para salir");
            System.out.println("Elija opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("1.-Para nivel principiante (8 × 8 casillas y 10 minas)");
                    System.out.println("2.-Para nivel intermedio (16 × 16 casillas y 40 minas)");
                    System.out.println("3.-Para nivel experto (16 x 30 casillas y 99 minas)");
                    int x = sc.nextInt();
                    if (x == 1) {
                        matriz = new char[8][8];
                        matrizMinas = new char[8][8];
                        numeroMinas = 10;
                    }
                    if (x == 2) {
                        matriz = new char[16][16];
                        matrizMinas = new char[16][16];
                        numeroMinas = 40;
                    }

                    if (x == 3) {
                        matriz = new char[16][36];
                        matrizMinas = new char[16][16];
                        numeroMinas = 99;
                    }
                    if ((x > 3) || (x < 0)) {
                        System.out.println("Introduciste opcion incorrecta");
                    }

                    levelOne = true;
                }
                case 2 -> {
                    if (levelOne == false) {
                        System.out.println("Debes eligir la difilcutad primero, saliendo...");
                    } else {
                        for (int i = 0; i < matriz.length; i++) {
                            for (int j = 0; j < matriz[0].length; j++) {
                                
                                matriz[i][j] = '-';
                            }
                        }
                        for (int i = 0; i < matrizMinas.length; i++) {
                            for (int j = 0; j < matrizMinas[0].length; j++) {
                                
                                matriz[i][j] = '-';
                            }
                        }
                    }
                }
                case 3 -> {
                    if (levelOne == false) {
                        System.out.println("Debes eligir la difilcutad primero, saliendo...");
                    } else {
                        for (int i = 0; i < matriz.length; i++) {
                            for (int j = 0; j < matriz[0].length; j++) {
                                if (j == 0 || j == matriz.length - 1) {
                                    if (j == 0) {
                                        System.out.print("| " + matriz[i][j]);
                                    }
                                    if (j == matriz.length - 1) {
                                        System.out.print(matriz[i][j] + " |");
                                    }
                                } else {
                                    System.out.print(" " + matriz[i][j] + " ");
                                }
                            }
                            System.out.println("");
                        }
                    }
                }
                case 4 -> {
                    int randomX = 0,
                    randomY = 0; //declaramos 2 variables que la maquina rellenará con el math random, de esta forma conseguimos rellenar el trablero de minas                    
                    boolean unaVez;
                    do {
                        for (int i = 0; i < matriz.length && numeroMinas > 0; i++) {
                            unaVez = false;
                            for (int j = 0; j < matriz[0].length && numeroMinas > 0; j++) {

                                    if (unaVez == false) {
                                        matriz[i][(int) (Math.random() * matriz[0].length)] = '@';
                                        numeroMinas--;
                                    }
                                unaVez = true;
                            }
                        }
                    } while (numeroMinas > 0);
                }
                case 5 -> {
                    if (levelOne == false) {
                        System.out.println("Debes eligir la difilcutad primero, saliendo...");
                    } else {
                        for (int i = 0; i < matrizMinas.length; i++) {
                            for (int j = 0; j < matrizMinas[0].length; j++) {

                                if (j == 0 || j == matrizMinas.length - 1) {
                                    if (j == 0) {
                                        System.out.print("| " + matrizMinas[i][j]);

                                    }
                                    if (j == matrizMinas.length - 1) {
                                        System.out.print(matrizMinas[i][j] + " |");
                                    }
                                } else {
                                    System.out.print(" " + matrizMinas[i][j] + " ");
                                }
                            }
                            System.out.println("");
                        }
                    }
                }
                case 6 -> {
                    int cordX,
                            cordY;
                    if (levelOne == false) {
                        System.out.println("Debes eligir la difilcutad primero, saliendo...");
                        break;
                    } else {
                        System.out.println("En que fila?");
                        cordX = sc.nextInt();
                        System.out.println("En que columna?");
                        cordY = sc.nextInt();
                        
                        if (matriz[cordX][cordY] == '#' || matrizMinas[cordX][cordY] == '@') {
                            if (matrizMinas[cordX][cordY] == '@') {
                                System.out.println("Hay una bomba,has perdido");
                                perdido = true;
                                return perdido;
                            }
                            if (matriz[cordX][cordY] == '#') {
                                System.out.println("Ya introduciste en esa casilla");
                            }
                        } else {
                            matriz[cordX][cordY] = '#';
                            System.out.println("No hay bomba, ahora se escribe");
                        }
                        return perdido;
                    }
                    if (perdido == true) {
                        System.out.println("Perdiste la partida.");
                        opcion = 0;
                    } else {
                        int contA1 = 0;

                        for (int i = 0; i < matriz.length; i++) {
                            for (int j = 0; j < matriz[0].length; j++) {

                                if (i == cordX - 1 && j == cordY - 1) { // A1
                                    if (matrizMinas[i - 1][j - 1] == '@') { // 1
                                        contA1++;
                                    } else {
                                    }
                                } else {

                                }
                                if (matrizMinas[i - 1][j] >= 0 || matrizMinas[i - 1][j] <= matrizMinas.length) {
                                    if (matrizMinas[i - 1][j] == '@') { // 1
                                        contA1++;
                                    }
                                } else {

                                }
                                if (matrizMinas[i - 1][j + 1] >= 0 || matrizMinas[i - 1][j + 1] <= matrizMinas.length) {
                                    if (matrizMinas[i - 1][j + 1] == '@') { // 1
                                        contA1++;
                                        if (matrizMinas[i - 1][j - 1] >= 0 || matrizMinas[i - 1][j - 1] <= matrizMinas.length) {
                                        }
                                    } else {

                                    }
                                    ////////////////////////////////////////////
                                    if (matrizMinas[i][j - 1] >= 0 || matrizMinas[i][j - 1] <= matrizMinas.length) {
                                        if (matrizMinas[i][j - 1] == '@') { // 2
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    if (matrizMinas[i][j] >= 0 || matrizMinas[i][j] <= matrizMinas.length) {
                                        if (matrizMinas[i][j] == '@') { // 2
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    if (matrizMinas[i][j + 1] >= 0 || matrizMinas[i][j + 1] <= matrizMinas.length) {
                                        if (matrizMinas[i][j + 1] == '@') { // 2
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    ////////////////////////////////////////////
                                    if (matrizMinas[i + 1][j - 1] >= 0 || matrizMinas[i + 1][j - 1] <= matrizMinas.length) {
                                        if (matrizMinas[i + 1][j - 1] == '@') { // 3
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    if (matrizMinas[i + 1][j] >= 0 || matrizMinas[i + 1][j] <= matrizMinas.length) {
                                        if (matrizMinas[i + 1][j] == '@') { // 3
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    if (matrizMinas[i + 1][j + 1] >= 0 || matrizMinas[i + 1][j + 1] <= matrizMinas.length) {
                                        if (matrizMinas[i + 1][j + 1] == '@') { // 3
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    //Transformacion ASCII llamada metodo , dentro de un metodo...
                                    matriz[cordX - 1][cordY - 1] = (char) transformacionAscii(contA1);
                                }
                                ///////////////////////////////////////////////////////////////////////////////////////
                                contA1 = 0; //reiniciamos contador...
                                if (i == cordX - 1 && j == cordY) { // B1
                                    if (matrizMinas[i - 1][j - 1] >= 0 || matrizMinas[i - 1][j - 1] <= matrizMinas.length) {
                                        if (matrizMinas[i - 1][j - 1] == '@') { // 1
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    if (matrizMinas[i - 1][j] >= 0 || matrizMinas[i - 1][j] <= matrizMinas.length) {
                                        if (matrizMinas[i - 1][j] == '@') { // 1
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    if (matrizMinas[i - 1][j + 1] >= 0 || matrizMinas[i - 1][j + 1] <= matrizMinas.length) {
                                        if (matrizMinas[i - 1][j + 1] == '@') { // 1
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    ////////////////////////////////////////////
                                    if (matrizMinas[i][j - 1] >= 0 || matrizMinas[i][j - 1] <= matrizMinas.length) {
                                        if (matrizMinas[i][j - 1] == '@') { // 2
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    if (matrizMinas[i][j] >= 0 || matrizMinas[i][j] <= matrizMinas.length) {
                                        if (matrizMinas[i][j] == '@') { // 2
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    if (matrizMinas[i][j + 1] >= 0 || matrizMinas[i][j + 1] <= matrizMinas.length) {
                                        if (matrizMinas[i][j + 1] == '@') { // 2
                                            contA1++;
                                        }
                                    } else {
                                    }
                                    ////////////////////////////////////////////
                                    if (matrizMinas[i + 1][j - 1] >= 0 || matrizMinas[i + 1][j - 1] <= matrizMinas.length) {
                                        if (matrizMinas[i + 1][j - 1] == '@') { // 3
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    if (matrizMinas[i + 1][j] >= 0 || matrizMinas[i + 1][j] <= matrizMinas.length) {
                                        if (matrizMinas[i + 1][j] == '@') { // 3
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    if (matrizMinas[i + 1][j + 1] >= 0 || matrizMinas[i + 1][j + 1] <= matrizMinas.length) {
                                        if (matrizMinas[i + 1][j + 1] == '@') { // 3
                                            contA1++;
                                        }
                                    } else {

                                    }
                                    //Transformacion ASCII llamada metodo , dentro de un metodo...
                                    matriz[cordX - 1][cordY] = (char) transformacionAscii(contA1);
                                    
                                }

                            }
                        }
                        
                        for (int i = 0; i < matriz.length; i++) {
                            for (int j = 0; j < matriz[0].length; j++) {
                                if (j == 0 || j == matriz.length - 1) {
                                    if (j == 0) {
                                        System.out.print("| " + matriz[i][j]);
                                    }
                                    if (j == matriz.length - 1) {
                                        System.out.print(matriz[i][j] + " |");
                                    }
                                } else {
                                    System.out.print(" " + matriz[i][j] + " ");
                                }
                            }
                            System.out.println("");
                        }
                    }
                }
            }
        } while (opcion != 0);
            
        
    }   
}

    
