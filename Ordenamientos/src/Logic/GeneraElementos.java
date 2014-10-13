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
	
	public GeneraElementos(int numeroElementos,String tipo){
		if (tipo=="int"){
			for (int i=0;i<numeroElementos;i++){
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
				while(dic!=null){
					dic = br.readLine();
					diccionario.add(dic);
				}
				for (int i=0;i<numeroElementos;i++){
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
