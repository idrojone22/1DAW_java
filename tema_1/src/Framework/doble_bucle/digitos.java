package Framework.doble_bucle;

import javax.swing.JOptionPane;

public class digitos {
	public static void main(String[] args) {

		/* VARIABLES */
		int num = 0;
		int digito = 0;
		int copia = 0;
		/* VARIABLES */

		/* VALIDAR */
		String cad;
		boolean correcto = true;
		/* VALIDAR */

		/* NUM */
		do {
			try {
				cad = JOptionPane.showInputDialog(null, "Escribe un num int", "Num int", JOptionPane.QUESTION_MESSAGE);
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

		/* SEGUNDO BUCLE (DIGITOS) */
		while (num > 0) {
			digito = num % 10;
			num = num / 10;
			JOptionPane.showMessageDialog(null, "Los digitos de " + copia + " son " + digito);
		} // END WHILE
		/* SEGUNDO BUCLE (DIGITOS) */
	}
}
