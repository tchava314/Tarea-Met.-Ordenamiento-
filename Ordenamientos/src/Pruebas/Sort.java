package Pruebas;

import Logic.Comparacion;
import Logic.Int;
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
		Comparacion a1 = new Int(1);
		Comparacion a2 = new Int(2);
		Comparacion a3 = new Int(3);
		Comparacion a8 = new Int(4);
		Comparacion array[] = { a2, a1, a8, a3 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(((Int) array[i]).getNum());
		}
		method.QuickSort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(((Int) array[i]).getNum());
		}

	}
}
