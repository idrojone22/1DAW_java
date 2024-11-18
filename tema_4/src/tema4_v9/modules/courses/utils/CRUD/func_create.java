package tema4_v9.modules.courses.utils.CRUD;

import javax.swing.JOptionPane;


import tema4_v9.modules.courses.classes.Desarrollo_web;
import tema4_v9.modules.courses.classes.Desplegamiento_web;
import tema4_v9.modules.courses.classes.Diseno_web;
import tema4_v9.modules.courses.classes.Singleton;
import tema4_v9.modules.courses.utils.func_buscar;
import tema4_v9.modules.courses.utils.func_cursos;

public class func_create {
	public static void crear_desarrollo(int i) {
		
		int localizacion = -1;
		
		if (i == 0) {
			Desarrollo_web ID = func_cursos.preguntar_ID_course();
			localizacion =  func_buscar.find_curso(ID);
			if (localizacion != -1) {
				JOptionPane.showMessageDialog(null,"El ID ya exsiste");
			} else {
				ID =  func_cursos.crear_desarrollo();
				Singleton.array_curso.add(ID);
			}
		} 	

		if (i == 1) {
			Diseno_web ID = func_cursos.preguntar_ID_diseno();
			localizacion =  func_buscar.find_curso(ID);
			if (localizacion != -1) {
				JOptionPane.showMessageDialog(null,"El ID ya exsiste");
			} else {
				ID =  func_cursos.crear_diseno();
				Singleton.array_curso.add(ID);
			}
		}
		
		if (i == 2) {
			Desplegamiento_web ID = func_cursos.preguntar_ID_desplegamiento();
			localizacion =  func_buscar.find_curso(ID);
			if (localizacion != -1) {
				JOptionPane.showMessageDialog(null,"El ID ya exsiste");
			} else {
				ID =  func_cursos.crear_desplegamiento();
				Singleton.array_curso.add(ID);
			}
		}	
	}
}