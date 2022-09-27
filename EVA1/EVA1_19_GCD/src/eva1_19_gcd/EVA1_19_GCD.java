/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_gcd;

/**
 *
 * @author user
 */
public class EVA1_19_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(god(240, 80));
    }

    public static int god(int a, int b) {
        int residuo;
        residuo = a % b;

        if (residuo == 0) {
            return b;
        } else {
            god(b, residuo);

            return residuo;
        }

    }
}
