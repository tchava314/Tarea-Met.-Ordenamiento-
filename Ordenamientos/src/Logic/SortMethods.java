package Logic;

import java.util.LinkedList;

/**
 * Clase del con varios metodos de ordenamiento
 * 
 * @author Tobias
 * @version 1.0 6/10/2014
 *
 */

public class SortMethods<ele> {

	public SortMethods() {

	}

	/**
	 * cambia de lugar 2 elemnetos de un aarreglo de datos
	 * 
	 * @param arreglo
	 *            recibe un arrglo de datos
	 * @param i
	 *            recibe una posicion del arreglo
	 * @param j
	 *            recibe otra posicion del arreglo
	 */
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
	 * 
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
	 * 
	 */

	public void QuickSortAux(Comparacion arreglo[], int i, int j) {
		if (i >= j)
			return;

		int left = i;
		int rigth = j;
		if (left != rigth) {
			int piv = (i);
			while (left != rigth) {
				while ((((arreglo[rigth].Comparar(arreglo[piv]) >= 0) && (left < rigth))))
					rigth--;
				while (((arreglo[left].Comparar(arreglo[piv]) < 0) && (left < rigth)))
					left++;
				if (left != rigth) {
					Swap(arreglo, left, rigth);
				}

				if (left == rigth) {
					QuickSortAux(arreglo, i, left - 1);
					QuickSortAux(arreglo, left + 1, j);
				}
			}
		}

	}

	/**
	 * metodo auxiliar de QuickSort
	 * 
	 * @param arreglo
	 *            recibe el arreglo por ordenar
	 * 
	 * 
	 */

	public void QuickSort(Comparacion arreglo[]) {
		QuickSortAux(arreglo, 0, arreglo.length - 1);
	}

	public void SelectionSort(Comparacion[] array) {
		int tmp;
		Comparacion head = array[0];
		int tail = array.length - 1;
		if (tail < 0) {
			return;
		}
		for (int i = 0; i <= tail; i++) {
			tmp = i;
			for (int j = i + 1; j <= tail; j++) {
				if ((array[j].Comparar(array[tmp]) < 0)) {
					tmp = j;
				}
			}
			Swap(array, i, tmp);
		}
	}

	/**
	 * MergeSort
	 * 
	 * @param array
	 *            recibe un arreglo de datos
	 * @return retorna el arreglo ordenado
	 */

	public Comparacion[] MergeSort(Comparacion[] array) {
		// divide la lista en 2, izquierda y derecha
		int izquierda = array.length / 2;
		int derecha = array.length - izquierda;
		Comparacion array1[] = new Comparacion[izquierda];
		Comparacion array2[] = new Comparacion[derecha];
		int j = 0, k = 0, w = 0;

		if (array.length > 1) {// mientras tenga mas de un digito
			// crea una nueva lista a la izquierda
			for (int i = 0; i < izquierda; i++)
				array1[i] = array[i];
			// crea una nueva lista a la derecha
			for (int i = izquierda; i < izquierda + derecha; i++)
				array2[i - izquierda] = array[i];
			array1 = MergeSort(array1);// utiliza recursion
			array2 = MergeSort(array2);

			// mientras cada nueva lista sea diferente de 0
			while (array1.length != j && array2.length != k) {
				if ((array1[j].Comparar(array2[k])) < 0) {
					array[w] = array1[j];
					j++;
				} else {
					array[w] = array2[k];
					k++;
				}
				w++;
			}

			while (array1.length != j) {
				array[w] = array1[j];
				w++;
				j++;
			}
			while (array2.length != k) {
				array[w] = array2[k];
				w++;
				k++;
			}
		}
		return array;
	}

	/**
	 * Ordena enteros procesando sus dígitos de forma individual.
	 * 
	 * @param array
	 *            recibe un arreglo de datos
	 * @param digitos
	 *            recibe un entero
	 */
	public static void RadixSort(Comparacion[] array, int digitos) {
		// se crean como cajas para guardar numeros temporalmente
		// esta importacion sirve para crear cajitas
		LinkedList[] cajas = { new LinkedList<Integer>(), // 0
				new LinkedList<Integer>(), // 1
				new LinkedList<Integer>(), // 2
				new LinkedList<Integer>(), // 3
				new LinkedList<Integer>(), // 4
				new LinkedList<Integer>(), // 5
				new LinkedList<Integer>(), // 6
				new LinkedList<Integer>(), // 7
				new LinkedList<Integer>(), // 8
				new LinkedList<Integer>() // 9
		};

		for (int i = 1; i <= digitos; i++) {
			// mete los numeros en cajas conforme la division entre 10
			for (int j = 0; j < array.length; j++) {
				cajas[getRadix(array[j], i)].add(array[j]);
			}
			int posicion = 0;
			for (int k = 0; k < cajas.length; k++) {
				// si la caja esta vacia la acomoda en orden
				while (!cajas[k].isEmpty()) {
					array[posicion] = (Comparacion) cajas[k].removeFirst();
					posicion++;
				}
			}
		}
	}

	public static int getRadix(Comparacion numero, int radix) {
		// retorna un numero dividido entre un 10**potencia
		return (int) ((int) (((Int) numero).getNum()) / Math.pow(10, radix - 1)) % 10;
	}

	/**
	 * InsertSort
	 * 
	 * @param a
	 *            recibe un arreglo de datos
	 */
	public void insertSort(Comparacion[] a) {
		int tam = a.length;
		for (int i = 0; i < tam - 1; i++) {
			if ((a[i + 1].Comparar(a[i])) < 0) {
				Comparacion temp = a[i + 1];
				int posDelMenor = buscaMenor(a[i + 1], i + 1, a);
				mover(posDelMenor + 1, i + 1, a);
				a[posDelMenor + 1] = temp;
			}
		}
	}

	/**
	 * mover
	 * 
	 * @param init
	 *            recibe un entero con la posicion inicial del arreglo
	 * @param end
	 *            recibe un entero con la posicion final de arreglo
	 * @param a
	 *            recibe un arreglo de datos
	 * 
	 */
	public static void mover(int init, int end, Comparacion[] a) {
		for (int i = 0; i < end - init; i++) {
			a[end - i] = a[end - i - 1];
		}
	}

	/**
	 * buscaMenor
	 * 
	 * @param n
	 *            recibe un elemento de un arreglo de datos
	 * @param pos
	 *            recibe un entero indicando una posicion del arreglo de datos
	 * @param a
	 *            recibe un arreglo de datos
	 * @return devuleve una posicion del arreglo menos a n
	 */
	public static int buscaMenor(Comparacion n, int pos, Comparacion[] a) {
		for (int i = pos - 1; i >= 0; i--) {
			if ((a[i].Comparar(n)) <= 0) {
				return i;
			}
		}
		return -1;
	}
}
