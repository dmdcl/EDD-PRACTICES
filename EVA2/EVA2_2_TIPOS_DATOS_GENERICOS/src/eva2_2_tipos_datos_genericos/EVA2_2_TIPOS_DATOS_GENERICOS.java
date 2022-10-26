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
        //Lista 1
        TiposDatosGenericos<Integer> myObject = new TiposDatosGenericos<>();
        myObject.setValor(100);
        System.out.println(myObject.getValor());

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

