package Ejercicios.doble_bucle;

import javax.swing.JOptionPane;

public class Ex_06 {

	public static void main(String[] args) {
		/* Acabar en -5, de cada número sacar la media de los dígitos múltiplos de 3 */

		/* VARIABLES */
		int copia = 0;
		int digito = 0;
		int num = 0;
		int cont_media = 0;
		int media = 0;
		int suma = 0;
		String cad_user = "";
		String num_media = "";
		/* VARIABLES */

		/* VALIDAR */
		String cad;
		boolean correcto = true;
		/* VALIDAR */

		/* INTERRUPTOR */
		boolean interruptor = false;
		/* INTERRUPTOR */

		/* PRIMER BUCLE */
		while (interruptor == false) {

			/* NUM */
			do {
				try {
					cad = JOptionPane.showInputDialog(null, "Escribe un num ", "Num int", JOptionPane.QUESTION_MESSAGE);
					if (cad == null) {
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicación", "Saliendo",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
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

			/* IMPORTANT DIGITO */
			copia = num;
			/* IMPORTANT DIGITO */

			/* REINICIALIZACION */
			digito = 0;
			suma = 0;
			cont_media = 0;
			num_media = num_media + "\nLos digitos multiplos de 3 de: " + copia + " son ";
			/* REINICIALIZACION */

			if (num == -5) {
				interruptor = true;
			} else {
				/* DIGITOS */
				while (num > 0) {
					digito = num % 10;
					num = num / 10;

					if ((digito % 3) == 0) {
						cont_media++;
						suma = suma + digito;
						num_media = num_media + digito;
					} // END IF
				} // END WHILE
				/* DIGITOS */

				if (cont_media != 0) {
					media = suma / cont_media;
					/* CADENA */
					cad_user = cad_user + "\nLa media de los digitos multiplos de 3 del número " + copia + " es "
							+ media;
					/* CADENA */

				} else {
					/* CADENA */
					cad_user = cad_user + "\nLa media de los digitos multiplos de 3 del número " + copia + " es  0";
					/* CADENA */
				} // END IF
			} // END IF
		} // END WHILE
		/* PRIMER BUCLE */

		/* CADENA */
		JOptionPane.showMessageDialog(null, cad_user);
		JOptionPane.showMessageDialog(null, num_media);
		/* CADENA */

	}
}