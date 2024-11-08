package tema4_v4;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		
		int dia = 0;
		
		int[] g_num = {7, 3, 1, 2};
		
		dia = g_num[0];
		Fecha fecha_i =  func_fecha.craar("fecha_i");
		Fecha fecha0 = func_fecha.crear_fecha_diferencia("fecha0", fecha_i, dia);
		dia = g_num[1];
		Fecha fecha1 = func_fecha.crear_fecha_diferencia("fecha0", fecha0, dia);
		dia = g_num[2];
		Fecha fecha2 = func_fecha.crear_fecha_diferencia("fecha0", fecha1, dia);
		dia = g_num[3];
		Fecha fecha3 = func_fecha.crear_fecha_diferencia("fecha0", fecha2, dia);
		Fecha fecha4 = func_fecha.crear_fecha_final("fecha0", fecha_i);
		
	
		
		JOptionPane.showMessageDialog(null, fecha0.toString());
		JOptionPane.showMessageDialog(null, fecha1.toString());
		JOptionPane.showMessageDialog(null, fecha2.toString());
		JOptionPane.showMessageDialog(null, fecha3.toString());
		JOptionPane.showMessageDialog(null, fecha_i.toString());
		JOptionPane.showMessageDialog(null, fecha4.toString());

	}
}
