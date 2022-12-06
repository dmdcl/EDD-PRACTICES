/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_arbolbinario;

/**
 *
 * @author user
 */
public class Eva2_6_ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario arbol =  new ArbolBinario();
        arbol.add(13);
        arbol.add(10);
        arbol.add(18);
        arbol.add(2);
        arbol.add(11);
        arbol.add(17);
        arbol.add(20);
        arbol.add(16);
        arbol.add(16);
        arbol.inOrder();
        arbol.preOrder();
        arbol.posOrder();
    }
    
}
