package tema4_v9.modules.courses.utils;

import tema4_v8.utils.regex;
import tema4_v8.utils.validadors;

public class validar_regex {
	public static String validar_reg_id() {
		String ID = "";
		do {
			ID = validadors.validar_string("Dame un String", "ID_course");
		}while(!regex.validar_id(ID));
		return ID;
	}
	
	public static String validar_reg_fecha (String tipo) {
		String fecha = "";
		do {
			fecha = validadors.validar_string("Dame un String con formato DD/MM/YYYY", tipo);
		}while(!regex.validar_fecha(fecha));
		return fecha;
	}
	
	public static int validar_horas( ) {
		int horasDias = 0;
		do {
			horasDias = validadors.validar_int("¿Cuantas horas son el curso?", "horasDias");
		}while(!regex.validar_horasDias(horasDias));
		return horasDias;
	}
	
	
}
