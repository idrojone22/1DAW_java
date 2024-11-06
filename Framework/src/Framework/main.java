package Framework;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		Object menu = null;
		Object menu_secundario = null;
		
		Object ejercicios[] = {"Ex_01", "Ex_02","Ex_03", "Ex_04", "Ex_05", "Ex_06","salir"};
		int salir = 0;
		Object opciones[] = {"seguir", "salir al menú principal", "salir"};
		
		int ex_01 = 0;
		int ex_02 = 0;
		
		do {
			menu = menus.combos("Selecciona el ejercicio", "Slector de opciones", ejercicios, ejercicios[0]);
			switch(menu.toString()) {
				case "Ex_01":
					do {
						ex_01 = ex.n_nums_media_nums_divisorsimpars();
						JOptionPane.showMessageDialog(null, "La media de los números con dos digitos impares  es: " + ex_01);
						menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", opciones, opciones[0]);
						if (menu_secundario == opciones[2]) {
							menu = ejercicios[1];
							System.exit(0);
							break;
						} // END If
					}while(menu_secundario == opciones[0]);
					break;
				case "Ex_02":
					do {
						ex_02 = ex.n_nums_media_digitos();
						JOptionPane.showMessageDialog(null, "La media de los números con dos digitos impares  es: " + ex_02);
						menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", opciones, opciones[0]);
						if (menu_secundario == opciones[2]) {
							menu = ejercicios[1];
							System.exit(0);
							break;
						} // END If
					}while(menu_secundario == opciones[0]);
					break;
				case "Ex_03":
					do {
						 ex.deseacont_digito_mayor_decadanum__repite();
						menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", opciones, opciones[0]);
						if (menu_secundario == opciones[2]) {
							menu = ejercicios[1];
							System.exit(0);
							break;
						} // END If
					}while(menu_secundario == opciones[0]);
					break;
				case "Ex_04":
					do {
						 ex. deseacont_digito_mayor__repite();
						menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", opciones, opciones[0]);
						if (menu_secundario == opciones[2]) {
							menu = ejercicios[1];
							System.exit(0);
							break;
						} // END If
					}while(menu_secundario == opciones[0]);
					break;
				case "Ex_05":
					do {
						 ex.  primers_5_num_sumar_els_que_tinguen_2_digitos_pars();
						menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", opciones, opciones[0]);
						if (menu_secundario == opciones[2]) {
							menu = ejercicios[1];
							System.exit(0);
							break;
						} // END If
					}while(menu_secundario == opciones[0]);
					break;
				case "Ex_06":
					do {
						 ex.acabar_media_digtios_multiplos3_mayor_5();
						menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", opciones, opciones[0]);
						if (menu_secundario == opciones[2]) {
							menu = ejercicios[1];
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
			}// END SWITHC
		} while (salir != 6);
	}
}