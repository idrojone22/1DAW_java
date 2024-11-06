package Ejercicios.doble_bucle;

import javax.swing.JOptionPane;

public class Ex_05 {

	public static void main(String[] args) {

		/* produto digitos multiples de 2 y de 3 */

		/* VARIABLES */
		int prod = 1; // es multiplicación
		int digito = 0;
		int copia = 0;
		String cad_user = "";
		int num = 0;
		/* VARIABLES */

		/* VALIDAR */
		String cad;
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

			/* IMPROTANT */
			copia = num;
			/* IMPROTANT */

			/* REINICILIZACION */
			prod = 1;
			digito = 0;
			/* REINICILIZACION */

			/* SEGUNDO BUCLE (DIGITOS) */
			while (num > 0) {

				digito = num % 10;
				num = num / 10;

				if ((digito % 2 == 0) || (digito % 3 == 0)) {

					prod = prod * digito;
				} // END IF
			} // END WHILE
			/* SEGUNDO BUCLE (DIGITOS) */

			/* CADENA */
			cad_user = cad_user + "El prod de los digitos de: " + copia + " multiplos de 2 y de  3 son:" + prod;
			/* CADENA */

			continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		} while (continuar == JOptionPane.OK_OPTION);
		/* PRIMER BUCLE */

		/* CADENA */
		JOptionPane.showMessageDialog(null, cad_user);
		/* CADENA */
	}

}
