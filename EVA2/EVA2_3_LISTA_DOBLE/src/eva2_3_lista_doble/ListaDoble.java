/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author diego
 */
public class ListaDoble {
    private Node  start;
    private Node end;
    private int cont;

    public ListaDoble(Node start, Node end, int cont) {
        this.start = start;
        this.end = end;
        this.cont = 0;
    }

    public void clearLista() {
        start = null;
        end = null;
    }

    public void print() {
        if (start == null) {
            System.out.println("LISTA VACIA");
        } else {
            Node temp = start;
            while (temp != null) {
                System.out.print(temp.getValor() + " - ");
                temp = temp.getNext();
            }
        }
    }
    
    public int lengthList() {
        int cont = 0;
        Node temp = start;
        while (temp != null) {
            cont++;
            temp = temp.getNext();
        }
        return cont;
    }
    
     public void addIn(int valor, int pos) throws Exception {
        int numNodos = lengthList();
        if (pos < 0) {
            throw new Exception("No es posible insertar un elemento en una posicion negativa");
        } else if (pos >= numNodos) {//Posiciones mayores a la cantidad de nodos
            throw new Exception(pos + " No es una posicion valida en la lista");
        } else {
            //Insertar al inicio de la lista
            Node newNode = new Node(valor);
            if (pos == 0) {
                newNode.setNext(start);
                start = newNode;
            } else {
                Node temp = start;
                int cont = 0;
                while (cont < (pos - 1)) {
                    temp = temp.getNext();
                    cont++;
                }
                // Y AHORA??
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);

            }
        }
    }
     
     public void add(int valor) {
        Node newNode = new Node(valor);

        if (start == null) {//No hay nodos en la lista
            start = newNode;
            end = newNode;

        } else { 
            end.setNext(newNode);
            //newNode.setNextPrevio(end);
            end = newNode;
        }
    }
     
     
}
