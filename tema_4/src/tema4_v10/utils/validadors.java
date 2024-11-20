package tema4_v10.utils;

import javax.swing.JOptionPane;

public class validadors {
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
	
	public static String validar_string(String mensaje, String titulo) {
		 String s = "";
		    boolean correcto = true;

		    do {
		        try {
		            s = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
		            correcto = true;
		            if (s == null) {
		                JOptionPane.showMessageDialog(null, "Saliendo de la aplicación", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
		                System.exit(0); // Al pulsar cancelar o cerrar, se termina la ejecución.
		            }
		            if (s.equals("")) {
		                JOptionPane.showMessageDialog(null, "Error de introducción de datos", "Error", JOptionPane.ERROR_MESSAGE);
		                correcto = false;
		            }
		        } catch (Exception e) {
		            JOptionPane.showMessageDialog(null, "No has introducido una cadena", "Error", JOptionPane.ERROR_MESSAGE);
		            correcto = false;
		        }
		    } while (!correcto);

		   // JOptionPane.showMessageDialog(null, "Has introducido: " + s, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		    return s; // Devuelve la cadena introducida
	}
}
