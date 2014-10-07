package Pruebas;

import Logic.SortMethods;

/**
 * Clase main para pruebas
 * 
 * @author Tobias
 * @version 1.0, 06/10/2014
 */

public class Sort {

	/**
	 * Metodo para ejecutar las pruebas
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		SortMethods method = new SortMethods();

		int[] array = { 5, 4, 3, 7, 88, 9, 1 };

		method.BubbleSort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
