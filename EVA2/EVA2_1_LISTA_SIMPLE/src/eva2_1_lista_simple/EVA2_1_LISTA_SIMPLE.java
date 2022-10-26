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
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista miLista = new Lista();
        miLista.add(10);//0
        miLista.add(20);//1
        miLista.add(30);//2 // aqui tiene que quedar temp
        miLista.add(40);//3 <----- insercion
        miLista.add(50);//4
        miLista.add(60);//5
        miLista.print();
        System.out.println("\n");
        try {
            miLista.addIn(70, 3);
        } catch (Exception ex) {
            ex.printStackTrace();
            miLista.print();
            System.out.println("\n");
        }

        try {
            miLista.deleteAt(3);
        } catch (Exception ex) {
            ex.printStackTrace();
            miLista.print();
            System.out.println("\n");
        }
        miLista.print();
    }
}
