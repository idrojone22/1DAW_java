package tema4_v13.modules.cursos.utils.CRUD;

import javax.swing.JOptionPane;

import tema4_v12.modules.cursos.classes.Desarrollo_web;
import tema4_v12.modules.cursos.classes.Desplegamiento_web;
import tema4_v12.modules.cursos.classes.Diseno_web;
import tema4_v12.modules.cursos.classes.Singleton;
import tema4_v12.modules.cursos.utils.func_buscar;
import tema4_v12.modules.cursos.utils.func_cursos;
import tema4_v12.utils.func_main;
import tema4_v12.utils.menus;

public class func_readone {
	
	public static void read_one_desarrollo() {
		Object menu_readone = null;
		Object atributos_dw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "fecha_i", "fecha_f", "fecha_confirmacion_i", "fecha_confirmacion_f", "fecha_inscripcion_i","fecha_inscripcion_f", "precioHora", "horasDias","fecha_compra", "precio", "salir" };
		int salir = 0;
		String ID_a = "";
		Desarrollo_web ID = null;
		int localizacion = -1;
		
		if (Singleton.array_desarrollo.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			ID_a = func_main.mostrarID();
			ID = (Desarrollo_web) func_cursos.preguntar_ID_desarrollo(ID_a);
			localizacion =  func_buscar.find(ID);
			if (localizacion != -1) {
				ID = Singleton.array_desarrollo.get(localizacion);
				menu_readone = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_dw,atributos_dw[12]);
				do {
					switch (menu_readone.toString()) {
						case "ID_course":
							JOptionPane.showMessageDialog(null, ID.get_ID_course());
							salir = 15;
							break;
						case "titulo":
							JOptionPane.showMessageDialog(null, ID.get_titulo());
							salir = 15;
							break;
						case "descripcion":
							JOptionPane.showMessageDialog(null, ID.get_descripcion());
							salir = 15;
							break;
						case "categoria":
							JOptionPane.showMessageDialog(null, ID.get_categoria());
							salir = 15;
							break;
						case "dificultad":
							JOptionPane.showMessageDialog(null, ID.get_dificultad());
							salir = 15;
							break;
						case "precio":
							JOptionPane.showMessageDialog(null, ID.get_precio());
							salir = 15;
							break;
						case "fecha_i":
							JOptionPane.showMessageDialog(null, ID.get_fecha_i());
							salir = 15;
							break;
						case "fecha_f":
							JOptionPane.showMessageDialog(null, ID.get_fecha_f());
							salir = 15;
							break;
						case "fecha_confirmacion_i":
							JOptionPane.showMessageDialog(null, ((Desarrollo_web) ID).get_fecha_confirmacion_i());
							salir = 15;
							break;
						case "fecha_confirmacion_f":
							JOptionPane.showMessageDialog(null, ((Desarrollo_web) ID).get_fecha_confirmacion_f());
							salir = 15;
							break;
						case "fecha_inscripcion_i":
							JOptionPane.showMessageDialog(null, ((Desarrollo_web) ID).get_fecha_inscripcion_i());
							salir = 15;
							break;
						case "fecha_inscripcion_f":
							JOptionPane.showMessageDialog(null, ((Desarrollo_web) ID).get_fecha_inscripcion_f());
							salir = 15;
							break;
						case "precioHora":
							JOptionPane.showMessageDialog(null, ID.get_precioHora());
							salir = 15;
							break;
						case "horasDias":
							JOptionPane.showMessageDialog(null, ID.get_horasDias());
							salir = 15;
							break;
						case "fecha_compra":
							JOptionPane.showMessageDialog(null, ID.get_fecha_compra());
							salir = 15;
							break;
						case "salir":
							salir = 15;
							break;
					}// end switch
				} while (salir != 15);
			} else {
				JOptionPane.showMessageDialog(null, "Error el Curso no exsiste");
			}
		}
	}

	public static void  read_one_diseno() {
		Object menu_readone = null;
		Object atributos_dw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "fecha_i", "fecha_f", "f_c_promocion_i","f_c_promocion_f", "precioHora", "horasDias","fecha_compra", "precio", "salir" };
		int salir = 0;
		String ID_a = "";
		Diseno_web ID = null;
		int localizacion = -1;

		if (Singleton.array_diseno.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			ID_a = func_main.mostrarID();
			ID = (Diseno_web) func_cursos.preguntar_ID_diseno(ID_a);
			localizacion =  func_buscar.find(ID);
			if (localizacion != -1) {
				ID = Singleton.array_diseno.get(localizacion);
				menu_readone = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_dw,atributos_dw[12]);
				do {
					switch (menu_readone.toString()) {
						case "ID_course":
							JOptionPane.showMessageDialog(null, ID.get_ID_course());
							salir = 15;
							break;
						case "titulo":
							JOptionPane.showMessageDialog(null, ID.get_titulo());
							salir = 15;
							break;
						case "descripcion":
							JOptionPane.showMessageDialog(null, ID.get_descripcion());
							salir = 15;
							break;
						case "categoria":
							JOptionPane.showMessageDialog(null, ID.get_categoria());
							salir = 15;
							break;
						case "dificultad":
							JOptionPane.showMessageDialog(null, ID.get_dificultad());
							salir = 15;
							break;
						case "precio":
							JOptionPane.showMessageDialog(null, ID.get_precio());
							salir = 15;
							break;
						case "fecha_i":
							JOptionPane.showMessageDialog(null, ID.get_fecha_i());
							salir = 15;
							break;
						case "fecha_f":
							JOptionPane.showMessageDialog(null, ID.get_fecha_f());
							salir = 15;
							break;
						case "f_c_promocion_i":
							JOptionPane.showMessageDialog(null, ((Diseno_web) ID).get_f_c_promocion_i());
							salir = 15;
							break;
						case "f_c_promocion_f":
							JOptionPane.showMessageDialog(null, ((Diseno_web) ID).get_f_c_promocion_f());
							salir = 15;
							break;
						case "precioHora":
							JOptionPane.showMessageDialog(null, ID.get_precioHora());
							salir = 15;
							break;
						case "horasDias":
							JOptionPane.showMessageDialog(null, ID.get_horasDias());
							salir = 15;
							break;
						case "fecha_compra":
							JOptionPane.showMessageDialog(null, ID.get_fecha_compra());
							salir = 15;
							break;
							}// end switch
				} while (salir != 15);
			} else {
				JOptionPane.showMessageDialog(null, "Error el Curso no exsiste");
			}
		}
	}
	
	public static void read_one_desplegamiento() {
		Object menu_readone = null;
		Object atributos_dw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "fecha_i", "fecha_f", "fecha_ultimas_plazas_i","fecha_ultimas_plazas_f", "precioHora", "horasDias","fecha_compra", "precio", "salir" };
		int salir = 0;
		String ID_a = "";
		Desplegamiento_web ID = null;
		int localizacion = -1;

		if (Singleton.array_desplegamiento.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			ID_a = func_main.mostrarID();
			ID = (Desplegamiento_web) func_cursos.preguntar_ID_desplegamiento1(ID_a);
			localizacion =  func_buscar.find(ID);
			if (localizacion != -1) {
				ID = Singleton.array_desplegamiento.get(localizacion);
				menu_readone = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_dw,atributos_dw[12]);
				do {
					switch (menu_readone.toString()) {
						case "ID_course":
							JOptionPane.showMessageDialog(null, ID.get_ID_course());
							salir = 15;
							break;
						case "titulo":
							JOptionPane.showMessageDialog(null, ID.get_titulo());
							salir = 15;
							break;
						case "descripcion":
							JOptionPane.showMessageDialog(null, ID.get_descripcion());
							salir = 15;
							break;
						case "categoria":
							JOptionPane.showMessageDialog(null, ID.get_categoria());
							salir = 15;
							break;
						case "dificultad":
							JOptionPane.showMessageDialog(null, ID.get_dificultad());
							salir = 15;
							break;
						case "precio":
							JOptionPane.showMessageDialog(null, ID.get_precio());
							salir = 15;
							break;
						case "fecha_i":
							JOptionPane.showMessageDialog(null, ID.get_fecha_i());
							salir = 15;
							break;
						case "fecha_f":
							JOptionPane.showMessageDialog(null, ID.get_fecha_f());
							salir = 15;
							break;
						case "fecha_ultimas_plazas_i":
							JOptionPane.showMessageDialog(null, ((Desplegamiento_web) ID).get_fecha_ultimas_plazas_i());
							salir = 15;
							break;
						case "fecha_ultimas_plazas_f":
							JOptionPane.showMessageDialog(null, ((Desplegamiento_web) ID).get_fecha_ultimas_plazas_f());
							salir = 15;
							break;
						case "precioHora":
							JOptionPane.showMessageDialog(null, ID.get_precioHora());
							salir = 15;
							break;
						case "horasDias":
							JOptionPane.showMessageDialog(null, ID.get_horasDias());
							salir = 15;
							break;
						case "fecha_compra":
							JOptionPane.showMessageDialog(null, ID.get_fecha_compra());
							salir = 15;
							break;
						}// end switch
				} while (salir != 15);
			} else {
				JOptionPane.showMessageDialog(null, "Error el Curso no exsiste");
			}
		}
	}
}
