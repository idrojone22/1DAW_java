package Ejercicios.doble_bucle;

import javax.swing.JOptionPane;

public class Ex_07 {

	public static void main(String[] args) {
		/* Dados n nums sumar los números que tengan exactamente 2 dígitos pares */

		/* VARIABLES */
		int num = 0;
		int digito = 0;
		int copia = 0;
		int cont_par = 0;
		int suma = 0;
		String num_par_suma = "";
		String cad_user = "";
		String digitos_par = "";
		/* VARIABLES */

		/* VALIDAR */
		String cad;
		boolean correcto = true;
		/* VALIDAR */

		/* NN */
		int n = 0;
		/* NN */

		/* N */
		do {
			try {
				cad = JOptionPane.showInputDialog(null, "Escribe n", "Num int", JOptionPane.QUESTION_MESSAGE);
				if (cad == null) {
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación", "Saliendo",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					n = Integer.parseInt(cad);
					correcto = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",
						JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}
		} while (correcto == false);
		/* N */

		/* PRIEMR BUCLE */
		for (int i = 0; i < n; i++) {
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

			/* IMPORTANT */
			copia = num;
			/* IMPROTANT */

			/* REINICIALIZACION */
			digito = num;
			cont_par = 0;
			digitos_par = "";
			/* REINICIALIZACION */

			/* SEGUNDO BUCLE (DIGITOS) */
			while (num > 0) {
				digito = num % 10;
				num = num / 10;

				if ((digito % 2) == 0) {
					cont_par++;
					digitos_par = digitos_par + " " + digito;
				} // END IF
			} // END WHILE

			switch (cont_par) {
			case 2:
				suma = suma + copia;
				num_par_suma = num_par_suma + " " + copia;
				cad_user = cad_user + "\nEl número " + copia + " tiene dos digitos pares. Y son" + digitos_par;
				break;
			case 1:
				cad_user = cad_user + "\nEl número " + copia + " tiene un digito par. Y es" + digitos_par;
				break;
			case 0:
				cad_user = cad_user + "\nEl número " + copia + " no tiene  digitos parres .";
				break;
			default:
				cad_user = cad_user + "\nEl número " + copia + " tiene mas de dos  digitos pares. Y son" + digitos_par;
				break;
			} // END SWITCH
		} // END FOR
		/* PRIEMR BUCLE */
		/* CADENA */
		cad_user = cad_user + "\nLa suma de los números con 2 digitos pares es: " + suma
				+ " y los números sumados han sido " + num_par_suma;
		/* CADENA */
		/* CADENA */
		JOptionPane.showMessageDialog(null, cad_user);
		/* CADENA */
	}
}