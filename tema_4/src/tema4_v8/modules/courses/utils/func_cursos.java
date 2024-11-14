package tema4_v8.modules.courses.utils;

import tema4_v7.classes.Fecha;
import tema4_v8.modules.courses.classes.Cursos;
import tema4_v8.modules.courses.classes.Desarrollo_web;
import tema4_v8.modules.courses.classes.Desplegamiento_web;
import tema4_v8.modules.courses.classes.Diseno_web;
import tema4_v8.modules.courses.classes.Singleton;

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
	
	public static Desarrollo_web preguntar_ID_course () {
		Singleton.ID_course = validar_regex.validar_reg_id();
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

	public static Diseno_web preguntar_ID_diseno () {
		Singleton.ID_course = validar_regex.validar_reg_id();
		return new Diseno_web (Singleton.ID_course);
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

	public static Desplegamiento_web preguntar_ID_desplegamiento () {
		Singleton.ID_course = validar_regex.validar_reg_id();
		return new Desplegamiento_web (Singleton.ID_course);
	} 
}
