package tema4_v11.utils;

import tema4_v11.modules.courses.classes.Desarrollo_web;
import tema4_v11.modules.courses.classes.Singleton;
import tema4_v11.modules.courses.dummies.dummies;

public class func_main {
	public static String mostrarID() {
		Object ID_array = null;
		String[] recorrer_array = new String[Singleton.array_desarrollo.size()];
		 for (int i = 0; i < Singleton.array_desarrollo.size(); i++) {
	            Desarrollo_web obj = Singleton.array_desarrollo.get(i);
	            recorrer_array[i] = String.valueOf(obj.get_ID_course()); // Obtener solo el ID como String
	        }
		 ID_array = menus.combos("Selecciona la opción", "Manual o Automático",recorrer_array , recorrer_array[0]);
		 return ID_array.toString();
	}
	
	public static void dummies() {
		Object manual_auto_menu = null;
		Object manual_auto[] = {"auto", "manual"};
		int n = 0;
		
		manual_auto_menu = menus.combos("Selecciona la opción", "Manual o Automático",manual_auto , manual_auto[0]);
		
		if (manual_auto_menu.toString() == "auto") {
			n = validadors.validar_int("Cuántos objetos quieres automáticos", "Repeticiones");
			for (int i = 0; i < n; i++) {
				dummies.crear_cursos();
			} // end for
		} // end if
	}
}
