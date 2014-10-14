package Pruebas;

import Logic.*;/**
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
		Cronometro crono= new Cronometro();
		SortMethods M=new SortMethods();
		Int[] a={new Int(1)};
		//M.BubbleSort(a);
		for (int i=0;i<1;i++)
			System.out.println(a[i].getNum());
		crono.inicio();
		M.QuickSort(a,2);
		crono.fin();
		
		M.RadixSort(a,2,2);
		System.out.println(crono.getDuracion());
		for (int i=0;i<1;i++)
			System.out.println(a[i].getNum());
	}

}
