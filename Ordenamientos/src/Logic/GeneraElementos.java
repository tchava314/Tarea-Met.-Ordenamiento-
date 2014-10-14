package Logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import org.json.simple.JSONArray;  


public class GeneraElementos {
	private JSONArray datos= new JSONArray();
	private Random numeroR = new Random();
	private BufferedReader br;
	private String dic;
	
	/**
	 * 
	 * @param numeroElementos numero de elementos que se desea generar
	 * @param tipo tipo de elementos que se desea generar
	 */
	public GeneraElementos(int numeroElementos,String tipo){
		if (tipo=="int"){
			for (int i=0;i<numeroElementos;i++){ //se generan numeros aleatorios y se añaden al json
				int numeroAleatorio=numeroR.nextInt(parametros.MaxNumero);
				datos.add(numeroAleatorio);
			}
		}
		if (tipo=="string"){
			try {
				FileReader fr = new FileReader(parametros.diccionario);				
				JSONArray diccionario= new JSONArray();
				br = new BufferedReader(fr);
				dic = br.readLine();
				while(dic!=null){ //se crea un json con el archivo que ingresa
					dic = br.readLine();
					diccionario.add(dic);
				}
				for (int i=0;i<numeroElementos;i++){ //se genera un segundo json a partir del anterior,
													// contiene un numero de elementos establecido por el
													//usuario. Estos son tomados aleatoriamente 
													//del primer json 
					datos.add(diccionario.get(numeroR.nextInt(parametros.numeropalabras))); 
				}	
			}
			catch (Exception ex) {
				System.out.println("error");
			}			
		}
	}
	public JSONArray getDatos(){
		return datos;
	}

}
