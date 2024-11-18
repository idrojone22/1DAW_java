package tema4_v9.modules.courses.utils.CRUD;

import javax.swing.JOptionPane;

import tema4_v9.modules.courses.classes.Cursos;
import tema4_v9.modules.courses.classes.Desarrollo_web;
import tema4_v9.modules.courses.classes.Desplegamiento_web;
import tema4_v9.modules.courses.classes.Diseno_web;
import tema4_v9.modules.courses.classes.Singleton;
import tema4_v9.modules.courses.utils.func_buscar;
import tema4_v9.modules.courses.utils.func_cursos;

public class func_update {
	public static void update_desarrollo() {
		int localizacion = -1;
		Cursos ID = null;
		if (Singleton.array_curso.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			 ID = func_cursos.preguntar_ID_course();
			 localizacion =  func_buscar.find_curso(ID);
			 if (localizacion != -1) {
				 ID = Singleton.array_curso.get(localizacion);
				 JOptionPane.showMessageDialog(null, ID);
				 ID = (Desarrollo_web) func_cursos.update(ID);
				 Singleton.array_curso.set(localizacion, ID);
			 } else {
				 JOptionPane.showMessageDialog(null, "Error no exsiste el objeto");
			 }
		}
	}
	
	/*public static void update_diseno() {
		int localizacion = -1;
		Diseno_web ID = null;
		if (Singleton.array_diseno.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			 ID = func_cursos.preguntar_ID_diseno();
			 localizacion =  func_buscar.find_diseno(ID);
			 if (localizacion != -1) {
				 ID = Singleton.array_diseno.get(localizacion);
				 JOptionPane.showMessageDialog(null, ID);
				 ID = (Diseno_web) func_cursos.update(ID);
				 Singleton.array_diseno.set(localizacion, ID);
			 } else {
				 JOptionPane.showMessageDialog(null, "Error no exsiste el objeto");
			 }
		}
	}
	
	public static void update_desplegamiento() {
		int localizacion = -1;
		Desplegamiento_web ID = null;
		if (Singleton.array_desplegamiento.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			 ID = func_cursos.preguntar_ID_desplegamiento();
			 localizacion =  func_buscar.find_desplegamiento(ID);
			 if (localizacion != -1) {
				 ID = Singleton.array_desplegamiento.get(localizacion);
				 JOptionPane.showMessageDialog(null, ID);
				 ID = (Desplegamiento_web) func_cursos.update(ID);
				 Singleton.array_desplegamiento.set(localizacion, ID);
			 } else {
				 JOptionPane.showMessageDialog(null, "Error no exsiste el objeto");
			 }
		}
	}*/
}