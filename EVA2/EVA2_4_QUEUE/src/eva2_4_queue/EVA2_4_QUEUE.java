/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_queue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class EVA2_4_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       MyQueue myQueue = new MyQueue();
        myQueue.add(10); 
        myQueue.add(20); 
        myQueue.add(30); 
        myQueue.add(40); 
        myQueue.add(50); 
        System.out.println("El primer valor en llegar es " + myQueue.peek());
        myQueue.print();
        try {
            System.out.println("El primer valor en llegar " + myQueue.poll());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_4_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        myQueue.print();
    }
    
}
