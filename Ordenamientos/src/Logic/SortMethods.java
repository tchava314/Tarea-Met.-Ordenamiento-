package Logic;

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
		
}
