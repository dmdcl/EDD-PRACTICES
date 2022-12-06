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
    private Nodo  start; 
    private Nodo end; 
    private int cont;
    
    
    public Lista(){
        this.start = null; // No existen nodos en la lista.
        this.end = null;
        this.cont = 0; // No hay nodos en la lista.
    }
    
    // Método que determina si una lista está vacía.
    public boolean emptyList() {
        if (start == null) { 
            return true; // La lista está vacía.
        } else {
            return false; // La lista no está vacía.
        }
    }
    
    // Método que imprime una lista
    public void printList() {
        if (emptyList()) {
            System.out.println("The list is empty.");
        } else {
            Nodo temp = start;
            // Mover a temp por cada nodo hasta llegar al final.
            while(temp != null) {
                System.out.print("[" + temp.getValue() + "] ");
                temp = temp.getNext(); // Final de la lista
            }
        }
        System.out.println("");
    }
        
    // Método que agrega un nodo al final de una lista.
    // Solución 1: O(N)
    public void add(int value) { // Recibo valor, creo un nodo y lo pongo en una lista.
        Nodo newNode = new Nodo(value); // Agregar valor a un nodo.
        
        // Verificar si hay nodo en la lista.
        if (start == null) { // No hay nodos en la lista.
            start = newNode; // Agregamos un nodo a la lista vacía.
            end = newNode; // front y back se conectan al nuevo nodo.
        }else{ // Si tenemos nodos en la lista.
            /*
            // Tenemos que movernos por cada nodo hasta
            // llegar al final de la lista (último nodo) .                       
            Nodo temp = front;
            
            // Mover a temp por cada nodo hasta llegar al final.
            while(temp.getNext() != null) {
                temp = temp.getNext(); // Final de la lista.
            }
            
            // Agregar un nuevo nodo al final de la lista.
            temp.setNext(newNode); */
                        
            end.setNext(newNode); // Cambiar direcciones de variables.
            end = newNode; // Dirección del nuevo nodo se asigna a back.                                   
        }
        cont++;
    }
    
    public int lengthList() {
        
        /*
        Cada vez que agreguemos o quitemos un nodo, debemos
        incrementar o decrementar.
        */
        
        /* 
        int cont = 0; // Contador
        Nodo temp = front;
            
        // Mover a temp por cada nodo hasta llegar al final
        while(temp != null) {
            cont++;
            temp = temp.getNext(); // Final de la lista
        } */
        return this.cont;
    }
    
    public void addAt(int valor, int pos) throws Exception {
        
        int valueNodes = lengthList();
        Nodo newNode = new Nodo(valor);
        
        /* 
        Debemos validar:
        - Insertar en una posición no válida
        - Posicones negativas
        - Posiciones mayores a la cantidad de elementos
        */
                
        if (pos < 0) { // Posiciones negativas
            throw new Exception("You cant add a node at a negative position.");
        } else if (pos >= valueNodes) { // Posiciones mayores a la cantidad de elementos
            throw new Exception("The position " + pos + " is not valid on the list.");
        } else {
            if (pos == 0) { // Insertar un nodo al inicio de la lista                
                newNode.setNext(start);
                start = newNode;
            } else {
                Nodo temp = start;
                int cont = 0;
            
                // Mover a temp por cada nodo hasta llegar al nodo deseado
                while(cont < (pos - 1)) {                    
                    temp = temp.getNext();
                    cont++;
                }                                           
                // Conectar el nuevo nodo en la lista.
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
            }
            this.cont++;
        }        
    }
    
    public void clearList() {
        start = null;
        end = null;
        cont = 0;
    }
    
    public void deleteAt(int pos) throws Exception{
        
        int valueNodes = lengthList(), cont = 0;       
        Nodo newNode = new Nodo();
        Nodo temp = start;
        
        /* 
        Debemos validar:
        - Insertar en una posición no válida
        - Posicones negativas
        - Posiciones mayores a la cantidad de elementos
        */
                
        if (pos < 0) { // Posiciones negativas
            throw new Exception("You cant add a node at a negative position.");
        } else if (pos >= valueNodes) { // Posiciones mayores a la cantidad de elementos
            throw new Exception("The position " + pos + " is not valid on the list.");
        } else {
            if (valueNodes == 1) {
                clearList();
            } else {
            /*
            Borrar el primer nodo
            Borrar el nodo intermedio
            Borrar el último nodo
            */
                if (pos == 0) {
                    start = start.getNext();
                } else {                    
                    // Mover a temp por cada nodo hasta llegar al nodo deseado
                    while(cont < (pos - 1)) {                    
                    temp = temp.getNext();
                    cont++;
                    }
                    // Legibilidad en el código
                    Nodo objNext = temp.getNext();
                    temp.setNext(objNext.getNext());
                                        
                    /*
                    "." Operador de resferenciación.
                    Llamada a función -> Valor que regresa
                    */
                    if (pos == (valueNodes - 1)) { // Cantidad de nodos menos el nodo que desconectamos
                        end = temp; // Reconectar a fin
                    }
                }
            }
            this.cont--;
        }        
    }
       
    public int getValueAt(int pos) throws Exception {
        
        int valueNodes = lengthList(), cont = 0, valor = 0;
        Nodo temp = start;
        
        if (pos < 0) { // Posiciones negativas
            throw new Exception("You cant add a node at a negative position.");
        } else if (pos >= valueNodes) { // Posiciones mayores a la cantidad de elementos
            throw new Exception("The position " + pos + " is not valid on the list.");
        } else {
            // Mover a temp por cada nodo hasta llegar al nodo deseado
            while(cont < pos) {    
            temp = temp.getNext();
            cont++;
            }
            valor = temp.getValue();
            System.out.println("The value on the position " + pos + " is: " + valor);
        }
        return valor;
    }
}