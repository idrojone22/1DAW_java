package Ejercicios.doble_bucle;

import javax.swing.JOptionPane;

public class Ex_04 {

	public static void main(String[] args) {
		/* desea cotinuar, digitos pars, media */

		/* VARIABLES */
		String cad_user = "";
		int num = 0;
		int media = 0;
		int digito = 0;
		int suma = 0;
		int cont = 0;
		int copia = 0;
		/* VARIABLES */

		/* VALIDAR */
		String cad = "";
		boolean correcto = true;
		/* VALIDAR */

		/* DESEA CONTINUAR */
		int continuar = 0;
		/* DESEA CONTINUAR */

		/* PRIMER BUCLE */
		do {

			/* NUM */
			do {
				try {
					cad = JOptionPane.showInputDialog(null, "Escribe un num int", "Num int",
							JOptionPane.QUESTION_MESSAGE);
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

			/* IMPRTANT */
			copia = num;
			/* IMPRTANT */

			/* DIGITOS (SEGUNDO BUCLE) */
			while (num > 0) {
				digito = num % 10;
				num = num / 10;

				if ((digito % 2) != 0) {
					/* CONT MEDIA */
					cont++;
					/* CONT MEDIA */
					suma = suma + digito;
				} // END IF
			} // END WHILE
			/* DIGITOS(SEGUNDO BUCLE) */

			/* Control de errores para que no divida entre 0 */
			if (cont != 0) {
				media = suma / cont;
			} else {
				media = 0;
			} // END IF

			/* CADENA */
			cad_user = cad_user + " La suma de los divisores imapres de " + copia + " es: " + suma;
			/* CADENA */

			/* REINICIALIZACION */
			cont = 0;
			suma = 0;
			digito = 0;
			copia = 0;
			/* REINICIALIZACION */

			continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		} while (continuar == JOptionPane.OK_OPTION);
		/* PRIMER BUCLE */

		/* CADENA */
		JOptionPane.showMessageDialog(null, cad_user);
		/* CADENA */
	}

}
