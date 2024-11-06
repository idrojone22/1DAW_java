package botones_combos;

import javax.swing.JOptionPane;

public class combos {

	public static void main(String[] args) {
		int n = 0;
		int cont_a = 0;
		int cont_e = 0;
		int cont_i = 0;
		int cont_o = 0;
		int cont_u = 0;
		String s = "";
		boolean correcto = false;
		Object seleccion1 = null;

		do {
			try {
				s = JOptionPane.showInputDialog(null, "Introduzca un numero", "Num int", JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación", "Saliendo",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					n = Integer.parseInt(s);
					correcto = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",
						JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}
		} while (correcto == false);
		System.out.println(n);

		for (int i = 0; i < n; i++) {
			seleccion1 = JOptionPane.showInputDialog(null, "Selecciona una vocal", "Selector de opciones",
					JOptionPane.QUESTION_MESSAGE, null, // null para icono defecto
					new Object[] { "letra_a", "letra_e", "letra_i", "letra_o", "letra_u" }, "letra_a");
			System.out.println(seleccion1.toString());

			switch (seleccion1.toString()) {
			case "letra_a":
				cont_a++;
				break;
			case "letra_e":
				cont_e++;
				break;
			case "letra_i":
				cont_i++;
				break;
			case "letra_o":
				cont_o++;
				break;
			case "letra_u":
				cont_u++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "No has elegido ninguna de las anteirores opciones");
			}// end_case
		} // end_for
		JOptionPane.showMessageDialog(null,
				"La vocal a se ha contado: " + cont_a + " veces \n" + "La vocal e se ha contado: " + cont_e
						+ " veces \n" + "La vocal i se ha contado: " + cont_i + " veces \n"
						+ "La vocal o se ha contado: " + cont_o + " veces \n" + "La vocal u se ha contado: " + cont_u
						+ " veces \n");

	}

}
