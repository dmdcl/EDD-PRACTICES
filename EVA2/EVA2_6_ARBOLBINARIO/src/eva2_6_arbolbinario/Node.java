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
public class Node {
    private int value;
    private Node right;
    private Node left;


    public Node() {
        this.right = null;
        this.left = null;
    }

    public Node(int valor) {
        this.value = valor;
        this.right = null;
        this.left = null;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
        