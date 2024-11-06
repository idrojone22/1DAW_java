package calculadora.mejora;
import javax.swing.JOptionPane;

import calculadora.menus;
public class calculadora_mejora_combos {

	public static void main(String[] args) {
		/*CALCULADORA MEJORA COMBOS*/
		
		Object menu = null;
		Object menu2 = null;
		Object operaciones[] =  { "suma", "resta", "multiplicación", "división", "digitos"," divisors","salir" };
		int salir = 0;
		Object opciones[] =  { "seguir", "salir al menú principal", "salir" };
		
		do {
			menu = menus.combos("Seleciona la operación", "Selector de opciones", operaciones, operaciones[0]);
			switch (menu.toString()) {
				case "suma":
					do {
						function_calculadora.suma();
						menu2 = menus.combos("Slecciona la opción", "Selector de opciones", opciones, opciones[0] );
						if (menu2 == opciones[2]) {
							menu = operaciones[6];
							System.exit(0);
							break;
						} // END If
					}while(menu2 == opciones[0]);
					break;
				case "resta":
					do {
						function_calculadora.resta();
						menu2 = menus.combos("Slecciona la opción", "Selector de opciones", opciones, opciones[0] );
						if (menu2 == opciones[2]) {
							menu = operaciones[6];
							System.exit(0);
							break;
						} // END If
					}while(menu2 == opciones[0]);
					break;
				case "multiplicación":
					do {
						function_calculadora.multiplicacion();
						menu2 = menus.combos("Slecciona la opción", "Selector de opciones", opciones, opciones[0] );
						if (menu2 == opciones[2]) {
							menu = operaciones[6];
							System.exit(0);
							break;
						} // END If
					}while(menu2 == opciones[0]);
					break;
				case "división":
					do {
						function_calculadora.division();
						menu2 = menus.combos("Slecciona la opción", "Selector de opciones", opciones, opciones[0] );
						if (menu2 == opciones[2]) {
							menu = operaciones[6];
							System.exit(0);
							break;
						} // END If
					}while(menu2 == opciones[0]);
					break;
				case "digitos":
					do {
						function_calculadora.digitos();
						menu2 = menus.combos("Slecciona la opción", "Selector de opciones", opciones, opciones[0] );
						if (menu2 == opciones[2]) {
							menu = operaciones[6];
							System.exit(0);
							break;
						} // END If
					}while(menu2 == opciones[0]);
					break;
				case "divisors":
					do {
						function_calculadora.divisors();
						menu2 = menus.combos("Slecciona la opción", "Selector de opciones", opciones, opciones[0] );
						if (menu2 == opciones[2]) {
							menu = operaciones[6];
							System.exit(0);
							break;
						} // END If
					}while(menu2 == opciones[0]);
					break;
				case "salir":
					JOptionPane.showMessageDialog(null, "Gracias por utlizar la calculadora de idrojone");
					break;
					default: 
						JOptionPane.showMessageDialog(null, "No has elegido ninguna de las anteirores opciones");
			}
		}while(salir != 6);
	}
}