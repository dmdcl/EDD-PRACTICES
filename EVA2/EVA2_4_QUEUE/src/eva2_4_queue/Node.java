/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author diego
 */
public class Node {
    private int valor;
    private Node next;
    private Node previous;

    //Por dafault, un nuevo nodo va al final de la lista
    //El final de la lista
    public Node() {
        this.next = null;
        this.previous = null;
    }

    public Node(int valor) {
        this.valor = valor;
        this.next = null;
        this.previous = null;

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
        
}