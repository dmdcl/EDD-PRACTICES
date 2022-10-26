/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_stack;

/**
 *
 * @author saeol
 */
public class MyStack {
     private Nodo inicio;
    private Nodo fin;
    private int cont;

    //Por default, la lista está vacía
    public MyStack() {
        this.inicio = null; //No hay nodos en la lista.
        this.fin = null;
        this.cont = 0;
    }
    
    public boolean listaVacia(){
        if(inicio == null)
           return true;
        else
            return false;
    }
    
    public void imprimir(){
        if(listaVacia())
            System.out.println("La lista está vacía.");
        else{
            Nodo temp = inicio;
            while(temp != null){ //Moverse mientras el siguiente sea distinto de null
                System.out.print(temp.getValor() + " - ");
                    temp = temp.getSiguiente();
            }
        }
    }
    
    public int tamaLista(){
        return this.cont;
    }
    
    //Agregar un nodo al final de la lista
    public void agregar(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        
        //Verificar si hay nodos en la lista
        if(inicio == null){ //No hay nodos en la lista.
            inicio = nuevoNodo; 
            fin = nuevoNodo;
        }else{ //Hay nodos en la lista.
            //Hay que moverse por la lista
            //Usando un nodo tewmporal hasta el último nodo de la lista.
            fin.setSiguiente(nuevoNodo);
            nuevoNodo.setPrevio(fin);
            fin = nuevoNodo;
        }
        cont++;
    }
    
    public void vaciarLista(){
        inicio = null;
        fin = null;
        cont = 0;
    }
    
    public int obtenerValorEn(int pos) throws Exception{
            int cantNodos = tamaLista();
            int valor = 0;
        //Posición no válida
        //Posiciones negativas
        //Posiciones mayores a la cantidad de elementos
        if(pos < 0) //Posiciones negativas
            throw new Exception("No puede insertarse un nodo en una posición negativa");
        else if(pos >= cantNodos)//Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posición valida en la lista");
        else{
            if(pos == 0){ //Insetar al inicio de la lista
                inicio = inicio.getSiguiente();
            }else{
                Nodo temp = inicio;
                int cont = 0;
                while(cont < pos){
                     temp = temp.getSiguiente();
                     cont++;
                }
                valor = temp.getValor();
            }
        }
            return valor;
    }
    
    public void push(int valor){
        agregar(valor);
    }
    
    public Integer peek(){ //Peek -> Lee el elemento en la cima
        //Verificar si la lista está vacía
        //Si no está vacía, regresar el valor
        if(listaVacia()){
            return null;
        }else{
            return fin.getValor();
        }
    }
    
    public Integer pop() throws Exception{ //Pop -> Lee y borra el elemento en la cima
        //Verificar si la lista está vacía
        //Si no está vacía, regresar el valor
        if(listaVacia()){
            return null;
        }else{
            int valor = fin.getValor();
            //Borra el último nodo de la pila
            borrarEn(tamaLista()-1);
            return valor;
        }
    }
    
    public void insertarEn(int valor, int pos) throws Exception{
        int cantNodos = tamaLista();
        //Insertar en una posición no válida
        //Posiciones negativas
        //Posiciones mayores a la cantidad de elementos
        if(pos < 0) //Posiciones negativas
            throw new Exception("No puede insertarse un nodo en una posición negativa");
        else if(pos >= cantNodos)//Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posición valida en la lista");
        else{
            Nodo nuevoNodo = new Nodo(valor);
            if(pos == 0){ //Insetar al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio.setPrevio(nuevoNodo);
                inicio = nuevoNodo;
            }else{
                Nodo temp = inicio;
                int cont = 0;
                while(cont < pos){
                     temp = temp.getSiguiente();
                     cont++;
                }//Hacer reconexión
                nuevoNodo.setSiguiente(temp);
                nuevoNodo.setPrevio(temp.getPrevio());
                temp.getPrevio().setSiguiente(nuevoNodo);
                temp.setPrevio(nuevoNodo);
                System.out.println("");
            }
        }
        this.cont++;
    }
    
    public void borrarEn(int pos) throws Exception{
            int cantNodos = tamaLista();
        //Borrar en una posición no válida
        //Posiciones negativas
        //Posiciones mayores a la cantidad de elementos
        if (pos < 0) {//Posiciones negativas
            throw new Exception("No puede borrar un nodo en una posición negativa");
        } else if (pos >= cantNodos) {//BORRAR EN POSICIONES NO VÁLIDAS
            throw new Exception(pos + " no es una posición válida");
        } else {
            if (cantNodos == 1) {//Borrar el primer nodo
                vaciarLista();
            } else {
                //Borrar primer nodo (Listo)
                //Borrar el intermedio
                //Borrar el final
                if (pos == 0) {
                    inicio = inicio.getSiguiente();
                } else {
                    Nodo temp = inicio;
                    int cont = 0;
                    while (cont < pos) {
                        temp = temp.getSiguiente();
                        cont++;
                    }
                    Nodo objSig = temp.getSiguiente();
                    Nodo objPrev = temp.getPrevio();
                    temp.setSiguiente(objSig.getSiguiente());
                    temp.setPrevio(objPrev.getPrevio());

                    if (pos == (cantNodos - 1)) {//Reconectar fin
                        fin = temp;
                    }
                }
                this.cont--;
            }
        }
    }   
    
}
