package Logic;
import javax.swing.JOptionPane;
import graficos.desplegarGrafico;

public class Main {
	public static void main(String[] args){
		pregunta();
	}
	public static void pregunta(){
		Cronometro crono= new Cronometro();
		String numeroElementos = JOptionPane.
				showInputDialog("ingrese el numero de elementos de prueba");
		String tipo=JOptionPane.showInputDialog("ingrese el tipo de elemento");
		String repeticiones=JOptionPane.showInputDialog("ingrese numero de repeticiones");
		GeneraElementos aleatoriosGenerados= new GeneraElementos(Integer.parseInt(numeroElementos),tipo);
		SortMethods M=new SortMethods();
		int rep = Integer.parseInt(repeticiones);
		Int[] a={new Int(12),new Int(11),new Int(10),new Int(9),new Int(8),new Int(7)};
		crono.inicio();
		M.BubbleSort(a, rep);
		crono.fin();
		long DuracionBubble =crono.getDuracion();
		crono.inicio();
		M.insertSort(a, rep);
		crono.fin();
		long DuracionInsert =crono.getDuracion();
		crono.inicio();
		M.MergeSort(a, rep);
		crono.fin();
		long DuracionMerge =crono.getDuracion();
		crono.inicio();
		M.QuickSort(a, rep);
		crono.fin();
		long DuracionQuick =crono.getDuracion();
		crono.inicio();
		M.SelectionSort(a, rep);
		crono.fin();
		long DuracionSelection =crono.getDuracion();
		//crono.inicio();
		//M.RadixSort(a, rep, 10);
		//crono.fin();
		long DuracionRadix =crono.getDuracion();
		Informacion tabla = new Informacion();
		//tabla.addValue(DuracionRadix, "Radix");
		tabla.addValue(DuracionQuick,"Quick");
		tabla.addValue(DuracionMerge, "Merge");
		tabla.addValue(DuracionInsert, "Insert");
		tabla.addValue(DuracionSelection, "Selection");
		tabla.addValue(DuracionBubble, "Buble");
		tabla.crearGrafico();
		desplegarGrafico grafico= new desplegarGrafico();
		grafico.desplegar(tabla.getData());
	}

}
