package tema4_v05;

import javax.swing.JOptionPane;

public class menu_dif_cat {
	/*combis_dif*/
	public static Object combos_dif(String Opciones1, String Opciones2) {
		Object menu[] = {"Fácil", "Intermedio", "Dificl"};
		Object mostrar = null;
		mostrar = JOptionPane.showInputDialog(null, Opciones1, Opciones2,
				JOptionPane.QUESTION_MESSAGE, null, menu, menu[1]);
		return mostrar;
	}
	/*combis_dif*/
	
	/*combis_cat*/
	public static Object combos_cat(String Opciones1, String Opciones2) {
		Object menu[] = {"Principal", "Secundaria"};
		Object mostrar = null;
		mostrar = JOptionPane.showInputDialog(null, Opciones1, Opciones2,
				JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
		
		return mostrar;
	}
	/*combis_cat*/
}
