package tema4_v4;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		
		Fecha fecha1 = null;
		Fecha fecha2 = null;
		Fecha fecha3 = null;
		
		fecha1 = func_fecha.craar("Fecha1");
		fecha2 = func_fecha.crar_fecha_posterior("Fecha2", fecha1);
		fecha3 = func_fecha.crear_entre2("Fecha3", fecha1, fecha2);
		
		

	}
}
