package calculadora;

import javax.swing.JOptionPane;

public class validar {

	public static int validar_int(String mensaje, String titulo) {

		int num = 0;
		String cad;
		boolean correcto = true;
		/* NUM */
		do {
			try {
				cad = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
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

		return num;
	}
}
