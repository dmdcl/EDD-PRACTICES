/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_paso_valor_ref;

/**
 *
 * @author ana31
 */
public class EVA1_13_PASO_VALOR_REF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valorPrueba = 100;
        System.out.println("Valor " + valorPrueba);
        incVal(valorPrueba);
        System.out.println("Valor incrementado " + valorPrueba);
        //---------------------------------------------------------
        PruebaValor prueba = new PruebaValor();
        prueba.x = 100;
        System.out.println("Valor = " + prueba.x);
        incVal(prueba);
        System.out.println("Valor incrementado (obj) = " + prueba.x);
        
    }
    
    public static void incVal(int valor){
        valor ++;
    }
    
    public static void incVal(PruebaValor pruebaVal){
        pruebaVal.x++;
    }
}

 class PruebaValor{
        int x;
 }
