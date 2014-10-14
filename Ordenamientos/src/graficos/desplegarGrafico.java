package graficos;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import Logic.parametros;;

public class desplegarGrafico {
	public void desplegar(JFreeChart datos){
		ChartFrame cuadro = new ChartFrame(parametros.nombreVentana, datos);
        cuadro.pack();
        cuadro.setVisible(true);
	}
}
