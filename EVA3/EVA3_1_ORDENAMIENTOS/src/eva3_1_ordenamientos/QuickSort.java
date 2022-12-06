/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_ordenamientos;

/**
 *
 * @author user
 */
public class QuickSort {
      /* Esta función toma el último elemento como pivote,
       coloca el elemento pivotante en su posición correcta
       en el array ordenado, y coloca todos los
       más pequeños (menores que el pivote) a la izquierda de
       pivote y todos los elementos mayores a la derecha
       del pivote */
        
        int partición(int arr[], int min, int max){
            int pivote = arr[max];
            int i = (min-1); //índice del elemento pequeño
            for(int j=min; j<max; j++){
                // Si el elemento actual es menor o
                // igual al pivote
                if(arr[j] <= pivote){
                    i++;
                    
                    //swap arr[i] y arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // swap arr[i+1] y arr[max] (o pivote)
            int temp = arr[i+1];
            arr[i+1] = arr[max];
            arr[max] = temp;
            
            return i+1;
        }
        
        /* La función principal que implementa QuickSort()
           arr[] --> Arreglo que va a ser ordenado
           min --> Índice inicial
           max --> Índice final
        */
        void ordenar(int arr[], int min, int max){
            if(min < max){
                /* pi es el índice de partición, arr[pi] está
                ahora en el lugar correcto
                */
                int pi = partición(arr, min, max);
                // Ordenar recursivamente los elementos antes
                // y después de la partición
                ordenar(arr, min, pi-1);
                ordenar(arr, pi+1, max);
            }
        }
}

