/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_tipos_datos_genericos;

import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class EVA2_2_TIPOS_DATOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        LinkedList<Integer> lista1 = new LinkedList<Integer>();
        lista1.add(100);
        lista1.add(200);
        lista1.add(300);
        lista1.add(400);
        
        System.out.println("lista1");
        
        TiposDatosGenericos<Integer> miObj = new TiposDatosGenericos<Integer>();
        miObj.setValor(100);
        
        System.out.println(miObj.getValor());
        
        LinkedList<String> lista = new LinkedList<String>();
    }

}

class TiposDatosGenericos<T> {

    private T valor;

    public T getValor() {
        return valor;
    }

    public void setValor (T valor) {
        this.valor = valor;
    }

}

