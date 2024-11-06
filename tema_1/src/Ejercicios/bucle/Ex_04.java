package Ejercicios.bucle;
import javax.swing.JOptionPane;

public class Ex_04 {
	public static void main(String[] args) {
		/* Els 5 primers números que siguen impars i multiples de 3 */

		/* VARIABLES */
		int suma = 0;
		int num = 0;
		int cont = 0;
		String cad_user = "";
		/* VARIABLES */

		/* VALIDAR */
		String cad = "";
		boolean correcto = true;
		/* VALIDAR */

		while (cont < 5) {

			/* NUM */
			do {
				try {
					cad = JOptionPane.showInputDialog(null, "Escribe un num int", "Num int",
							JOptionPane.QUESTION_MESSAGE);
					if (cad == null) {
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicación", "Saliendo",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);// al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la
										// ejecución
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

			if (((num % 3) == 0) && ((num % 2) != 0)) {
				suma = suma + num;
				cont++;
			} // end if
		} // end while

		/* CADENA */
		cad_user = "La suma de los impares multiples de 3 es: " + suma;
		/* CADENA */

		/* CADENA */
		JOptionPane.showMessageDialog(null, cad_user);
		/* CADENA */
	}

}
