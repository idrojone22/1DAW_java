package tema4_v8.modules.courses.utils.F_CRUD;

import javax.swing.JOptionPane;

import tema4_v3.validadors;
import tema4_v7.classes.Fecha;
import tema4_v8.modules.courses.classes.Cursos;
import tema4_v8.modules.courses.classes.Desarrollo_web;
import tema4_v8.modules.courses.classes.Desplegamiento_web;
import tema4_v8.modules.courses.classes.Diseno_web;
import tema4_v8.modules.courses.classes.Singleton;
import tema4_v8.modules.courses.utils.func_buscar;
import tema4_v8.modules.courses.utils.func_cursos;
import tema4_v8.modules.courses.utils.func_fecha;
import tema4_v8.modules.courses.utils.func_precio;
import tema4_v8.modules.courses.utils.menu_dif_cat;
import tema4_v8.modules.courses.utils.validar_regex;

public class func_create {
	public static void crear_desarrollo() {
		
		int localizacion = -1;
		Desarrollo_web ID = func_cursos.preguntar_ID_course();
		//JOptionPane.showMessageDialog(null, ID.toString());
		localizacion =  func_buscar.find_desarrollo(ID);
		//JOptionPane.showMessageDialog(null, localizacion);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El ID ya exsiste");
		} else {
			ID =  func_cursos.crear_desarrollo();
			Singleton.array_desarrollo.add(ID);
			//JOptionPane.showMessageDialog(null, ID.toString());
		}
	}
	public static void crear_diseno() {
		
		int localizacion = -1;
		Diseno_web ID = func_cursos.preguntar_ID_diseno();
		//JOptionPane.showMessageDialog(null, ID.toString());
		localizacion =  func_buscar.find_diseno(ID);
		//JOptionPane.showMessageDialog(null, localizacion);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El ID ya exsiste");
		} else {
			ID =  func_cursos.crear_diseno();
			Singleton.array_diseno.add(ID);
			//JOptionPane.showMessageDialog(null, ID.toString());
		}
	}
	
	public static void crear_desplegamiento() {
		
		int localizacion = -1;
		Desplegamiento_web ID = func_cursos.preguntar_ID_desplegamiento();
		JOptionPane.showMessageDialog(null, ID.toString());
		localizacion =  func_buscar.find_desplegamiento(ID);
		JOptionPane.showMessageDialog(null, localizacion);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El ID ya exsiste");
		} else {
			ID =  func_cursos.crear_desplegamiento();
			Singleton.array_desplegamiento.add(ID);
			JOptionPane.showMessageDialog(null, ID.toString());
		}
	}
}
