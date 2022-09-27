/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_22_fibonacci;

/**
 *
 * @author user
 */
public class EVA1_22_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        practica objFIBO = new practica();
        System.out.println("La sucesion fibonacci de 7");
        objFIBO.FibonacciRecur(7);
    }

    public int FibonacciRecur(int n) {
        if (n == 0 || n == 2) {
            return 1;

        } else {
            return FibonacciRecur(n - 1) + FibonacciRecur(n - 2);

        }

    }

}

class practica {

    void FibonacciRecur(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
