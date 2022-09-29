/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_1_lista_simple;

/**
 *
 * @author diego
 */
public class Nodo {
    private int valor;
    private Nodo next;
    
    //Por default, un nuevo nodo va al final de la lista
    //El final de la lista se indica con null
    // Es por ello que siguiente = null.
    public Nodo(){
        this.next = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.next = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next =  next;
    }
    
}

