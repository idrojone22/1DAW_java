package Framework.bucle;
import javax.swing.JOptionPane;
public class n_nums {

	public static void main(String[] args) {
		
		/* VARIABLES */
		int num = 0;
		String cad_user = "";
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
					cad= JOptionPane.showInputDialog(null, "Escribe un num ", "Num int", JOptionPane.QUESTION_MESSAGE);
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
		} // END FOR
		/* PRIEMR BUCLE */
	}
}