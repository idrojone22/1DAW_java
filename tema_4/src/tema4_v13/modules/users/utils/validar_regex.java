package tema4_v13.modules.users.utils;

import tema4_v13.utils.validadors;
import tema4_v13.utils.regex;

public class validar_regex {
	public static String validar_email() {
		String email = "";
		do {
			email = validadors.validar_string("Dame un email", "email");
		}while(!regex.validar_email(email));
		return email;
	}
	
}
