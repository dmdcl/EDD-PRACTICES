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
public class MyStack {
    private Node start;
    private Node end;
    private int cont;

    //Por default, la lista está vacía
    public MyStack() {
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
            while(temp != null){
                System.out.print(temp.getValue() + " - ");
                    temp = temp.getNext();
            }
        }
    }
    
    public int lengthList(){
        return this.cont;
    }
    
    
    public void add(int valor){
        Node newNode = new Node(valor);
        
        //Verificar si hay nodos en la lista
        if(start == null){ //No hay nodos en la lista.
            start = newNode; 
            end = newNode;
        }else{ 
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
            int cantNodes = lengthList();
            int valor = 0;
        //Posición no válida
        //Posiciones negativas
        //Posiciones mayores a la cantidad de elementos
        if(pos < 0) //Posiciones negativas
            throw new Exception("No es posible insertar un nodo en una posicion negativa");
        else if(pos >= cantNodes)//Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posición valida en la lista");
        else{
            if(pos == 0){ 
                start = start.getNext();
            }else{
                Node temp = start;
                int cont = 0;
                while(cont < pos){
                     temp = temp.getNext();
                     cont++;
                }
                valor = temp.getValue();
            }
        }
            return valor;
    }
    
    public void push(int valor){
        add(valor);
    }
    
    public Integer peek(){ 
        if(emptyList()){
            return null;
        }else{
            return end.getValue();
        }
    }
    
    public Integer pop() throws Exception{ 
        if(emptyList()){
            return null;
        }else{
            int valor = end.getValue();
            clearIn(lengthList()-1);
            return valor;
        }
    }
    
    public void addIn(int valor, int pos) throws Exception{
        int cantNodes = lengthList();
        if(pos < 0) 
            throw new Exception("No es posible insertar un nodo en una posicion negativa");
        else if(pos >= cantNodes)//Posiciones mayores a la cantidad de elementos
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
             
                newNode.setNext(temp);
                newNode.setPrevious(temp.getPrevious());
                temp.getPrevious().setNext(newNode);
                temp.setPrevious(newNode);
                System.out.println("");
            }
        }
        this.cont++;
    }
        
    }
    public void clearIn(int pos) throws Exception{
            int cantNodes = lengthList();
        //Borrar en una posición no válida
        //Posiciones negativas
        //Posiciones mayores a la cantidad de elementos
        if (pos < 0) {//Posiciones negativas
            throw new Exception("No puede borrar un nodo en una posición negativa");
        } else if (pos >= cantNodes) {//BORRAR EN POSICIONES NO VÁLIDAS
            throw new Exception(pos + " no es una posición válida");
        } else {
            if (cantNodes == 1) {//Borrar el primer nodo
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
                    Node objSig = temp.getNext();
                    Node objPrev = temp.getPrevious();
                    temp.setNext(objSig.getNext());
                    temp.setPrevious(objPrev.getPrevious());

                    if (pos == (cantNodes - 1)) {//Reconectar fin
                        end = temp;
                    }
                }
                this.cont--;
            }
        }
    }   
}