package tema4_v03;
import javax.swing.JOptionPane;

public class menus {
	public static int boton(String[] menu, String uno, String titulo) {

		int num = 0;
		num = JOptionPane.showOptionDialog(null, uno, titulo, 0, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
		return num;
	}
	
	public static Object combos(String Opcions1,  String Opcions2, Object[] menu1, Object salir ) {
		
		Object menu = null;
		
		menu = JOptionPane.showInputDialog(null, Opcions1, Opcions2,
				JOptionPane.QUESTION_MESSAGE, null, menu1, salir);
		return menu;
	}{
		
	}	
}
