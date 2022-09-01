/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author ana31
 */
public class EVA1_11_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arregloCalif[][];
        //primer dimension --> grupos
        //segunda dimension --> estudiantes x grupo
        //DETERMINAR LOS GRUPOS
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce de numero de grupos: ");
        int iGpos = input.nextInt();
        arregloCalif = new int[iGpos][];
        
        //PARA CADA GRUPO: CUANTOS ESTUDIANTES NECESITAS?
        for (int i = 0; i <arregloCalif.length; i++) {
            System.out.println("Cuantos estudiantes hay en el grupo " + (i + 1));
            int iEstu = input.nextInt();
            arregloCalif[0] = new int [10];
            System.out.println(arregloCalif[i].length);
        }
    }
}