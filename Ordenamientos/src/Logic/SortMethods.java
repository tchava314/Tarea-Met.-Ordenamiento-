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

}
