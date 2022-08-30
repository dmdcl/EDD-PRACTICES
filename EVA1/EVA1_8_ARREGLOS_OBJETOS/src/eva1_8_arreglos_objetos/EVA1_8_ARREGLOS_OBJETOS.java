/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_arreglos_objetos;

/**
 *
 * @author user
 */
public class EVA1_8_ARREGLOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo[] arregloEjemplo =  new Ejemplo[20];
        for(int i=0; i<arregloEjemplo.length; i++){
            arregloEjemplo[i] = new Ejemplo();
            
        }
        for (Ejemplo ejemplo : arregloEjemplo) {
            System.out.println("El valor de X  en el Objeto "+ejemplo+" = "+ejemplo.x);
        }

    }
    
}
class Ejemplo{
    public int x=100;
}
    