package Examen_objetos.modules.cursos.utils.CRUD;

import javax.swing.JOptionPane;

import Examen_objetos.modules.cursos.classes.Cursos;
import Examen_objetos.modules.cursos.classes.Desarrollo_web;
import Examen_objetos.modules.cursos.classes.Desplegamiento_web;
import Examen_objetos.modules.cursos.classes.Diseno_web;
import Examen_objetos.modules.cursos.classes.Singleton;
import Examen_objetos.modules.cursos.utils.func_buscar;
import Examen_objetos.modules.cursos.utils.func_cursos;



public class func_create {
	public static void crear_desarrollo() {
		
		int localizacion = -1;
		Cursos ID = func_cursos.preguntar_ID_course();
		//JOptionPane.showMessageDialog(null, ID.toString());
		localizacion =  func_buscar.find(ID);
		//JOptionPane.showMessageDialog(null, localizacion);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El ID ya exsiste");
		} else {
			ID =  func_cursos.crear_desarrollo();
			Singleton.array_desarrollo.add(((Desarrollo_web)ID));
			//JOptionPane.showMessageDialog(null, ID.toString());
		}
	}
	public static void crear_diseno() {
		
		int localizacion = -1;
		Cursos ID = func_cursos.preguntar_ID_diseno();
		//JOptionPane.showMessageDialog(null, ID.toString());
		localizacion =  func_buscar.find(ID);
		//JOptionPane.showMessageDialog(null, localizacion);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El ID ya exsiste");
		} else {
			ID =  func_cursos.crear_diseno();
			Singleton.array_diseno.add((Diseno_web) ID);
			//JOptionPane.showMessageDialog(null, ID.toString());
		}
	}
	
	public static void crear_desplegamiento() {
		
		int localizacion = -1;
		Cursos ID = func_cursos.preguntar_ID_desplegamiento();
		//JOptionPane.showMessageDialog(null, ID.toString());
		localizacion =  func_buscar.find(ID);
		//JOptionPane.showMessageDialog(null, localizacion);
		if (localizacion != -1) {
			//JOptionPane.showMessageDialog(null,"El ID ya exsiste");
		} else {
			ID =  func_cursos.crear_desplegamiento();
			Singleton.array_desplegamiento.add((Desplegamiento_web) ID);
			//JOptionPane.showMessageDialog(null, ID.toString());
		}
	}
}
