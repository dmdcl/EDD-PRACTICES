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
    
    public Lista(){
        this.start = null;
        this.end = null;
    }
    
    public void print(){
        Nodo temp = start;
        while(temp != null){
            System.out.print(temp.getValor() + " - ");
            temp =  temp.getNext();
        }
    }
    
    
    //Metodo para agregar nodo a final de la lista
    // SOLUCION  1: 0(N)
    public void add(int valor){
        Nodo newNodo = new Nodo(valor);
        
        if(start ==  null){//No hay nodos en la lista
            start = newNodo;
            end = newNodo;
             
        }else{ // Existen nodos en la lista.
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
    
    public int lengthList(){
    int cont = 0;
    Nodo temp = start;
    
    while(temp != null){
        cont++;
        temp = temp.getNext();
    }
    return cont;
    }
    

    
    public void addIn(int valor, int pos){
        //¿que debemos validar?
        //insertar en una posicion no valida Ej: -1 o posiciones no existentes.
        //posiciones negativas
        //posiciones mayores a la cantidad de elementos
        
    }
}
 
