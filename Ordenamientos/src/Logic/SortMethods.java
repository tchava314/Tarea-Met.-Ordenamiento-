package Logic;

import Logic.Auxiliares;

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
	public void insertSort(int[] a){
		int tam= a.length;
		for (int i=0; i<tam-1; i++){
			if (a[i+1]<a[i]){
				int temp=a[i+1];
				int posDelMenor=Auxiliares.buscaMenor(a[i+1], i+1, a) ;
				Auxiliares.mover(posDelMenor+1, i+1, a);
				a[posDelMenor+1]=temp;
			}			
		}
	}

}
