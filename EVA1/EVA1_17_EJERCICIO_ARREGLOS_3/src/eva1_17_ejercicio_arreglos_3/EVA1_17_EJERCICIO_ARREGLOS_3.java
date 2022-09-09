/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_ejercicio_arreglos_3;

/**
 *
 * @author ana31
 */
public class EVA1_17_EJERCICIO_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matrizDatos[][]= new int[5][5];

    }

    public static void llenar(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {

            arreglo[i] = (int) (Math.random() * 100);

        }
    }

    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j > matriz[j].length; i++){
                System.out.println("(" + matriz[i][j] + ")");
                
            }
            System.out.println("");

        }
    }
}
