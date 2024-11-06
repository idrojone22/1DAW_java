package calculadora.mejora;
import javax.swing.JOptionPane;

import calculadora.menus;
public class calculadora_mejora_botons {

	public static void main(String[] args) {
		/* CALCULADORA */

		int mp = 0;/* Menu principal */
		String[] m_principal = { "Suma", "Resta", "Multiplicación", "División"," Digitos","Divsores", "Salir" }; /* Menu principal */

		int ms = 0;/* Menu secundari */
		String[] m_secundario = { "Seguir", "Salir al menu princial", "Salir" }; /* Menu secundari */
		
		do {

			mp = menus.boton(m_principal, "¿Que operación quieres realizar?", " ");

			switch (mp) {
			case 0: {
				do {
					function_calculadora.suma();
					ms = menus.boton(m_secundario, "¿Que quieres hacer?", "");
					if (ms == 2) {
						mp = 6;
						break;
					}
				} while (ms != 1);
				break;
			}
			case 1: {
				do {
					 function_calculadora.resta();
					ms = menus.boton(m_secundario, "¿Que quieres hacer?", "");

					if (ms == 2) {
						mp = 6;
						break;
					}
				} while (ms != 1);
				break;
			}
			case 2: {
				do {
					function_calculadora.multiplicacion();
					ms = menus.boton(m_secundario, "¿Que quieres hacer?", "");	
					if (ms == 2) {
						mp = 6;
						break;
					}
				} while (ms != 1);
				break;
			}
			case 3: {
				do {
					 function_calculadora.division();
					ms = menus.boton(m_secundario, "¿Que quieres hacer?", "");
					if (ms == 2) {
						mp = 6;
						break;
					}
				} while (ms != 1);
				break;
			}
			case 4: {
				do {
					function_calculadora.digitos();
					ms = menus.boton(m_secundario, "¿Que quieres hacer?", "");
					if (ms == 2) {
						mp = 6;
						break;
					}
				} while (ms != 1);
				break;
			}
			case 5: {
				do {
					function_calculadora.divisors();
					ms = menus.boton(m_secundario, "¿Que quieres hacer?", "");
					if (ms == 2) {
						mp = 6;
						break;
					}
			} while (ms != 1);
				break;
			}
			case 6: {
				JOptionPane.showMessageDialog(null, "Gracias por utilizar la calculadora de idrojone\n" + "\n");
				break;
			}
			}// END SWITCH
		} while (mp != 6);// END WHILE
	}
}