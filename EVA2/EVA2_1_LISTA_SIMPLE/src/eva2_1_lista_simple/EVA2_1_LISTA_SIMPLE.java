/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_lista_simple;

/**
 *
 * @author diego
 */
public class EVA2_1_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        
         // We create a new list (The lists are empty)
        Lista miLista = new Lista();    
        Lista miLista2 = new Lista();
        
        System.out.println("Primera lista:");
        miLista.printList();
        System.out.println("Segunda lista:");
        miLista2.printList();
        
        // We add elements to the list
        miLista.add(10); // 0
        miLista.add(20); // 1
        miLista.add(30); // 2 Temp needs to get on this position
        miLista.add(40); // 3 <--- insert a new node
        miLista.add(50); // 4
        miLista.add(60); // 5      
        
        miLista2.add(1);
        miLista2.add(2);
        miLista2.add(3);
        miLista2.add(4);
        miLista2.add(5);
        miLista2.add(6);
        miLista2.add(7);
        miLista2.add(8);
        miLista2.add(9);
        miLista2.add(10);

        // Imprimir lista.
        System.out.println("Lists with nodes.");
        System.out.println("First lista:");
        miLista.printList();
        System.out.println("Second list:");
        miLista2.printList();

         /*
         int[] array = new int[1000000];
         for (int i = 0; i < array.length; i++) {
         array[i] = 1000;
         } //
        
         
         for (int i = 0; i < 1000000; i++) { // O(N2)
         myList.add(1000);
         } */
              
        System.out.println("\nNodes cont: ");
        System.out.println("First list:");
        System.out.println(miLista.lengthList());        
        System.out.println("Second list:");
        System.out.println(miLista2.lengthList());
                        
        // Insert a node at the start
        try {
            miLista.addAt(70, 0);
            miLista2.addAt(12, 0);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        
        // We print the modified list
        System.out.println("\nModified lists");
        System.out.println("First list:");
        miLista.printList();
        System.out.println("Second list:");
        miLista2.printList();
        
        System.out.println("\nCont nodes:");
        System.out.println("First list:");
        System.out.println(miLista.lengthList());
        System.out.println("Second list:");
        System.out.println(miLista2.lengthList());
        
        // Delete node at a determined position
        try {
            miLista.deleteAt(5);
            miLista2.deleteAt(3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }        
        
        System.out.println("\nModified lists.");
        System.out.println("First list");
        miLista.printList();
        System.out.println("Second list:");
        miLista2.printList();
        
        System.out.println("\nCont nodes:");
        System.out.println("First list:");
        System.out.println(miLista.lengthList());
        System.out.println("Second list:");
        System.out.println(miLista2.lengthList());        
        
        // Pedir valor en una posición en específico        
        System.out.println("\nValue of the lists at a position");
        System.out.println("First list:");
        miLista.getValueAt(2); 
        System.out.println("Second list:");
        miLista2.getValueAt(8);
    }
}