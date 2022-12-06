/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_stack;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author user
 */
public class EVA2_5_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.print();
        System.out.println("CIMA DE LA PILA: " + myStack.peek());
        myStack.print();
        try {
            System.out.println("CIMA DE LA PILA: " + myStack.pop());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_5_STACK.class.getName()).log(Level.SEVERE, null, ex);
        }
        myStack.print();
    }
}
    

