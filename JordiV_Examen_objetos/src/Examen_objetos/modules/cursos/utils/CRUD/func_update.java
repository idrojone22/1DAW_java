package Examen_objetos.modules.cursos.utils.CRUD;

import javax.swing.JOptionPane;

import Examen_objetos.modules.cursos.classes.Cursos;
import Examen_objetos.modules.cursos.classes.Desarrollo_web;
import Examen_objetos.modules.cursos.classes.Desplegamiento_web;
import Examen_objetos.modules.cursos.classes.Diseno_web;
import Examen_objetos.modules.cursos.classes.IA;
import Examen_objetos.modules.cursos.classes.Singleton;
import Examen_objetos.modules.cursos.utils.func_buscar;
import Examen_objetos.modules.cursos.utils.func_cursos;

public class func_update {
	public static void update_desarrollo(String ID_a) {
		int localizacion = -1;
		Desarrollo_web ID = null;
		if (Singleton.array_desarrollo.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			 ID = (Desarrollo_web) func_cursos.preguntar_ID_desarrollo(ID_a);
			 localizacion =  func_buscar.find(ID);
			 if (localizacion != -1) {
				 ID = Singleton.array_desarrollo.get(localizacion);
				 //JOptionPane.showMessageDialog(null, ID);
				 ID = (Desarrollo_web) func_cursos.update(ID);
				 Singleton.array_desarrollo.set(localizacion, ID);
			 } else {
				 JOptionPane.showMessageDialog(null, "Error no exsiste el objeto");
			 }
		}
	}
	
	public static void update_ia(String ID_a) {
		int localizacion = -1;
		IA ID = null;
		if (Singleton.array_ia.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			 ID = (IA)func_cursos.preguntar_ID_ia_1(ID_a);
			 localizacion =  func_buscar.find(ID);
			 if (localizacion != -1) {
				 ID = Singleton.array_ia.get(localizacion);
				// JOptionPane.showMessageDialog(null, ID);
				 ID = (IA) func_cursos.update(ID);
				 Singleton.array_ia.set(localizacion, ID);
			 } else {
				 JOptionPane.showMessageDialog(null, "Error no exsiste el objeto");
			 }
		}
	}
	
	public static void update_diseno(String ID_a) {
		int localizacion = -1;
		Diseno_web ID = null;
		if (Singleton.array_diseno.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			 ID = (Diseno_web)func_cursos.preguntar_ID_diseno(ID_a);
			 localizacion =  func_buscar.find(ID);
			 if (localizacion != -1) {
				 ID = Singleton.array_diseno.get(localizacion);
				// JOptionPane.showMessageDialog(null, ID);
				 ID = (Diseno_web) func_cursos.update(ID);
				 Singleton.array_diseno.set(localizacion, ID);
			 } else {
				 JOptionPane.showMessageDialog(null, "Error no exsiste el objeto");
			 }
		}
	}
	
	public static void update_desplegamiento(String ID_a) {
		int localizacion = -1;
		Desplegamiento_web ID = null;
		if (Singleton.array_desplegamiento.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			 ID = (Desplegamiento_web)  func_cursos.preguntar_ID_desplegamiento1(ID_a);
			 localizacion =  func_buscar.find(ID);
			 if (localizacion != -1) {
				 ID = Singleton.array_desplegamiento.get(localizacion);
				 JOptionPane.showMessageDialog(null, ID);
				 ID = (Desplegamiento_web) func_cursos.update(ID);
				 Singleton.array_desplegamiento.set(localizacion, ID);
			 } else {
				 JOptionPane.showMessageDialog(null, "Error no exsiste el objeto");
			 }
		}
	}
}
