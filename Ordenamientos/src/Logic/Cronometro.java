package Logic;

public class Cronometro {
	private long inicio,fin;
	
	public void Cronometro(){
		
	}
	public void inicio(){
		inicio= System.nanoTime();
	}
	public void fin(){
		fin= System.nanoTime();
	}
	public long getDuracion(){
		return (fin-inicio);
	}

}
