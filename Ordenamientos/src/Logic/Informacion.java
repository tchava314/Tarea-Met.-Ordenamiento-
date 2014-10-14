package Logic;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Informacion {	
	private	DefaultCategoryDataset objDataset = new DefaultCategoryDataset();
    private JFreeChart Data;
    /**
     * 
     * @param tiempo tiempo que tardo el algoritmo
     * @param nombre nombre del algoritmo
     */
	public void addValue(long tiempo,String nombre){
		objDataset.setValue(tiempo,nombre,nombre);
	}
	/**
	 * este medoto crea un grafico de barras en logica
	 */
	public void crearGrafico(){
		 Data = ChartFactory.createBarChart(
			    parametros.titulo,     //titulo
			    parametros.ejeHorizontal,     //eje Horizontal
			    parametros.ejeVertical,         //eje Vertical
			    objDataset,         //datos 
			    PlotOrientation.VERTICAL, // orientacion
			    true,             // incluir leyenda
			    true,             // incluir tips
			    false             // incluir URLs
			    
		
			);
	}
	public JFreeChart getData(){
		return Data;
	}
}
