/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_1_lista_simple;

/**
 *
 * @author diego
 */
public class Lista {

    private Nodo start;
    private Nodo end;

    public Lista() {
        this.start = null;
        this.end = null;
    }

    public void print() {
        if (start == null) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo temp = start;
            while (temp != null) {
                System.out.print(temp.getValor() + " - ");
                temp = temp.getNext();
            }

        }
    }

    //Metodo para agregar nodo a final de la lista
    // SOLUCION  1: 0(N)
    public void add(int valor) {
        Nodo newNodo = new Nodo(valor);

        if (start == null) {//No hay nodos en la lista
            start = newNodo;
            end = newNodo;

        } else { // Existen nodos en la lista.
            /*
            Hay que movernos por la lista
            Usamos un nodo temporal hasta el ultimo nodo de la lista
             */
 /*Nodo temp = start;
            while(temp.getNext() != null){
                temp =  temp.getNext();
            }
            temp.setNext(newNodo);*/

            end.setNext(newNodo);
            end = newNodo;
        }
    }

    public int lengthList() {
        int cont = 0;
        Nodo temp = start;
        while (temp != null) {
            cont++;
            temp = temp.getNext();
        }
        return cont;
    }

    public void addIn(int valor, int pos) throws Exception {
        int numNodos = lengthList();
        //¿que debemos validar?
        //insertar en una posicion no valida Ej: -1 o posiciones no existentes.
        //posiciones negativas
        //posiciones mayores a la cantidad de elementos
        if (pos < 0) {
            throw new Exception("No es posible insertar un elemento en una posicion negativa");
        } else if (pos >= numNodos) {//Posiciones mayores a la cantidad de nodos
            throw new Exception(pos + " No es una posicion valida en la lista");
        } else {
            //Insertar al inicio de la lista
            Nodo newNodo = new Nodo(valor);
            if (pos == 0) {
                newNodo.setNext(start);
                start = newNodo;
            } else {
                Nodo temp = start;
                int cont = 0;
                while (cont < (pos - 1)) {
                    temp = temp.getNext();
                    cont++;
                }
                // Y AHORA??
                newNodo.setNext(temp.getNext());
                temp.setNext(newNodo);

            }
        }
    }

    public void deleteAt(int pos) throws Exception {
        /*int numNodos = lengthList();
        if (pos < 0) {
            throw new Exception("No es posible insertar un elemento en una posicion negativa");
        } else if (pos >= numNodos) {//Posiciones mayores a la cantidad de nodos
            throw new Exception(pos + " No es una posicion valida en la lista");
        } else {
    
        }*/
        if (start == null) {
            throw new Exception("No se encuentran elementos dentro de la lista, no es posible eliminar elementos ");
        } else {
            if (pos < 0) {
                throw new Exception("No es posible eliminar un elemento en una posicion negativa ");
            } else if (pos > lengthList()) {
                throw new Exception(pos + "No es una posicion valida en la lista ");
            } else {
                Nodo temp = start;
                int cont = 0;
                if (pos == 0) {
                    start = temp.getNext();
                } else {
                    for (int i = 1; i < pos - 1; i++) {
                        temp = temp.getNext();
                    }
                    temp.setNext(temp.getNext().getNext());
                }
            }
        }
    }

    public void clearLista() {
        start = null;
        end = null;
    }

    public boolean voidList() {
        if (start == null) {
            return true;
        } else {
            return false;
        }
    }
}
 
