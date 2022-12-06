/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author diego
 */
public class Nodo {
    private int valor;
    private Nodo next;
    private Nodo previous;
    
    //Por default, un nuevo nodo va al final de la lista
    //El final de la lista se indica con null
    // Es por ello que siguiente = null.
    public Nodo(){
        this.next = null;
        this.previous = null;
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

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }
    
    
}


