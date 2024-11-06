package Ejercicios.doble_bucle;

import javax.swing.JOptionPane;

public class Ex_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* VARIABLES */
		String cad_user = "";
		int num = 0;
		int media = 0;
		int digito = 0;
		int suma = 0;
		int copia = 0;
		int cont_media = 0;
		/* VARIABLES */

		/* VALIDAR */
		String cad;
		boolean correcto = true;
		/* VALIDAR */

		/* 5 PRIMEROS NÚMEROS */
		int cont = 0;
		/* 5 PRIMEROS NÚMEROS */

		/* PRIMER BUCLE */
		while (cont < 5) {

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

			if ((num % 2) != 0) {

				/* CONT BUCLE */
				cont++;
				/* CONT BUCLE */

				/* IMPROTANT */
				copia = num;
				/* IMPROTANT */

				/* REINICILIZACION */
				cont_media = 0;
				suma = 0;
				digito = 0;
				media = 0;
				/* REINICILIZACION */

				/* SEGUNDO BUCLE (DIGITOS) */
				while (num > 0) {
					digito = num % 10;
					num = num / 10;

					if ((digito % 2) != 0) {

						cont_media++;
						suma = suma + digito;

					} // END IF
				} // END WHILE
				/* SEGUNDO BUCLE (DIGITOS) */

				if (cont_media != 0) {

					media = suma / cont_media;

					/* CADENA */
					cad_user = cad_user + " La media de los digitos impares de " + copia + " es " + media;
					/* CADENA */

				} else {

					/* CADENA */
					cad_user = cad_user + " La media de los digitos impares de " + copia + " es " + media;
					/* CADENA */

				} // END IF

			} // END IF

		} // END WHILE
		/* PRIMER BUCLE */

		/* CADENA */
		JOptionPane.showMessageDialog(null, cad_user);
		/* CADENA */
	}

}