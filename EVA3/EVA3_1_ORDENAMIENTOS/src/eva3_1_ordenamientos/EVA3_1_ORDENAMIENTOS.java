/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_ordenamientos;

/**
 *
 * @author diego
 */
public class EVA3_1_ORDENAMIENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] arregloDatos = new int[10];
        int[] arregloSel = new int[arregloDatos.length];
        int[] arregloIns = new int[arregloDatos.length];
        int[] arregloQ = new int[arregloDatos.length];
        int[] arregloQuick = new int[arregloDatos.length];
        
        System.out.println("Arreglo original: ");
        llenar(arregloDatos);
        imprimir(arregloDatos);
        
        System.out.println("Selection Sort");
        copiar(arregloDatos, arregloSel);
        imprimir(arregloSel);
        double ini = System.nanoTime();
        selectionSort(arregloSel);
        double fin = System.nanoTime();
        imprimir(arregloSel);
        System.out.println("Selection Sort = " + (fin - ini));
        
        System.out.println("Insertion Sort");
        copiar(arregloDatos, arregloIns);
        imprimir(arregloIns);
        ini = System.nanoTime();
        insertionSort(arregloIns);
        fin = System.nanoTime();
        imprimir(arregloIns);
        System.out.println("Insertion Sort = " + (fin - ini));
        
        System.out.println("Quick Sort");
        copiar(arregloDatos, arregloQ);
        imprimir(arregloQ);
        ini = System.nanoTime();
        quickSort(arregloQ);
        fin = System.nanoTime();
        imprimir(arregloQ);
        System.out.println("Quick Sort = " + (fin - ini));
        
        System.out.println("Quick Sort 2.0");
        copiar(arregloDatos, arregloQuick);
        imprimir(arregloQuick);
        ini = System.nanoTime();
        QuickSort qs = new QuickSort();
        qs.ordenar(arregloQuick, 0, (arregloQuick.length-1));
        fin = System.nanoTime();
        imprimir(arregloQuick);
        System.out.println("Quick Sort 2.0 = " + (fin - ini));
        
        
    }
    //LLENAR ARREGLO
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    }
    //IMPRIMIR ARREGLO
    public static void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] < 10)
            System.out.print("[" + arreglo[i] + "]");
            else
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
    //COPIAR ARREGLO
    public static void copiar(int[] arreglo, int[] copia){
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
    }
    
    //SELECTION SORT O[n^2]
    //+ Comparaciones
    //- Intercambios (Swap)
    public static void selectionSort(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            //Busco el elemento (posición) más pequeño
            for (int j = i+1; j < arreglo.length; j++) {
             //Buscar el más pequeño
             if(arreglo[min] > arreglo[j])
                 min = j;
            }
            //Swap - Intercambiar
            if(min != i){
                int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
            }
        }
    }
    //INSERTION SORT O[n^2]
    //+ Intercambios
    //- Comparaciones
    public static void insertionSort(int[] arreglo){
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i]; //Es lo que vamos a ordenar
            int insP = i;
            //Buscamos en qué punto debe quedar temp
            //Esa posición queda almacenada en InsP
            for (int prev = i-1; prev >= 0; prev--) { //Comparamos
                if(arreglo[prev] > temp){
                    //Swap (intercambio parcial)
                    arreglo[insP] = arreglo[prev];
                    insP--;
                }else{
                    break;
                }
            }
            arreglo[insP] = temp;
        }
    }
    //QuickSort
    public static void quickSort(int[] arreglo){
        quickSortRec(arreglo, 0, arreglo.length-1);
    }
    
    private static void quickSortRec(int[] arreglo, int ini, int fin){
     int pivote, big, small, temp;
    //Seleccionar pivote (primer elemento)
     pivote = ini;
     big = ini;
     small = fin;
     
        if(ini < fin){
           while(big < small){ //Los índices se cruzaron
              //Mover los índices
              //Buscar los elementos más grandes que el pivote
              while(arreglo[big] <= arreglo[pivote] && (big < small)) 
                  big++;
              //Buscar los elementos más pequeños que el pivote     
              while(arreglo[small]> arreglo[pivote])
                  small--;
              //Verificamos que no hayan cruzado los índices
                 //Intercambiar
              if(big < small){
                  temp = arreglo[big];
                  arreglo[big] = arreglo[small];
                  arreglo[small] = temp;
              }
           }

           //Mover el pivote
           //Swap pivote con small
           temp = arreglo[pivote];
           arreglo[pivote] = arreglo[small];
           arreglo[small] = temp;
           pivote = small;

           //Repite el proceso para cada mitad
           //Llamada recursiva
           quickSortRec(arreglo, ini, pivote-1);
           quickSortRec(arreglo, pivote+1, fin);
        }
    }
}