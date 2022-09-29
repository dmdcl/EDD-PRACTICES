/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_lista_simple;

/**
 *
 * @author diego
 */
public class EVA2_1_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista miLista =  new Lista();
        //int[] arreglo = new int (1000000);
        
        for (int i = 0; i < 100000; i++) { //O:(N^2)
        miLista.add(1000);
        
        }
        System.out.println("Conteo de nodos: " + miLista.lengthList());
        miLista.print();
    }
}
