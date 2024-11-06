package Ejercicios.doble_bucle;

import javax.swing.JOptionPane;

public class Ex_01 {
	public static void main(String[] args) {

		/* interruptor -1 divisors imprimir mayor y menor */

		/* VARIABLES */
		int num = 0;
		String cad_user = "";
		int pivot = 0;
		int mayor = 0;
		int menor = 0;
		/* VARIABLES */

		/* INTERRUPTOR */
		boolean interruptor = false;
		/* INTERRUPTOR */

		/* VALIDAR */
		String cad;
		boolean correcto = true;
		/* VALIDAR */

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

			if (num == -1) {
				interruptor = true;
			} // END IF

			/* REINICIALIZACION */
			pivot = 0;
			mayor = 0;
			menor = 0;
			/* REINICIALIZACION */

			/* SEGON BUCLE */
			for (int i = 1; i <= num; i++) {
				if ((num % i) == 0) {

					if (pivot == 0) {
						pivot++;
						mayor = num;
						menor = num;
					} // END IF

					if (mayor > i) {
						mayor = i;
					} // END IF

					if (menor < i) {
						menor = i;
					} // END IF
				}
			} // END FOR
			/* SEGON BUCLE */

			/* CADENA */
			cad_user = cad_user + " Los divisores mayores y menores  de " + num + " son: " + mayor + " y " + menor;
			/* CADENA */

		} // END WHILE
		/* PRIMER BUCLE */

		/* CADENA */
		JOptionPane.showMessageDialog(null, cad_user);
		/* CADENA */
	}

}