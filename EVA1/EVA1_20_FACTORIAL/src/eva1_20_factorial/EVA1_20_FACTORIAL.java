/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_20_factorial;

/**
 *
 * @author user
 */
public class EVA1_20_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factorial(5));
    }

    public static int factorial(int valor) {

        if (valor == 0) {
            return 1;
        } else {
            return valor * factorial(valor - 1);
        }
    }

}
