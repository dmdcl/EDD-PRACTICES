/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_arbolbinario;

/**
 *
 * @author saeol
 */
public class ArbolBinario {

    private Nodo root;

    public ArbolBinario(Nodo root) {
        this.root = null;
    }

    //Méotdo público para el usuario
    public void agregar(int valor) {
        //1 que el nodo recibido es null
        //arbol vacio
        if (root == null) {
            root = new Nodo(valor);
        } else {
            agregarRecur(valor, root);
        }
        agregarRecur(valor, root);
    }

    //Méotdo recursivo agregar
    //Necesita el valor y el nodo actual
    private void agregarRecur(int valor, Nodo nodoActual) {
        Nodo nuevo = new Nodo();
        //2 decidir si va a izq o der 
        /*
        Verificar si el lado (nodo es null 
        si es null. ahi va el valor
        si no
        repetir recursion
         */
        if (valor < nodoActual.getValor()) {// va a la izq
            if(nodoActual.getIzquierda() == null)
                nodoActual.setIzquierda(nuevo);
            else
                agregarRecur(valor, nodoActual.getIzquierda());

        } else if (valor > nodoActual.getValor()) {//va a la derech
             if(nodoActual.getDerecha() == null)
                nodoActual.setDerecha(nuevo);
            else
                agregarRecur(valor, nodoActual.getDerecha());


        } else {//igual
            System.out.println("NUMERO REPETIDO");

        }

    }

}
