package Framework.bucle;

import javax.swing.JOptionPane;

public class desea_continuar {

	public static void main(String[] args) {
		
		/* VARIABLES */
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

			continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		} while (continuar == JOptionPane.OK_OPTION);
		/* PRIMER BUCLE */
	}
}
