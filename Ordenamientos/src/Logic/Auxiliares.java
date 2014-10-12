package Logic;


public class Auxiliares{
	
	/**
	 * 
	 * @param init posicion desde donde se van a mover los elementos del arreglo
	 * @param end posicion hasta donde se van a mover los elemntos del arreglo
	 * @param a arreglo sobre el que se va a trabajar
	 */
	public static void mover(int init, int end, int[] a){
		for (int i=0; i<end-init; i++){
			a[end-i]=a[end-i-1];
		}
	}
	
	/**
	 * 
	 * @param n numero con el que se va a comparar
	 * @param pos posicion en la que se encuentra el elemento a comparar
	 * @param a arreglo sobre el que se va a trabajar
	 * @return devuelve la posicion del arreglo en la que se encuentra el ultimo elemento menor al buscado
	 */
	public static int buscaMenor(int n, int pos, int[] a){
		for (int i=pos-1; i>=0; i--){
			if(a[i]<=n){
				return i;
			}
		}
		return -1;
	}
	
}