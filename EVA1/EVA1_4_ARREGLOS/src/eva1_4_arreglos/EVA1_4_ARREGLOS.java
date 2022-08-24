/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_arreglos;

/**
 *
 * @author ana31
 */
public class EVA1_4_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TIPO DE DATO [] IDENTIFICADOR = new TIPO DE DATO (TAMANO)
        // ARREGLO DE ENTEROS PARA CAPTURAR EDADES:
        //TODOSO LOS IDENTIFICADORES DECLARADOS ARREGLOS SON ARREGLOS DE ENTEROS
        int [] arregloEdades, arregloSalario, arregloCali;
        double arregloPromedio[], porcentaje;
        //LOS ARREGLOS SON OBJETOS
        arregloEdades = new int[50];
        
        System.out.println(arregloEdades);
        for (int i = 0; i < arregloEdades.length; i++) {
            arregloEdades[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < 50; i++) {
            System.out.println("[" + i + ") = " + arregloEdades[i]);
            
        }
    }
    
}
