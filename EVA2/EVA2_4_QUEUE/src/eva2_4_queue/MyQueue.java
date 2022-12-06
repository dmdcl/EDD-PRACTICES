/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author diego
 */
public class MyQueue {
    private Node start;
    private Node end;
    private int cont;

    //Por default, la lista está vacía
    public MyQueue() {
        this.start = null; //No hay nodos en la lista.
        this.end = null;
        this.cont = 0;
    }
    
    public boolean emptyList(){
        if(start == null)
           return true;
        else
            return false;
    }
    
    public void print(){
        if(emptyList())
            System.out.println("La lista se encuentra vacia.");
        else{
            Node temp = start;
            while(temp != null){ //Moverse mientras el siguiente sea distinto de null
                System.out.print(temp.getValor() + " - ");
                    temp = temp.getNext();
            }
        }
    }
    
    public int lengthList(){
        return this.cont;
    }
    
    //Agregar un nodo al final de la lista
    public void add(int valor){
        Node newNode = new Node(valor);
        
        //Verificar si hay nodos en la lista
        if(start == null){ //No hay nodos en la lista.
            start = newNode; 
            end = newNode;
        }else{ //Hay nodos en la lista.
            //Hay que moverse por la lista
            //Usando un nodo tewmporal hasta el último nodo de la lista.
            end.setNext(newNode);
            newNode.setPrevious(end);
            end = newNode;
        }
        cont++;
    }
    
    public void clearList(){
        start = null;
        end = null;
        cont = 0;
    }
    
    public int getValueIn(int pos) throws Exception{
            int nodeCant = lengthList();
            int value = 0;
        //Posición no válida
        //Posiciones negativas
        //Posiciones mayores a la cantidad de elementos
        if(pos < 0) //Posiciones negativas
            throw new Exception("No se puede insertar un nodo en una posicion negativa");
        else if(pos >= nodeCant)//Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posición valida en la lista");
        else{
            if(pos == 0){ //Insetar al inicio de la lista
                start = start.getNext();
            }else{
                Node temp = start;
                int cont = 0;
                while(cont < pos){
                     temp = temp.getNext();
                     cont++;
                }
                value = temp.getValor();
            }
        }
            return value;
    }
    
    public Integer peek(){ //Peek -> Lee el primer elemento de la lista
        //Verificar si la lista está vacía
        //Si no está vacía, regresar el valor
        if(emptyList()){
            return null;
        }else{
            return start.getValor();
        }
    }
    
    public Integer poll() throws Exception{ //Poll -> Lee y elimina el primer elemento de la lista
        //Verificar si la lista está vacía
        //Si no está vacía, regresar el valor
        if(emptyList()){
            return null;
        }else{
            int valor = start.getValor();
            //Borra el nodo
            deleteIn(0);
            return valor;
        }
    }
    
    public void insertIn(int valor, int pos) throws Exception{
        int cantNodos = lengthList();
        //Insertar en una posición no válida
        //Posiciones negativas
        //Posiciones mayores a la cantidad de elementos
        if(pos < 0) //Posiciones negativas
            throw new Exception("No se puede insertar un nodo en una posicion negativa");
        else if(pos >= cantNodos)//Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posición valida en la lista");
        else{
            Node newNode = new Node(valor);
            if(pos == 0){ //Insetar al inicio de la lista
                newNode.setNext(start);
                start.setPrevious(newNode);
                start = newNode;
            }else{
                Node temp = start;
                int cont = 0;
                while(cont < pos){
                     temp = temp.getNext();
                     cont++;
                }//Hacer reconexión
                newNode.setNext(temp);
                newNode.setPrevious(temp.getPrevious());
                temp.getPrevious().setNext(newNode);
                temp.setPrevious(newNode);
                System.out.println("");
            }
        }
        this.cont++;
    }
    
    public void deleteIn(int pos) throws Exception{
            int nodeCant = lengthList();
        //Borrar en una posición no válida
        //Posiciones negativas
        //Posiciones mayores a la cantidad de elementos
        if (pos < 0) {//Posiciones negativas
            throw new Exception("No es posible borrar un nodo en una posicion negativa");
        } else if (pos >= nodeCant) {//BORRAR EN POSICIONES NO VÁLIDAS
            throw new Exception(pos + " no es una posicion valida");
        } else {
            if (nodeCant == 1) {//Borrar el primer nodo
                clearList();
            } else {
                //Borrar primer nodo (Listo)
                //Borrar el intermedio
                //Borrar el final
                if (pos == 0) {
                    start = start.getNext();
                } else {
                    Node temp = start;
                    int cont = 0;
                    while (cont < pos) {
                        temp = temp.getNext();
                        cont++;
                    }
                    Node nextObj = temp.getNext();
                    Node prevObj = temp.getPrevious();
                    temp.setNext(nextObj.getNext());
                    temp.setPrevious(prevObj.getPrevious());

                    if (pos == (nodeCant - 1)) {//Reconectar fin
                        end = temp;
                    }
                }
                this.cont--;
            }
        }
    }   
}