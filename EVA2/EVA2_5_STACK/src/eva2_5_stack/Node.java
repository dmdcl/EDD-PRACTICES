/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_stack;

/**
 *
 * @author user
 */
public class Node {
    private int value;
    private Node next;
    private Node previous;

    //Por dafault, un nuevo nodo va al final de la lista
    //El final de la lista
    public Node() {
        this.next = null;
        this.previous = null;
    }

    public Node(int valor) {
        this.value = valor;
        this.next = null;
        this.previous = null;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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
