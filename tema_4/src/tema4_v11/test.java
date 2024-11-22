package tema4_v11;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import tema4_v02.menus;
import tema4_v11.modules.courses.dummies.desarrollo_dummies;
import tema4_v11.modules.courses.dummies.desplegamiento_dummies;
import tema4_v11.modules.courses.dummies.diseno_dummies;
import tema4_v11.modules.courses.dummies.dummies;
import tema4_v11.utils.validadors;


public class test {

	public static void main(String[] args) {
		Object manual_auto_menu = null;
		Object manual_auto[] = {"auto", "manual"};
		int n = 0;
		
		manual_auto_menu = menus.combos("Selecciona la opción", "Manual o Automático",manual_auto , manual_auto[0]);
		
		if (manual_auto_menu.toString() == "auto") {
			n = validadors.validar_int("Cuántos objetos quieres automáticos", "Repeticiones");
			for (int i = 0; i < n; i++) {
				dummies.crear_cursos();
			}
		}
		
		
	}
}
