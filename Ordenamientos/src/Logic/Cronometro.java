package Logic;

public class Cronometro { //clase para medir el tiempo 
	private long inicio,fin;
	
	public void inicio(){
		inicio= System.nanoTime(); //se inicia el cronometro
	}
	public void fin(){
		fin= System.nanoTime(); //se detiene el cronometro
	}
	public long getDuracion(){
		return (fin-inicio);  //se calcula la diferencia entre los dos puntos
	}

}
