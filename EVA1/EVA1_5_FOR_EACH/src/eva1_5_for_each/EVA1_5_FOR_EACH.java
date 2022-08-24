/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_for_each;

/**
 *
 * @author ana31
 */
public class EVA1_5_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arregloDatos = new int [50];
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloDatos[i] = (int) (Math.random() * 100);
        }
        //for-each
        for (int arregloDato : arregloDatos) {
            System.out.println("[" + arregloDato + "]");
            
        }
    }
    
}
