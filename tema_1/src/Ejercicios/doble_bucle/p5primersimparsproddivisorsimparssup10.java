
package Ejercicios.doble_bucle;

import javax.swing.JOptionPane;

public class p5primersimparsproddivisorsimparssup10 {
	public static void main(String[] args) {

		/* VARIABLES */
		int num = 0;
		int prod = 1;
		String cad = "";
		int cont = 0;
		/* VARIABLES */

		boolean correcto = true;

		while (cont < 5) {

			/* NUM */
			do {
				try {
					cad = JOptionPane.showInputDialog(null, "Escribe un num ", "Num int", JOptionPane.QUESTION_MESSAGE);
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

			if (num % 2 != 0) {
				cont++;
				prod = 1;

				for (int i = 1; i <= num; i++) {
					if ((num % i) == 0) {
						if ((i % 2) != 0) {

							prod = prod * i;

						} // end if
					} // end if
				} // end for

				if (prod >= 10) {

					cad = cad + "El pord dels divisors impars de: " + num + " es major que 10: " + prod;
				} else {
					cad = cad + "El pord dels divisors impars de: " + num + " es menor que 10: " + prod;
				}
			} // end if
		} // end while
		JOptionPane.showMessageDialog(null, cad);
	}

}
