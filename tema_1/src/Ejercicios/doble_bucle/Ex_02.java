package Ejercicios.doble_bucle;

import javax.swing.JOptionPane;

public class Ex_02 {
	public static void main(String[] args) {

		/* Numeros Perfectos */

		/* VARIABLES */
		boolean interruptor = false;
		int num = 0;
		String cad = "";
		int suma = 0;
		/* VARIABLES */

		/* VALIDAR */
		String s = "";
		boolean correcto = true;
		/* VALIDAR */

		while (interruptor == false) {

			/* NUM */
			do {
				try {
					s = JOptionPane.showInputDialog(null, "Escribe num", "Num int", JOptionPane.QUESTION_MESSAGE);
					if (s == null) {
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicación", "Saliendo",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						num = Integer.parseInt(s);
						correcto = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",
							JOptionPane.ERROR_MESSAGE);
					correcto = false;
				}
			} while (correcto == false);
			/* NUM */

			if (num == -5) {
				interruptor = true;
			} else {
				suma = 0;
				for (int i = 1; i < num; i++) {
					if ((num % i) == 0) {
						suma = suma + i;
					} // end if
				} // end for

				if (suma == num) {
					/* CADENA */
					cad = cad + "El número " + num + " es perfecto";
					/* CADENA */
				} else {
					/* CADENA */
					cad = cad + "El número " + num + " no es perfecto";
					/* CADENA */
				} // END IF

			} // END IF
		} // END WHILE

		/* CADENA */
		JOptionPane.showMessageDialog(null, cad);
		/* CADENA */
	}

}
