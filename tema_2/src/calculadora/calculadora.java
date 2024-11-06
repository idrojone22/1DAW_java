package calculadora;

import javax.swing.JOptionPane;

import calculadora.mejora.validar;

public class calculadora {

	public static void main(String[] args) {

		/* CALCULADORA */

		/* VARIABLES */
		int operacion = 0;
		int num1 = 0;
		int num2 = 0;
		int copia = 0;
		int digito = 0;
		/* VARIABLES */

		int mp = 0;/* Menu principal */
		String[] m_principal = { "Suma", "Resta", "Multiplicación", "División"," Digitos", "Salir" }; /* Menu principal */

		int ms = 0;/* Menu secundari */
		String[] m_secundario = { "Seguir", "Salir al menu princial", "Salir" }; /* Menu secundari */

		do {

			mp = menus.boton(m_principal, "¿Que operación quieres realizar?", " ");

			operacion = 0;
			switch (mp) {
			case 0: {
				do {
					
					num1 = validar.validar_int("Escribe un num1", "Num int");
					num2 = validar.validar_int("Escribe un num2", "Num int");

					/* SUMA */
					operacion = num1 + num2;
					/* SUMA */
					JOptionPane.showMessageDialog(null, "La suma es: " + operacion);
					operacion = 

					ms = menus.boton(m_secundario, "¿Que quieres hacer?", "");

					if (ms == 2) {
						mp = 4;
						JOptionPane.showMessageDialog(null, "Gracias por utilizar la calculadora de idrojone\n" + "\n");
						break;
					}
				} while (ms != 1);
				break;
			}
			case 1: {
				do {
					num1 = validar.validar_int("Escribe un num1", "Num int");
					num2 = validar.validar_int("Escribe un num2", "Num int");

					/* RESTA */
					operacion = num1 - num2;
					/* RESTA */

					JOptionPane.showMessageDialog(null, "La resta es: " + operacion);

					ms = menus.boton(m_secundario, "¿Que quieres hacer?", "");

					if (ms == 2) {
						mp = 4;
						JOptionPane.showMessageDialog(null, "Gracias por utilizar la calculadora de idrojone\n" + "\n");
						break;
					}
				} while (ms != 1);
				break;
			}
			case 2: {
				do {

					num1 = validar.validar_int("Escribe un num1", "Num int");
					num2 = validar.validar_int("Escribe un num2", "Num int");

					/* MULTIPLICACION */
					operacion = num1 * num2;
					/* MULTIPLIACION */

					JOptionPane.showMessageDialog(null, "La multiplicación es: " + operacion);

					ms = menus.boton(m_secundario, "¿Que quieres hacer?", "");
					if (ms == 2) {
						mp = 4;
						JOptionPane.showMessageDialog(null, "Gracias por utilizar la calculadora de idrojone\n" + "\n");
						break;
					}
				} while (ms != 1);
				break;
			}
			case 3: {
				do {
					num1 = validar.validar_int("Escribe un num1", "Num int");
					num2 = validar.validar_int("Escribe un num2", "Num int");

					if (num1 != 0 && num2 != 0) {
						/* DIVISION */
						operacion = num1 / num2;
						/* DIVISION */
						JOptionPane.showMessageDialog(null, "La división es: " + operacion);
					} else {
						JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
					} // END IF

					ms = menus.boton(m_secundario, "¿Que quieres hacer?", "");
					if (ms == 2) {
						mp = 4;
						JOptionPane.showMessageDialog(null, "Gracias por utilizar la calculadora de idrojone\n" + "\n");
						break;
					}
				} while (ms != 1);
				break;
			}
			case 4: {
				num1 = validar.validar_int("Escribe un num1", "Num int");
				copia = num1;
				while (num1 > 0) {
					digito = num1 % 10;
					num1 = num1 / 10;
					JOptionPane.showMessageDialog(null, "Los digitos de " + copia + " son " + digito);
				} // END WHILE
				break;
			}
			case 5: {
				JOptionPane.showMessageDialog(null, "Gracias por utilizar la calculadora de idrojone\n" + "\n");
				mp = 5;
				break;
			}
			}// END SWITCH
		} while (mp != 5);// END WHILE
	}
}