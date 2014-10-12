package Logic;


public class Auxiliares{
	
	public static void mover(int init, int end, int[] a){
		for (int i=0; i<end-init; i++){
			a[end-i]=a[end-i-1];
		}
	}
	
	public static int buscaMenor(int n, int pos, int[] a){
		for (int i=pos-1; i>=0; i--){
			if(a[i]<=n){
				return i;
			}
		}
		return -1;
	}
	
}