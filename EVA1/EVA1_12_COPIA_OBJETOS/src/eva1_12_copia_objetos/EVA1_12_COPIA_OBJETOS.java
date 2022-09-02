/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_copia_objetos;

/**
 *
 * @author ana31
 */
public class EVA1_12_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor, copiaValor;
        
        valor = 100;
        copiaValor = valor;
        System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        valor ++;
         System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        // AHORA CON OBJETOS
        PruebaValor prueba = new PruebaValor();
        prueba.x = 1000;
        PruebaValor pruebaCopia = new PruebaValor();
        pruebaCopia = prueba;
        System.out.println("AHORA CON OBJETOS");
        System.out.println("Prueba " + prueba.x);
        System.out.println("Prueba copia " + pruebaCopia.x);
        prueba.x ++;
        System.out.println("Prueba " + prueba.x);
        System.out.println("Prueba copia " + pruebaCopia.x);
        
   
        
    }
    
}

  class PruebaValor{
        int x;
  }