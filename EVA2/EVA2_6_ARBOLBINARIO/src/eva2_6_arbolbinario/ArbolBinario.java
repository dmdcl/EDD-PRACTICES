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
public class ArbolBinario {
private Node root;

    public ArbolBinario(Node root) {
        this.root = null;
    }

    ArbolBinario() {
    }
    
    public void add(int valor){
    if(root == null)
        root = new Node(valor);
    else
        addRecur(valor, root);
    }
    
 
    private void addRecur(int value, Node actualNode){
        Node newNode = new Node(value);
        if(value < actualNode.getValue()){ //Va a la izquierda
            if(actualNode.getRight() == null)
                actualNode.setLeft(newNode);
            else
                addRecur(value, actualNode.getLeft());
        }else if(value > actualNode.getValue()){//Va a la derecha
            if(actualNode.getRight() == null)
                actualNode.setRight(newNode);
            else
                addRecur(value, actualNode.getRight());

        }else{
            System.out.println("¡El elemento esta repetido!");
        }
    }
    

    public void inOrder(){
        inOrderRecu(root);
        System.out.println("");
    }

    private void inOrderRecu(Node node){
        if(node != null){
            inOrderRecu(node.getLeft());
            System.out.print(node.getValue() + " - ");
            inOrderRecu(node.getRight());
        }
    }
    public void preOrder(){
        preOrderRecu(root);
        System.out.println("");
    }
 
    private void preOrderRecu(Node nodo){
        if(nodo != null){
            System.out.print(nodo.getValue() + " - ");
            preOrderRecu(nodo.getLeft());
            preOrderRecu(nodo.getRight());
        }
    }

    public void posOrder(){
        posOrderRecu(root);
        System.out.println("");
    }
   
    private void posOrderRecu(Node nodo){
        if(nodo != null){
            posOrderRecu(nodo.getLeft());
            posOrderRecu(nodo.getRight());
            System.out.print(nodo.getValue() + " - ");
        }
    }
    
}