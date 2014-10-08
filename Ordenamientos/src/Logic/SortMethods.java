package Logic;

import java.util.LinkedList;

/**
 * Clase del con varios metodos de ordenamiento
 * 
 * @author Tobias
 * @version 1.0 6/10/2014
 *
 */

public class SortMethods {

	public SortMethods() {

	}

	/**
	 * Metodo de ordenamiento Bubble
	 * 
	 * @param array
	 *            Arreglo que recibimos para ordenar
	 * @return Retorna el arreglo ordenado
	 */
	public void BubbleSort(int[] array) {

		boolean swap = true;
		int j = 0;
		int tmp;
		while (swap) {
			swap = false;
			j++;
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
					swap = true;
				}
			}

			if (swap == false)
				break;
		}
	}
	public void swap(int[] array,int num, int num2){
		int tmp= array[num];
		array[num]=array[num2];
		array[num2]=tmp;
	}
	
	/**
	 * Utiliza un arreglo de numeros para ser ordenados
	 * @param array 
	 *
	 *Agarra el primer numero de la lista y busca el menor de la lista
	 *switch el primero y el menor y aumenta el primer numero en 1
	 */
	public void SelectionSort(int[] array){
		int tmp;
		int head= array[0];
		int tail= array.length-1;
		if (tail<0){
			return;
		}
		for (int i=head; i<=tail;i++){
			tmp=i;
			for (int j=i+1; j<=tail;j++){
				if (array[j]<array[tmp]){
					tmp=j;
				}
			}
			swap(array,i,tmp);
		}
    }
	/**
	 * 
	 * @param array 
	 * @return retorna la lista ordenada
	 */
	
	public int [] MergeSort(int[] array){
		//divide la lista en 2, izquierda y derecha
		int izquierda = array.length / 2;
		int derecha = array.length - izquierda;
		int array1[] = new int[izquierda];
		int array2[] = new int[derecha];
		int j = 0, k = 0, w=0;
		
		if(array.length > 1){//mientras tenga mas de un digito
			//crea una nueva lista a la izquierda
			for(int i = 0; i < izquierda; i++)
				array1[i] = array[i];
			//crea una nueva lista a la derecha
			for(int i = izquierda; i < izquierda+derecha; i++)
				array2[i - izquierda] = array[i];
			array1 = MergeSort(array1);//utiliza recursion
			array2 = MergeSort(array2);
			
			//mientras cada nueva lista sea diferente de 0
			while(array1.length != j && array2.length != k){
				if(array1[j] < array2[k]){
					array[w] = array1[j];
					j++;
				}
				else{
					array[w] = array2[k];
					k++;
				}w++;}

			while(array1.length != j){
				array[w] = array1[j];
				w++;
				j++;
			}
			while(array2.length != k){
				array[w] = array2[k];
				w++;
				k++;
			}
		}return array;
	}
	
	/**
	 * Ordena enteros procesando sus dígitos de forma individual.
	 * @param array
	 * @param digitos
	 */
	public static void RadixSort(int[] array,int digitos) {
		//se crean como cajas para guardar numeros temporalmente
		//esta importacion sirve para crear cajitas
        LinkedList[] cajas = { 
          new LinkedList<Integer>(), // 0
          new LinkedList<Integer>(), // 1
          new LinkedList<Integer>(), // 2
          new LinkedList<Integer>(), // 3
          new LinkedList<Integer>(), // 4
          new LinkedList<Integer>(), // 5
          new LinkedList<Integer>(), // 6
          new LinkedList<Integer>(), // 7
          new LinkedList<Integer>(), // 8
          new LinkedList<Integer>()  // 9
        };
        
        for (int i = 1; i <= digitos; i++) {
        	//mete los numeros en cajas conforme la division entre 10
            for (int j = 0; j < array.length; j++) {
                cajas[getRadix(array[j], i)].add(array[j]);
            }
            int posicion = 0;
            for (int k = 0; k < cajas.length; k++) {
            	//si la caja esta vacia la acomoda en orden
                while (!cajas[k].isEmpty()) {
                    array[posicion] = (Integer)cajas[k].removeFirst();
                    posicion++;
                }
            }
        }
    }
    public static int getRadix(int numero, int radix) {
    	//retorna un numero dividido entre un 10**potencia
    	return (int) (numero / Math.pow(10, radix - 1)) % 10;
    }
		
}
