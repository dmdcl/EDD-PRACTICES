/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author diego
 */
public class EVA2_3_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         DoubleList miLista = new DoubleList();
        
        miLista.add(10);
        miLista.add(20);
        miLista.add(30);
        miLista.add(40);
        miLista.add(50);        
        miLista.printList();                
        
        System.out.println("\nConteo de nodos.");
        System.out.println(miLista.lengthList());
        
        // Insertar un nodo al inicio de la lista
        try {
            miLista.addAt(100, 0);
        } catch(Exception ex) {
            ex.printStackTrace();
        }        
        
        System.out.println("Agregar un nodo al inicio de la lista:");
        miLista.printList();
                
        try {
            miLista.deleteAt(0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Eliminar un nodo en la primera posicion: ");
        miLista.printList();
        
        // Eliminar un nodo en una posición específica
        try {
            miLista.deleteAt(4);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Eliminar un nodo en una posicion especifica:");
        miLista.printList();
        
        
        try {
            miLista.deleteAt(1);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Eliminar un nodo en una posicion especifica:");
        miLista.printList();
                
        // Insertar un nodo en una posición específica
        try {
            miLista.addAt(70, 2);
        } catch(Exception ex) {
            ex.printStackTrace();
        }        
        System.out.println("Agregar un nodo en una posicion especifica:");
        miLista.printList();
    }    
}
