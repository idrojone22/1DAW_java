package Framework.doble_bucle;

import javax.swing.JOptionPane;

public class divisors {
	public static void main(String[] args) {

		/* VARIABLES */
		int num = 0;
		String cad_user = "";
		/* VARIABLES */

		/* VALIDAR */
		String cad;
		boolean correcto = true;
		/* VALIDAR */

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

		/* SEGON BUCLE */
		for (int i = 1; i <= num; i++) {

			if ((num % i) == 0) {
				JOptionPane.showMessageDialog(null, "Divisores de " + num + " son " + i);

			}
		} // END FOR
		/* SEGON BUCLE */
	}
}