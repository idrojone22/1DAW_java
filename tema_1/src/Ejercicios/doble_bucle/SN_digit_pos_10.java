package Ejercicios.doble_bucle;

import javax.swing.JOptionPane;

public class SN_digit_pos_10 {
	public static void main(String[] args) {

		// Variables
		int num = 0;
		int digito = 0;
		int copia = 0;
		int pos = 0;
		int cont = 0;
		int continuar = 0;
		boolean correcto = true;
		String cad = "";

		do {
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

			/* REINICIALITZACION */
			copia = num;
			digito = 0;
			cont = 0;
			/* REINICIALITZACION */

			while (num > 0) {
				digito = num % 10;
				num = num / 10;
				cont++;
			}

			num = copia;
			/**/

			/* POS */
			do {
				try {
					cad = JOptionPane.showInputDialog(null, "Escribe un pos ", "Num int", JOptionPane.QUESTION_MESSAGE);
					if (cad == null) {
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicación", "Saliendo",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);// al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la
										// ejecución
					} else {
						pos = Integer.parseInt(cad);
						correcto = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No has introducido un pos int", "Error",
							JOptionPane.ERROR_MESSAGE);
					correcto = false;
				}
			} while (correcto == false);
			/* POS */

			// JOptionPane.showMessageDialog(null, num + "num");
			// JOptionPane.showMessageDialog(null, copia + "copia");

			/* CORRECIÓN */
			do {
				try {
					if (pos > cont) {
						JOptionPane.showMessageDialog(null, pos + " es mayor que los digitos de " + copia, "Error",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						correcto = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No has introducido un pos int", "Error",
							JOptionPane.ERROR_MESSAGE);
					correcto = false;
				}
			} while (correcto == false);
			/* CORRECIÓN */

			cont = 0;

			while (num > 0) {
				digito = num % 10;
				num = num / 10;
				cont++;

				if (cont == pos) {
					cad = "La pos " + pos + " del número: " + copia + " es : " + digito;
				} // end if
			} // end while

			JOptionPane.showMessageDialog(null, cad);
			continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		} while (continuar == JOptionPane.OK_OPTION);
	}

}