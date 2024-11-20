package tema4_v7.modules.course.utils;

import javax.swing.JOptionPane;

import tema4_v3.validadors;
import tema4_v7.classes.Fecha;
import tema4_v7.modules.course.classes.Cursos;
import tema4_v7.modules.course.classes.Desarrollo_web;
import tema4_v7.modules.course.classes.Desplegamiento_web;
import tema4_v7.modules.course.classes.Diseno_web;
import tema4_v7.utils.menus;

public class CRUD {

	/* CRUD */

	/* CREATE (crear) */
	public static Cursos create(int curso) {

		Cursos objeto = null;

		String ID_course = validar_regex.validar_reg_id();
		String titulo = validadors.validar_string("Dame un String", "titulo");
		String descripcion = validadors.validar_string("Dame un String", "descripcion");
		String categoria = (String) menu_dif_cat.combos_cat("Seleccione la categoria", "Categoria");
		String dificultad = (String) menu_dif_cat.combos_dif("Selecciona la dificultad", "Dificultad");
		Fecha fecha_i = func_fecha.craar("fecha_i");
		Fecha fecha_f = func_fecha.crear_fecha_automatic_suma("fecha_f", fecha_i, 20);
		int precioHora = validadors.validar_int("Dame num", "precioHora");
		int horasDias = validar_regex.validar_horas();

		if (curso == 0) {

			Fecha fecha_inscripcion_i =  func_fecha.crear_fecha_automatic("fecha_inscripcion_i", fecha_i, 7);
			Fecha fecha_inscripcion_f =  func_fecha.crear_fecha_automatic("fecha_inscripcion_f", fecha_i, 4);
			Fecha fecha_confirmacion_i =func_fecha.crear_fecha_automatic("fecha_confirmacion_i", fecha_i, 3);
			Fecha fecha_confirmacion_f = func_fecha.crear_fecha_automatic("fecha_confirmacion_f", fecha_i, 1);
			Fecha fecha_compra = func_fecha.crear_fecha_compra("fecha_compra",fecha_i);
			int precio = func_precio.calcular_precio(fecha_i, fecha_f, precioHora, horasDias);

			objeto = new Desarrollo_web(ID_course, titulo, descripcion,categoria, dificultad,fecha_i,fecha_f, precioHora, horasDias,fecha_confirmacion_i, fecha_confirmacion_f, fecha_inscripcion_i, fecha_inscripcion_f, fecha_compra, precio);
		}

		if (curso == 1) {

			Fecha f_c_promocion_i = func_fecha.crear_fecha_anterior("f_c_promocion_i", fecha_i);
			Fecha f_c_promocion_f = func_fecha.crear_entre2("f_c_promocion_f", f_c_promocion_i, fecha_i);
			Fecha fecha_compra = func_fecha.crear_fecha_compra("fecha_compra", fecha_i );
			int precio = func_precio.calcular_precio_ultimas_plazas(fecha_i, fecha_f, precioHora, horasDias,f_c_promocion_i,  f_c_promocion_f, fecha_compra);
			objeto = new Diseno_web(ID_course, titulo, descripcion, categoria, dificultad, fecha_i, fecha_f, precioHora, horasDias, f_c_promocion_i, f_c_promocion_f,fecha_compra, precio);
		}
		
		if (curso == 2) {
			
			Fecha fecha_ultimas_plazas_i = func_fecha.crear_fecha_anterior("fecha_ultimas_plazas_i", fecha_i);
			Fecha fecha_ultimas_plazas_f = func_fecha.crear_entre2("fecha_ultimas_plazas_f", fecha_ultimas_plazas_i,fecha_i);
			Fecha fecha_compra = func_fecha.crear_fecha_compra("fecha_compra", fecha_i );
			int precio = func_precio.calcular_precio_ultimas_plazas(fecha_i, fecha_f, precioHora, horasDias,fecha_ultimas_plazas_i, fecha_ultimas_plazas_f, fecha_compra);
			
			objeto = new Desplegamiento_web(ID_course, titulo, descripcion, categoria, dificultad, fecha_i, fecha_f, precioHora, horasDias, fecha_ultimas_plazas_i, fecha_ultimas_plazas_f,fecha_compra, precio);
		}
		return objeto;
	}
	/* CREATE (crear) */

	/* READALL */
	public static void readall(Cursos objeto) {
		if (objeto != null) {
			if (objeto instanceof Desarrollo_web) {
				JOptionPane.showMessageDialog(null, objeto.toString());
			}
			if (objeto instanceof Diseno_web) {
				JOptionPane.showMessageDialog(null, objeto.toString());
			}
			if (objeto instanceof Desplegamiento_web) {
				JOptionPane.showMessageDialog(null, objeto.toString());
			}
		} else {
			JOptionPane.showMessageDialog(null, "No exsiste el objeto");
		}
	}
	/* READALL */

	/* READONE */
	public static void readone(Cursos objeto) {
		
		Object menu_readone = null;
		Object atributos_dw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "fecha_i", "fecha_f", "fecha_confirmacion_i", "fecha_confirmacion_f", "fecha_inscripcion_i","fecha_inscripcion_f", "precioHora", "horasDias","fecha_compra", "precio", "salir" };
		Object atributos_diw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "precio", "fecha_i","fecha_f", "f_c_promocion_i", "f_c_promocion_f", "precioHora", "horasDias","fecha_compra",  "salir" };
		Object atributos_despw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "precio", "fecha_i", "fecha_f", "fecha_ultimas_plazas_i", "fecha_ultimas_plazas_f", "precioHora", "horasDias","fecha_compra", "salir" };
		int salir = 0;

		if (objeto != null) {
			if (objeto instanceof Desarrollo_web) {
				menu_readone = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_dw,atributos_dw[12]);
				do {
					switch (menu_readone.toString()) {
						case "ID_course":
							JOptionPane.showMessageDialog(null, objeto.get_ID_course());
							salir = 15;
							break;
						case "titulo":
							JOptionPane.showMessageDialog(null, objeto.get_titulo());
							salir = 15;
							break;
						case "descripcion":
							JOptionPane.showMessageDialog(null, objeto.get_descripcion());
							salir = 15;
							break;
						case "categoria":
							JOptionPane.showMessageDialog(null, objeto.get_categoria());
							salir = 15;
							break;
						case "dificultad":
							JOptionPane.showMessageDialog(null, objeto.get_dificultad());
							salir = 15;
							break;
						case "precio":
							JOptionPane.showMessageDialog(null, objeto.get_precio());
							salir = 15;
							break;
						case "fecha_i":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_i());
							salir = 15;
							break;
						case "fecha_f":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_f());
							salir = 15;
							break;
						case "fecha_confirmacion_i":
							JOptionPane.showMessageDialog(null, ((Desarrollo_web) objeto).get_fecha_confirmacion_i());
							salir = 15;
							break;
						case "fecha_confirmacion_f":
							JOptionPane.showMessageDialog(null, ((Desarrollo_web) objeto).get_fecha_confirmacion_f());
							salir = 15;
							break;
						case "fecha_inscripcion_i":
							JOptionPane.showMessageDialog(null, ((Desarrollo_web) objeto).get_fecha_inscripcion_i());
							salir = 15;
							break;
						case "fecha_inscripcion_f":
							JOptionPane.showMessageDialog(null, ((Desarrollo_web) objeto).get_fecha_inscripcion_f());
							salir = 15;
							break;
						case "precioHora":
							JOptionPane.showMessageDialog(null, objeto.get_precioHora());
							salir = 15;
							break;
						case "horasDias":
							JOptionPane.showMessageDialog(null, objeto.get_horasDias());
							salir = 15;
							break;
						case "fecha_compra":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_compra());
							salir = 15;
							break;
						case "salir":
							salir = 15;
							break;
					}// end switch
				} while (salir != 15);
			}
			
			if (objeto instanceof Desplegamiento_web) {
				menu_readone = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_despw, atributos_despw[10]);
				do {
					switch (menu_readone.toString()) {
						case "ID_course":
							JOptionPane.showMessageDialog(null, objeto.get_ID_course());
							salir = 13;
							break;
						case "titulo":
							JOptionPane.showMessageDialog(null, objeto.get_titulo());
							salir = 13;
							break;
						case "descripcion":
							JOptionPane.showMessageDialog(null, objeto.get_descripcion());
							salir = 13;
							break;
						case "categoria":
							JOptionPane.showMessageDialog(null, objeto.get_categoria());
							salir = 13;
							break;
						case "dificultad":
							JOptionPane.showMessageDialog(null, objeto.get_dificultad());
							salir = 13;
							break;
						case "precio":
							JOptionPane.showMessageDialog(null, objeto.get_precio());
							salir = 13;
							break;
						case "fecha_i":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_i());
							salir = 13;
							break;
						case "fecha_f":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_f());
							salir = 13;
							break;
						case "fecha_ultimas_plazas_i":
							JOptionPane.showMessageDialog(null,((Desplegamiento_web) objeto).get_fecha_ultimas_plazas_i());
							salir = 13;
							break;
						case "fecha_ultimas_plazas_f":
							JOptionPane.showMessageDialog(null,((Desplegamiento_web) objeto).get_fecha_ultimas_plazas_f());
							salir = 13;
							break;
						case "precioHora":
							JOptionPane.showMessageDialog(null, objeto.get_precioHora());
							salir = 13;
							break;
						case "horasDias":
							JOptionPane.showMessageDialog(null, objeto.get_horasDias());
							salir = 13;
							break;
						case "fecha_compra":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_compra());
							salir = 13;
							break;
						case "salir":
							break;
					}// end switch
				} while (salir != 13);
			}
			if (objeto instanceof Diseno_web) {
				menu_readone = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_diw, atributos_diw[10]);
				do {
					switch (menu_readone.toString()) {
						case "ID_course":
							JOptionPane.showMessageDialog(null, objeto.get_ID_course());
							salir = 13;
							break;
						case "titulo":
							JOptionPane.showMessageDialog(null, objeto.get_titulo());
							salir = 13;
							break;
						case "descripcion":
							JOptionPane.showMessageDialog(null, objeto.get_descripcion());
							salir = 13;
							break;
						case "categoria":
							JOptionPane.showMessageDialog(null, objeto.get_categoria());
							salir = 13;
							break;
						case "dificultad":
							JOptionPane.showMessageDialog(null, objeto.get_dificultad());
							salir = 13;
							break;
						case "precio":
							JOptionPane.showMessageDialog(null, objeto.get_precio());
							salir = 13;
							break;
						case "fecha_i":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_i());
							salir = 13;
							break;
						case "fecha_f":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_f());
							salir = 13;
							break;
						case "f_c_promocion_i":
							JOptionPane.showMessageDialog(null, ((Diseno_web) objeto).get_f_c_promocion_i());
							salir = 13;
							break;
						case "f_c_promocion_f":
							JOptionPane.showMessageDialog(null, ((Diseno_web) objeto).get_f_c_promocion_i());
							salir = 13;
							break;
						case "precioHora":
							JOptionPane.showMessageDialog(null, objeto.get_precioHora());
							salir = 13;
							break;
						case "horasDias":
							JOptionPane.showMessageDialog(null, objeto.get_horasDias());
							salir = 13;
							break;
						case "fecha_compra":
							JOptionPane.showMessageDialog(null, objeto.get_fecha_compra());
							salir = 13;
							break;
						case "salir":
							break;
					}// end switch
				} while (salir != 13);
			}
		} else {
			JOptionPane.showMessageDialog(null, "No exsiste el objeto");
		} // end if
	}
	/* READONE */

	/* UPDATE */
	public static Cursos update(Cursos curso) {

		Object menu_update = null;
		Object atributos_dw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "fecha_i", "fecha_f", "fecha_confirmacion_ini ",  "fecha_confirmacion_i", "fecha_confirmacion_f", "fecha_inscripcion_i", "fecha_inscripcion_f", "precioHora", "horasDias","fecha_compra","salir" };
		Object atributos_diw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "fecha_i", "fecha_f", "f_c_promocion_i", "f_c_promocion_f","precioHora", "horasDias", "fecha_compra","salir" };
		Object atributos_despw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "precio", "fecha_i", "fecha_f", "fecha_ultimas_plazas_i", "fecha_ultimas_plazas_f", "precioHora", " horasDias", "fecha_compra","salir" };
		int salir = 0;

		if (curso != null) {
			if (curso instanceof Desarrollo_web) {
				do {
					menu_update = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_dw, atributos_dw[14]);
					switch (menu_update.toString()) {
						case "ID_course":
							curso.set_ID_course(validar_regex.validar_reg_id());
							break;
						case "titulo":
							curso.set_titulo(validadors.validar_string("Dame un String", "titulo"));
							break;
						case "descripcion":
							curso.set_descripcion(validadors.validar_string("Dame un String", "descripcion"));
							break;
						case "categoria":
							curso.set_categoria((String) menu_dif_cat.combos_cat("Seleccione la categoria", "Categoria"));
							break;
						case "dificultad":
							curso.set_dificultad((String) menu_dif_cat.combos_dif("Selecciona la dificultad", "Dificultad"));
							break;
						case "precioHora":
							curso.set_precioHora(func_updates.precioHoras(curso));
							break;
						case "horasDias":
							curso.set_horasDias(func_updates.horasDias(curso));
							break;
						case "fecha_compra":
							curso.set_fecha_compra(func_updates.fecha_compra("fecha_compra", curso));
							break;
						case "fecha_i":
							curso.set_fecha_i(func_updates.fecha_i("fecha_i",  curso ));
							break;
						case "fecha_f":
							curso.set_fecha_f(func_updates.fecha_f("fecha_f", curso));
							break;
							/////////////////////////////////
							/*codigo fantasma*/
						case "fecha_confirmacion_ini":
							((Desarrollo_web) curso).set_fecha_confirmacion_i(func_updates.fecha_confirmacion_i("fecha_f", curso));
							break;
							/*codigo fantasma*/
						////////////////////////////////
						case "fecha_confirmacion_i":
							((Desarrollo_web) curso).set_fecha_confirmacion_i(func_updates.fecha_confirmacion_i("fecha_confirmacion_i", curso));
							break;
						case "fecha_confirmacion_f":
							((Desarrollo_web) curso).set_fecha_confirmacion_f(func_updates.fecha_confirmacion_i("fecha_confirmacion_f", curso));
							break;
						case "fecha_inscripcion_i":
							((Desarrollo_web) curso).set_fecha_inscripcion_i(func_updates.fecha_inscripcion_i("fecha_inscripcion_i", curso));
							break;
						case "fecha_inscripcion_f":
							((Desarrollo_web) curso).set_fecha_inscripcion_f(func_updates.fecha_inscripcion_f("fecha_inscripcion_f", curso));
							break;
						case "salir":
							salir = 14;
							break;
					} // end switch
				} while (salir != 14);
				return curso;
			} // end if

			if (curso instanceof Diseno_web) {
				do {
					menu_update = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_diw, atributos_diw[11]);
					switch (menu_update.toString()) {
						case "ID_course":
							curso.set_ID_course(validar_regex.validar_reg_id());
							break;
						case "titulo":
							curso.set_titulo(validadors.validar_string("Dame un String", "titulo"));
							break;
						case "descripcion":
							curso.set_descripcion(validadors.validar_string("Dame un String", "descripcion"));
							break;
						case "categoria":
							curso.set_categoria((String) menu_dif_cat.combos_cat("Seleccione la categoria", "Categoria"));
							break;
						case "dificultad":
							curso.set_dificultad((String) menu_dif_cat.combos_dif("Selecciona la dificultad", "Dificultad"));
							break;
						case "precioHora":
							curso.set_precioHora(func_updates.precioHoras_2(curso, ((Diseno_web) curso).get_f_c_promocion_i(), ((Diseno_web) curso).get_f_c_promocion_f()));
							break;
						case "horasDias":
							curso.set_horasDias(func_updates.horasDias_2(curso, ((Diseno_web) curso).get_f_c_promocion_i(), ((Diseno_web) curso).get_f_c_promocion_f()));
							break;
						case "fecha_compra":
							curso.set_fecha_compra(func_updates.fecha_compra_2( "fecha_compra ",((Diseno_web) curso).get_f_c_promocion_i(), ((Diseno_web) curso).get_f_c_promocion_f(), curso));
							break;
						case "fecha_i":
							curso.set_fecha_i(func_updates.fecha_i_2("fecha_i", ((Diseno_web) curso).get_f_c_promocion_i() ,((Diseno_web) curso).get_f_c_promocion_f(), curso ));
							break;
						case "fecha_f":
							curso.set_fecha_f(func_updates.fecha_f_2("fecha_f", ((Diseno_web) curso).get_f_c_promocion_i() ,((Diseno_web) curso).get_f_c_promocion_f(),  curso ));
							break;
						case "f_c_promocion_i":
							((Diseno_web) curso).set_f_c_promocion_i(func_updates.f_c_promocion_i("f_c_promocion_i", curso));
							break;
						case "f_c_promocion_f":
							((Diseno_web) curso).set_f_c_promocion_f(func_updates.f_c_promocion_f("f_c_promocion_f", curso));
							break;
						case "salir":
							salir = 11;
							break;
					} // end switch
				} while (salir != 11);
				return curso;
			} // end if

			if (curso instanceof Desplegamiento_web) {
				do {
					menu_update = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_despw, atributos_despw[11]);
					switch (menu_update.toString()) {
						case "ID_course":
							curso.set_ID_course(validar_regex.validar_reg_id());
							break;
						case "titulo":
							curso.set_titulo(validadors.validar_string("Dame un String", "titulo"));
							break;
						case "descripcion":
							curso.set_descripcion(validadors.validar_string("Dame un String", "descripcion"));
							break;
						case "categoria":
							curso.set_categoria((String) menu_dif_cat.combos_cat("Seleccione la categoria", "Categoria"));
							break;
						case "dificultad":
							curso.set_dificultad((String) menu_dif_cat.combos_dif("Selecciona la dificultad", "Dificultad"));
							break;
						case "precioHora":
							curso.set_precioHora(func_updates.precioHoras_2(curso, ((Desplegamiento_web) curso).get_fecha_ultimas_plazas_i(), ((Desplegamiento_web) curso).get_fecha_ultimas_plazas_f()));
							break;
						case "horasDias":
							curso.set_horasDias(func_updates.horasDias_2(curso, ((Desplegamiento_web) curso).get_fecha_ultimas_plazas_i(), ((Desplegamiento_web) curso).get_fecha_ultimas_plazas_f()));
							break;
						case "fecha_compra":
							curso.set_fecha_compra(func_updates.fecha_compra_2( "fecha_compra ",((Desplegamiento_web) curso).get_fecha_ultimas_plazas_i(), ((Desplegamiento_web) curso).get_fecha_ultimas_plazas_f(), curso));
							break;
						case "fecha_i":
							curso.set_fecha_i(func_updates.fecha_i_2("fecha_i", ((Desplegamiento_web) curso).get_fecha_ultimas_plazas_i(), ((Desplegamiento_web) curso).get_fecha_ultimas_plazas_f(),  curso ));
							break;
						case "fecha_f":
							curso.set_fecha_f(func_updates.fecha_f_2("fecha_f", ((Desplegamiento_web) curso).get_fecha_ultimas_plazas_i(), ((Desplegamiento_web) curso).get_fecha_ultimas_plazas_f(),  curso ));
							break;
						case "fecha_ultimas_plazas_i":
							((Desplegamiento_web) curso).set_fecha_ultimas_plazas_i(func_updates.fecha_ultimas_plazas_i("fecha_ultimas_plazas_i", curso));
							break;
						case "fecha_ultimas_plazas_f":
							((Desplegamiento_web) curso).set_fecha_ultimas_plazas_f(func_updates.fecha_ultimas_plazas_f("fecha_ultimas_plazas_f", curso));
							break;
						case "salir":
							salir = 11;
							break;
					} // end switch
				} while (salir != 11);
				return curso;
			} // end if
			return curso;
		} else {
			JOptionPane.showMessageDialog(null, "No exsiste el objecto");
			return null;
		}
	}
	/* UPDATE */

	/* DELETE */
	public static Cursos delete(Cursos curso) {
		if (curso != null) {
			if (curso instanceof Desarrollo_web) {
				curso = null;
				JOptionPane.showMessageDialog(null, "He borrado el objeto");
				return curso;
			}
			if (curso instanceof Diseno_web) {
				curso = null;
				JOptionPane.showMessageDialog(null, "He borrado el objeto");
				return curso;
			}
			if (curso instanceof Desplegamiento_web) {
				curso = null;
				JOptionPane.showMessageDialog(null, "He borrado el objeto");
				return curso;
			}
		} else {
			return curso;
		}
		return curso;
	}
	/* DELETE */
}