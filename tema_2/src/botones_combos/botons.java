package botones_combos;

import javax.swing.JOptionPane;

public class botons {

	public static void main(String[] args) {
		int op = 0, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
		String[] tipo = { "A", "E", "I", "O", "U", "Salir" };

		do {
			op = JOptionPane.showOptionDialog(null, "Pulsa una vocal cuantas veces quieras", "Contador de vocales", 0,
					JOptionPane.QUESTION_MESSAGE, null, tipo, tipo[0]);
			switch (op) {
			case 0: {
				num1++;
				break;
			}
			case 1: {
				num2++;
				break;
			}
			case 2: {
				num3++;
				break;
			}
			case 3: {
				num4++;
				break;
			}
			case 4: {
				num5++;
				break;
			}
			case 5: {
				JOptionPane.showMessageDialog(null, "Gracias por usar nuestro contador");
				op = 5;
				break;
			}
			}// end switch
		} while (op != 5);// end while
		JOptionPane.showMessageDialog(null, "Numero de veces pulsado\n" + "A: " + num1 + "\n" + "E: " + num2 + "\n"
				+ "I: " + num3 + "\n" + "O: " + num4 + "\n" + "U: " + num5);
	}
}