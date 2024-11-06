package Ejercicios.bucle;

import javax.swing.JOptionPane;

public class Ex_01 {
	public static void main(String[] args) {

		/*
		 * Sumar els números pars mentre no siga negatiu
		 * 
		 * (Acabar cuan siguen negatius)
		 */

		/* VARIABLES */
		int num = 0;
		int suma = 0;
		boolean interruptor = false;
		String cad_user = "";
		/* VARIABLES */

		/* VALIDAR */
		String cad = "";
		boolean correcto = true;
		/* VALIDAR */

		while (interruptor == false) {
			/* NUM */
			do {
				try {
					cad = JOptionPane.showInputDialog(null, "Escribe un num int", "Num int",
							JOptionPane.QUESTION_MESSAGE);
					if (cad == null) {
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicación", "Saliendo",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);// al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la
										// ejecución
					} else {
						num = Integer.parseInt(cad);
						correcto = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",
							JOptionPane.ERROR_MESSAGE);
					correcto = false;
				}
			} while (correcto == false);
			/* NUM */

			if (num < 0) {
				interruptor = true;
			} else {
				if ((num % 2) == 0) {
					suma = suma + num;
				} // end if
			} // end if
		} // end while

		cad_user = "La suma es: " + suma;
		JOptionPane.showMessageDialog(null, cad_user);
	}

}
