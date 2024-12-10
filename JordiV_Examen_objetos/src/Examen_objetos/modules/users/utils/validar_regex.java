package Examen_objetos.modules.users.utils;

import Examen_objetos.utils.regex;
import Examen_objetos.utils.validadors;

public class validar_regex {
	public static String validar_email() {
		String email = "";
		do {
			email = validadors.validar_string("Dame un email", "email");
		}while(!regex.validar_email(email));
		return email;
	}
	
	public static String validar_tlf() {
		String tlf = "";
		do {
			tlf = validadors.validar_string("Dame un Tlf", "TLF");
		}while(!regex.validar_telefono(tlf));
		return tlf;
	}
	
	
}
