package tema4_v5;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
	
		Fecha fecha_i = func_fecha.craar("fecha_i");
		Fecha fecha_f = func_fecha.crear_fecha_dias_despues("fecha_f", fecha_i, 20);

		int preuPerHora = 20;
		int horesPerDia = 8;

		int diesCurs = fecha_i.restarFechas(fecha_f);

		int preuTotal = diesCurs * horesPerDia * preuPerHora;

		System.out.println("El preu total del curs és: " + preuTotal + " euros");
		

	}
}
