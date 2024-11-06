package Ejercicios.doble_bucle;
import javax.swing.JOptionPane;

public class Ex_03 {
	public static void main(String[] args) {
		/* n 5 primeros números impares sacar la suma de sus divisores */

		/* VARIABLES */
		int cont = 0;
		int num = 0;
		String cad_user = "";
		int suma = 0;
		/* VARIABLES */

		/* VALIDAR */
		String cad = "";
		boolean correcto = true;
		/* VALIDAR */

		/* PRIMER BUCLE */
		while (cont < 5) {

			/* REINICIALIZACION */
			suma = 0;
			/* REINICIALIZACION */

			/* NUM */
			do {
				try {
					cad = JOptionPane.showInputDialog(null, "Escribe num", "Num int", JOptionPane.QUESTION_MESSAGE);
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
				/* SEGUNDO BUCLE */
				for (int i = 1; i <= num; i++) {
					if ((num % i) == 0) {
						suma = suma + i;
					} // END IF
				} // END FOR
				/* SEGUNDO BUCLE */

				/* CONT BUCLE */
				cont++;
				/* CONT BUCLE */

				/* CADENA */
				cad_user = cad_user + " La suma de los divisores de " + num + " es: " + suma;
				/* CADENA */

			} // END IF
		} // END WHILE
		/* PRIMER BUCLE */

		/* CADENA */
		JOptionPane.showMessageDialog(null, cad_user);
		/* CADENA */
	}

}
