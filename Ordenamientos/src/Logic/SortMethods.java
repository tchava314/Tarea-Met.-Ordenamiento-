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

	public void Swap(Comparacion[] arreglo, int i, int j) {
		Comparacion tmp = arreglo[i];
		arreglo[i] = arreglo[j];
		arreglo[j] = tmp;
	}

	/**
	 * Metodo de ordenamiento Bubble
	 * 
	 * @param array
	 *            Arreglo que recibimos para ordenar
	 * @return Retorna el arreglo ordenado
	 */
	public void BubbleSort(Comparacion array[]) {

		boolean swap = true;
		int j = 0;
		while (swap) {
			swap = false;
			j++;
			for (int i = 0; i < array.length - 1; i++) {

				if (array[i].Comparar(array[i + 1]) == 1) {
					Swap(array, i, i + 1);
					swap = true;

				}
			}

			if (swap == false)
				break;
		}
	}

	/**
	 * Metodo de ordenamiento QuickSort
	 * 
	 * @param arreglo
	 *            Arreglo que recibimos para ordenar
	 * @param i
	 *            bandera que indica una posicion en el arreglo
	 * @param j
	 *            bandera que indica una posicion en el arreglo
	 * @return Retorna el arreglo ordenado
	 */
	/*
	 * public int[] QuickSortAux(int[] arreglo, int i, int j) { if (i >= j)
	 * return arreglo;
	 * 
	 * int left = i; int rigth = j; if (left != rigth) { int piv = (i); while
	 * (left != rigth) { while (((arreglo[rigth]) >= (arreglo[piv])) && (left <
	 * rigth)) rigth--; while (((arreglo[left]) < (arreglo[piv])) && (left <
	 * rigth)) left++; if (left != rigth) { Swap(arreglo, left, rigth); } } if
	 * (left == rigth) { QuickSortAux(arreglo, i, left - 1);
	 * QuickSortAux(arreglo, left + 1, j); }
	 * 
	 * }
	 * 
	 * else return arreglo;
	 * 
	 * return arreglo;
	 * 
	 * }
	 * 
	 * /** metodo auxiliar de QuickSort
	 * 
	 * @param arreglo recibe el arreglo por ordenar
	 * 
	 * @return retorna el arreglo ordenado
	 */
	/*
	 * public void QuickSort(int[] arreglo) { QuickSortAux(arreglo, 0,
	 * arreglo.length - 1); }
	 */

}
