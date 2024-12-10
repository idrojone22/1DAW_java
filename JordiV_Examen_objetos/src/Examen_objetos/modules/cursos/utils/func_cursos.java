package Examen_objetos.modules.cursos.utils;


import javax.swing.JOptionPane;

import Examen_objetos.classes.Fecha;
import Examen_objetos.modules.cursos.classes.Cursos;
import Examen_objetos.modules.cursos.classes.Desarrollo_web;
import Examen_objetos.modules.cursos.classes.Desplegamiento_web;
import Examen_objetos.modules.cursos.classes.Diseno_web;
import Examen_objetos.modules.cursos.classes.IA;
import Examen_objetos.modules.cursos.classes.Singleton;
import Examen_objetos.utils.menus;
import Examen_objetos.utils.validadors;



public class func_cursos {
	public static Desarrollo_web crear_desarrollo () {
			
			String ID_course = Singleton.ID_course;
			String titulo = "los objetos desarrollo"; /*validadors.validar_string("Dame un String", "titulo");*/
			String descripcion = "descripcion"; /* validadors.validar_string("Dame un String", "descripcion");*/
			String categoria =  "categoria" ; /*(String) menu_dif_cat.combos_cat("Seleccione la categoria", "Categoria");*/
			String dificultad = "dificultad" ;/*(String) menu_dif_cat.combos_dif("Selecciona la dificultad", "Dificultad");*/
			Fecha fecha_i = func_fecha.craar("fecha_i");
			Fecha fecha_f = func_fecha.crear_fecha_automatic_suma("fecha_f", fecha_i, 20);
			int precioHora = 20; /*validadors.validar_int("Dame num", "precioHora");*/
			int horasDias = 8; /* validar_regex.validar_horas();*/
			Fecha fecha_inscripcion_i =  func_fecha.crear_fecha_automatic("fecha_inscripcion_i", fecha_i, 7);
			Fecha fecha_inscripcion_f =  func_fecha.crear_fecha_automatic("fecha_inscripcion_f", fecha_i, 4);
			Fecha fecha_confirmacion_i =func_fecha.crear_fecha_automatic("fecha_confirmacion_i", fecha_i, 3);
			Fecha fecha_confirmacion_f = func_fecha.crear_fecha_automatic("fecha_confirmacion_f", fecha_i, 1);
			Fecha fecha_compra = func_fecha.crear_fecha_compra("fecha_compra",fecha_i);
			int precio = func_precio.calcular_precio(fecha_i, fecha_f, precioHora, horasDias);
			
			return new Desarrollo_web(ID_course, titulo, descripcion,categoria, dificultad,fecha_i,fecha_f, precioHora, horasDias,fecha_confirmacion_i, fecha_confirmacion_f, fecha_inscripcion_i, fecha_inscripcion_f, fecha_compra, precio);
		}
		
		public static Cursos preguntar_ID_course () {
			Singleton.ID_course = validar_regex.validar_reg_id();
			return new Desarrollo_web (Singleton.ID_course );
		} 
		
		public static Cursos preguntar_ID_desarrollo(String ID) {
			Singleton.ID_course = ID;
			return new Desarrollo_web (Singleton.ID_course );
		}
	
	public static Diseno_web crear_diseno () {
			
		String ID_course = Singleton.ID_course;
		String titulo = "los objetos desarrollo"; /*validadors.validar_string("Dame un String", "titulo");*/
		String descripcion = "descripcion"; /* validadors.validar_string("Dame un String", "descripcion");*/
		String categoria =  "categoria" ; /*(String) menu_dif_cat.combos_cat("Seleccione la categoria", "Categoria");*/
		String dificultad = "dificultad" ;/*(String) menu_dif_cat.combos_dif("Selecciona la dificultad", "Dificultad");*/
		Fecha fecha_i = func_fecha.craar("fecha_i");
		Fecha fecha_f = func_fecha.crear_fecha_automatic_suma("fecha_f", fecha_i, 20);
		int precioHora = 20; /*validadors.validar_int("Dame num", "precioHora");*/
		int horasDias = 8; /* validar_regex.validar_horas();*/
		Fecha f_c_promocion_i = func_fecha.crear_fecha_anterior("f_c_promocion_i", fecha_i);
		Fecha f_c_promocion_f = func_fecha.crear_entre2("f_c_promocion_f", f_c_promocion_i, fecha_i);
		Fecha fecha_compra = func_fecha.crear_fecha_compra("fecha_compra", fecha_i );
		int precio = func_precio.calcular_precio_ultimas_plazas(fecha_i, fecha_f, precioHora, horasDias,f_c_promocion_i,  f_c_promocion_f, fecha_compra);
		
		return new Diseno_web(ID_course, titulo, descripcion, categoria, dificultad, fecha_i, fecha_f, precioHora, horasDias, f_c_promocion_i, f_c_promocion_f,fecha_compra, precio);
	}

	public static Cursos preguntar_ID_diseno () {
		Singleton.ID_course = validar_regex.validar_reg_id();
		return new Diseno_web (Singleton.ID_course);
	}

	public static Cursos preguntar_ID_diseno(String ID) {
		Singleton.ID_course = ID;
		return new Diseno_web (Singleton.ID_course );
	}
	
	public static Desplegamiento_web crear_desplegamiento () {
		
		String ID_course = Singleton.ID_course;
		String titulo = "los objetos desarrollo"; /*validadors.validar_string("Dame un String", "titulo");*/
		String descripcion = "descripcion"; /* validadors.validar_string("Dame un String", "descripcion");*/
		String categoria =  "categoria" ; /*(String) menu_dif_cat.combos_cat("Seleccione la categoria", "Categoria");*/
		String dificultad = "dificultad" ;/*(String) menu_dif_cat.combos_dif("Selecciona la dificultad", "Dificultad");*/
		Fecha fecha_i = func_fecha.craar("fecha_i");
		Fecha fecha_f = func_fecha.crear_fecha_automatic_suma("fecha_f", fecha_i, 20);
		int precioHora = 20; /*validadors.validar_int("Dame num", "precioHora");*/
		int horasDias = 8; /* validar_regex.validar_horas();*/
		Fecha fecha_ultimas_plazas_i = func_fecha.crear_fecha_anterior("fecha_ultimas_plazas_i", fecha_i);
		Fecha fecha_ultimas_plazas_f = func_fecha.crear_entre2("fecha_ultimas_plazas_f", fecha_ultimas_plazas_i,fecha_i);
		Fecha fecha_compra = func_fecha.crear_fecha_compra("fecha_compra", fecha_i );
		int precio = func_precio.calcular_precio_ultimas_plazas(fecha_i, fecha_f, precioHora, horasDias,fecha_ultimas_plazas_i, fecha_ultimas_plazas_f, fecha_compra);
		
		return new Desplegamiento_web(ID_course, titulo, descripcion, categoria, dificultad, fecha_i, fecha_f, precioHora, horasDias, fecha_ultimas_plazas_i, fecha_ultimas_plazas_f,fecha_compra, precio);
	}

	public static Cursos preguntar_ID_desplegamiento () {
		Singleton.ID_course = validar_regex.validar_reg_id();
		return new Desplegamiento_web (Singleton.ID_course);
	} 
	
	public static Cursos preguntar_ID_desplegamiento1 (String ID) {
		Singleton.ID_course = ID;
		return new Desplegamiento_web (Singleton.ID_course);
	}
	
	public static IA crear_ia() {
		String ID_course = Singleton.ID_course;
		String titulo = "los objetos desarrollo";
		String descripcion = "descripcion";
		String categoria =  "categoria";
		String dificultad = "dificultad" ;
		Fecha fecha_i = func_fecha.craar("fecha_i");
		Fecha fecha_f = func_fecha.crear_fecha_automatic_suma("fecha_f", fecha_i, 20);
		int precioHora = 20; /*validadors.validar_int("Dame num", "precioHora");*/
		int horasDias = 8; /* validar_regex.validar_horas();*/
		Fecha f_cupon_ini = func_fecha.crear_fecha_anterior("f_cupon_ini", fecha_i);
		Fecha f_c_promocion_f = func_fecha.crear_entre2("f_c_promocion_f", f_cupon_ini, fecha_i);
		Fecha fecha_compra = func_fecha.crear_fecha_compra("fecha_compra", fecha_i );
		int precio = func_precio.calcular_precio_ultimas_plazas(fecha_i, fecha_f, precioHora, horasDias,f_cupon_ini, f_c_promocion_f, fecha_compra);
		
		return new IA (ID_course, titulo, descripcion, categoria, dificultad, fecha_i, fecha_f, precioHora, horasDias, f_cupon_ini, f_c_promocion_f,fecha_compra, precio);
	}
	
	public static Cursos preguntar_ID_ia() {
		Singleton.ID_course = validar_regex.validar_reg_id();
		return new IA (Singleton.ID_course);
	}
	
	public static Cursos preguntar_ID_ia_1(String ID) {
		Singleton.ID_course = ID;
		return new IA (Singleton.ID_course);
	}
	
	public static Cursos update (Cursos curso) {
		Object menu_update = null;
		Object atributos_dw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "fecha_i", "fecha_f", "fecha_confirmacion_ini ",  "fecha_confirmacion_i", "fecha_confirmacion_f", "fecha_inscripcion_i", "fecha_inscripcion_f", "precioHora", "horasDias","fecha_compra","salir" };
		Object atributos_diw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "fecha_i", "fecha_f", "f_c_promocion_i", "f_c_promocion_f","precioHora", "horasDias", "fecha_compra","salir" };
		Object atributos_despw[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "precio", "fecha_i", "fecha_f", "fecha_ultimas_plazas_i", "fecha_ultimas_plazas_f", "precioHora", " horasDias", "fecha_compra","salir" };
		Object atributos_ia[] = { "ID_course", "titulo", "descripcion", "categoria", "dificultad", "precio", "fecha_i", "fecha_f", "f_cupon_ini", "f_cupon_fin", "precioHora", " horasDias", "fecha_compra","salir" };
		int salir = 0;
		if (curso != null) {
			
			if (curso instanceof IA) {
				do {
					menu_update = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_ia, atributos_ia[0]);
					switch (menu_update.toString()) {
						case "ID_course":
							 update_ID_ia( curso);
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
							curso.set_fecha_i(func_updates.fecha_i_2("fecha_i", ((IA) curso).get_f_cupon_ini() ,((IA) curso).get_f_cupon_fin(), curso ));
							break;
						case "fecha_f":
							curso.set_fecha_f(func_updates.fecha_f_2("fecha_f", ((IA) curso).get_f_cupon_ini() ,((IA) curso).get_f_cupon_fin(), curso ));
							break;
						case "f_cupon_ini":
							((IA)curso).set_f_cupon_ini(func_updates.f_cupon_ini("f_cupon_ini", curso));
							break;
						case "f_cupon_fin":
							((IA)curso).set_f_cupon_final(func_updates.f_cupon_fin("f_ cupon_fin", curso));
						case "salir":
							salir = 1;
							break;
					}
				}while(salir != 1);
			}
			if (curso instanceof Desarrollo_web) {
				do {
					menu_update = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_dw, atributos_dw[14]);
					switch (menu_update.toString()) {
						case "ID_course":
							 update_ID_desarrollo( curso);
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
								update_ID_diseno( curso);
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
	
	public static void update_ID_desarrollo(Cursos curso) {
		int localizacion = -1;
		Cursos ID = preguntar_ID_course();
		localizacion = func_buscar.find(ID);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null, "Ya exsiste el objeto");
		} else {
			 curso.set_ID_course(Singleton.ID_course);   
		}
	}
	
	public static void update_ID_diseno(Cursos curso) {
		int localizacion = -1;
		Cursos ID = preguntar_ID_diseno();
		localizacion = func_buscar.find(ID);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null, "Ya exsiste el objeto");
		} else {
			 curso.set_ID_course(Singleton.ID_course);   
		}
	}
	
	public static void update_ID_desplegamiento(Cursos curso) {
		int localizacion = -1;
		Cursos ID = preguntar_ID_desplegamiento();
		localizacion = func_buscar.find(ID);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null, "Ya exsiste el objeto");
		} else {
			 curso.set_ID_course(Singleton.ID_course);   
		}
	}
	
	public static void update_ID_ia(Cursos curso) {
		int localizacion = -1;
		Cursos ID = preguntar_ID_diseno();
		localizacion = func_buscar.find(ID);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null, "Ya exsiste el objeto");
		} else {
			 curso.set_ID_course(Singleton.ID_course);   
		}
	}
	
	public static String mostrarID_desarrollo() {
		Object ID_array = null;
		String[] recorrer_array = new String[Singleton.array_desarrollo.size()];
		 for (int i = 0; i < Singleton.array_desarrollo.size(); i++) {
	            Desarrollo_web obj = Singleton.array_desarrollo.get(i);
	            recorrer_array[i] = String.valueOf(obj.get_ID_course()); // Obtener solo el ID como String
	        }
		 ID_array = menus.combos("Selecciona la opción", "Manual o Automático",recorrer_array , recorrer_array[0]);
		 return ID_array.toString();
	}
	
	public static String mostrarID_diseno() {
		Object ID_array = null;
		String[] recorrer_array = new String[Singleton.array_diseno.size()];
		 for (int i = 0; i < Singleton.array_diseno.size(); i++) {
	            Diseno_web obj = Singleton.array_diseno.get(i);
	            recorrer_array[i] = String.valueOf(obj.get_ID_course()); // Obtener solo el ID como String
	        }
		 ID_array = menus.combos("Selecciona la opción", "Manual o Automático",recorrer_array , recorrer_array[0]);
		 return ID_array.toString();
	}
	
	public static String mostrarID_desplegamiento() {
		Object ID_array = null;
		String[] recorrer_array = new String[Singleton.array_desplegamiento.size()];
		 for (int i = 0; i < Singleton.array_desplegamiento.size(); i++) {
	            Desplegamiento_web obj = Singleton.array_desplegamiento.get(i);
	            recorrer_array[i] = String.valueOf(obj.get_ID_course()); // Obtener solo el ID como String
	        }
		 ID_array = menus.combos("Selecciona la opción", "Manual o Automático",recorrer_array , recorrer_array[0]);
		 return ID_array.toString();
	}
	
	public static String mostrarID_ia() {
		Object ID_array = null;
		String[] recorrer_array = new String[Singleton.array_ia.size()];
		for (int i = 0; i < Singleton.array_ia.size(); i++) {
            IA obj = Singleton.array_ia.get(i);
            recorrer_array[i] = String.valueOf(obj.get_ID_course()); // Obtener solo el ID como String
        }
		 ID_array = menus.combos("Selecciona la opción", "Manual o Automático",recorrer_array , recorrer_array[0]);
		 return ID_array.toString();
	}
	
	
	/*public static void update_ID(Cursos curso) {
		
		if (curso instanceof Desarrollo_web) {
			int localizacion = -1;
			Desarrollo_web ID = preguntar_ID_course();
			localizacion = func_buscar.find(curso);
		}
	}*/
}