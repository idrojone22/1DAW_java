package Examen;
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		Object menu = null;
		Object menu_secundario = null;
		
		Object ejercicios[] = {"Ex_01", "Ex_02","Ex_03", "Ex_04","salir"};
		int salir = 0;
		Object opciones[] = {"seguir", "salir al menú principal", "salir"};
		
		do {
			//
			menu = menus.combos("Selecciona el ejercicio", "Slector de opciones", ejercicios, ejercicios[0]);
			switch(menu.toString()) {
			case "Ex_01":
				do {
					exercisis.Ex_01();
					//JOptionPane.showMessageDialog(null, "Ex_01");
					menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", opciones, opciones[0]);
					if (menu_secundario == opciones[2]) {
						menu = ejercicios[1];
						JOptionPane.showMessageDialog(null, "Gracias por utlizar el framework de idrojone");
						System.exit(0);
						break;
					} // END If
				}while(menu_secundario == opciones[0]);
				break;
			case "Ex_02":
				do {
					exercisis.Ex_02();
					menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", opciones, opciones[0]);
					if (menu_secundario == opciones[2]) {
						menu = ejercicios[1];
						JOptionPane.showMessageDialog(null, "Gracias por utlizar el framework de idrojone");
						System.exit(0);
						break;
					} // END If
				}while(menu_secundario == opciones[0]);
				break;
			case "Ex_03":
				do {
					exercisis.Ex_03();
					menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", opciones, opciones[0]);
					if (menu_secundario == opciones[2]) {
						menu = ejercicios[1];
						JOptionPane.showMessageDialog(null, "Gracias por utlizar el framework de idrojone");
						System.exit(0);
						break;
					} // END If
				}while(menu_secundario == opciones[0]);
				break;
			case "Ex_04":
				do {
					exercisis.Ex_04();
					menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", opciones, opciones[0]);
					if (menu_secundario == opciones[2]) {
						menu = ejercicios[1];
						JOptionPane.showMessageDialog(null, "Gracias por utlizar el framework de idrojone");
						System.exit(0);
						break;
					} // END If
				}while(menu_secundario == opciones[0]);
				break;
			case "salir":
				JOptionPane.showMessageDialog(null, "Gracias por utlizar el framework de idrojone");
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "No has elegido ninguna de las anteriores opciones");
			} // end switch
		}while (salir != 4);
	}
}
