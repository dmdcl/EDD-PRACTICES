/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class EVA2_7_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LISTA
        System.out.println("LINKED LIST -----------------------");
        LinkedList <String>listaEnlazada = new LinkedList();
        listaEnlazada.add("Don bollo");
        listaEnlazada.add("Don bollo");
        listaEnlazada.add("Don bollo");
        listaEnlazada.add("Don bollo");
        System.out.println(listaEnlazada);
        System.out.println(listaEnlazada.get(0));
        listaEnlazada.remove(0);
        System.out.println(listaEnlazada);
        listaEnlazada.addFirst("Soy");
        System.out.println(listaEnlazada);
        for (int i= 0; i < listaEnlazada.size(); i++){
            System.out.println(listaEnlazada.get(i) + " ");
        }
        //ARRAYLIST
        System.out.println("ARRAYLIST------------------------");
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        System.out.println(arrayList);
        arrayList.add(2, 250);
        System.out.println(arrayList);
        for (int i= 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i) + " ");
        }
                
        //QUEUES
        //STACKS
        //CONJUNTOS
        
    }
    
}
