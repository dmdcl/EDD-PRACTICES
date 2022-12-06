/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author diego
 */
public class DoubleList {
    private Nodo  start;
    private Nodo end;
    private int cont;

    public DoubleList() { // Constructor de la clase
        this.start = null;
        this.end = null;
        this.cont = 0;
    }
    
    // Método que determina si una lista está vacía.
    public boolean empty() {
        if (start == null) { 
            return true; // La lista está vacía.
        } else {
            return false; // La lista no está vacía.
        }
    }
    
    // Método que imprime una lista
    public void printList() {
        if (empty()) {
            System.out.println("La lista está vacía.");
        } else {
            Nodo temp = start;
            // Mover a temp por cada nodo hasta llegar al final.
            while(temp != null) {
                System.out.print("[" + temp.getValor() + "] ");
                temp = temp.getNext(); // Final de la lista
            }
        }
        System.out.println("");
    }
    
    // Método que determina el número de nodos de una lista
    public int lengthList() {
        return this.cont;
    }
    
    public void clearList() {
        start = null;
        end = null;
        cont = 0;
    }
    
    // Método que agrega un nodo al final de una lista.
    public void add(int value) { // Recibo valor, creo un nodo y lo pongo en una lista.
        Nodo newNode = new Nodo(value); // Agregar valor a un nodo.
        
        // Verificar si hay nodo en la lista.
        if (start == null) { // No hay nodos en la lista.
            start = newNode; // Agregamos un nodo a la lista vacía.
            end = newNode;
        }else{ // Si tenemos nodos en la lista.
            end.setNext(newNode); // Cambiar direcciones de variables.
            newNode.setPrevious(end);
            end = newNode; // Dirección del nuevo nodo se asigna a back.                        
        }        
        cont++;
    }
    
    public void addAt(int value, int pos) throws Exception {
        
        int valueNodes = lengthList();
        Nodo newNode = new Nodo(value);
        
        if (pos < 0) { // Posiciones negativas
            throw new Exception("No se puede agregar un nodo en una posicion negativa.");
        } else if (pos >= valueNodes) { // Posiciones mayores a la cantidad de elementos
            throw new Exception("La posicion " + pos + " no es válida en la lista.");
        } else {
            if (pos == 0) { // Insertar un nodo al inicio de la lista
                newNode.setNext(start); // Conectamos el nuevo nodo al primero de la lista
                start.setPrevious(newNode); // Conectamos el que era el primer nodo al nuevo nodo                
                start = newNode;
            } else {
                Nodo temp = start;
                int cont = 0;
            
                // Mover a temp por cada nodo hasta llegar al nodo deseado
                while(cont < pos) {                    
                    temp = temp.getNext();
                    cont++;
                }
                // Conectar el nuevo nodo en la lista.                
                newNode.setNext(temp);                
                newNode.setPrevious(temp.getPrevious());                                
                temp.getPrevious().setNext(newNode);
                temp.setPrevious(newNode);
            }
            this.cont++;
        }        
        System.out.println("");
    }
    
    public void deleteAt(int pos) throws Exception{
        
        int valueNodes = lengthList(), cont = 0;       
        Nodo temp = start;
    
        if (pos < 0) { // Posiciones negativas
            throw new Exception("No se puede agregar un nodo en una posicion negativa.");
        } else if (pos >= valueNodes) { // Posiciones mayores a la cantidad de elementos
            throw new Exception("La posicion " + pos + " no es válida en la lista.");
        } else {
            if (valueNodes == 1) {
                clearList();
            } else {
                if (pos == 0) {
                    start = start.getNext();
                } else {                    
                    // Mover a temp por cada nodo hasta llegar al nodo deseado
                    while(cont < (pos - 1)) {                    
                        temp = temp.getNext();
                        cont++;
                    }                                     
                    temp.setNext(temp.getNext().getNext());
                    temp.setPrevious(temp.getPrevious());
                    if (pos == (valueNodes - 1)) { // Cantidad de nodos menos el nodo que desconectamos
                        end = temp; // Reconectar a fin
                    } 
                }
            }
            this.cont--;
        }  
        System.out.println("");
    }
    
    public int getValueAt(int pos) throws Exception {
        
        int valueNodes = lengthList(), cont = 0;
        Nodo temp = start;
        int valor = 0;
        
        if (pos < 0) { // Posiciones negativas
            throw new Exception("No se puede agregar un nodo en una posicion negativa.");
        } else if (pos >= valueNodes) { // Posiciones mayores a la cantidad de elementos
            throw new Exception("La posicion " + pos + " no es válida en la lista.");
        } else {
            // Mover a temp por cada nodo hasta llegar al nodo deseado
            while(cont < pos) {    
            temp = temp.getNext();
            cont++;
            }
            valor = temp.getValor();
            System.out.println("\nEl valor en la posicion " + pos + " es: " + valor);
        }
        return valor;
    }
}