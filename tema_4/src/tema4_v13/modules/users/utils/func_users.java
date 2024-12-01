package tema4_v13.modules.users.utils;

import javax.swing.JOptionPane;

import tema4_v10.utils.validadors;
import tema4_v13.classes.Fecha;
import tema4_v13.modules.cursos.utils.func_fecha;
import tema4_v13.modules.users.classes.Admin;
import tema4_v13.modules.users.classes.Client;
import tema4_v13.modules.users.classes.Singleton;
import tema4_v13.utils.func_main;

public class func_users {
	
	/*ADMIN*/
	public static Admin crear_admin() {
		
		String username = Singleton.username;
		String password = "password";
		String email = "ejemplo@gmail.com";
		Fecha fecha_nacimiento =  func_fecha.craar("fecha nacimiento");
		int edad = 18;
		String nombre = "nombre";
		String apellidos = "apellidos";
		String dni = "dni";
		int telefono = 666666666;
		Fecha fecha_alta =  func_fecha.craar("fecha fecha_alta");
		int sueldo = 1400;
		
		return new Admin (username, password, email, fecha_nacimiento, edad, nombre, apellidos, dni, telefono, fecha_alta, sueldo);
	}
	
	public static Admin preguntar_username_admin() {
		Singleton.username = validadors.validar_string("Username", "Username");
		return new Admin (Singleton.username );
	}
	
	public static Admin username_admin_dummies(String username) {
		Singleton.username = username;
		return new Admin (Singleton.username );
	}
	
	//SIGN UP
	public static void log_in_admin() {
		int localizacion = -1;
		boolean contra = false;
		Admin username = func_users.preguntar_username_admin();
		localizacion =  func_find.find_admin(username);
		if (localizacion != -1) {
			do {
				String password = validadors.validar_string("password", "password");
				if (password.equals(Singleton.array_admin.get(localizacion).get_password())) {
					JOptionPane.showMessageDialog(null, "Contraseña correcta");
					contra = true;
				} else {
					JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
				}
			}while(contra != true);
		} else {
			JOptionPane.showMessageDialog(null, "El usuario no exsiste");
		}
	}
	
	/*ADMIN*/
	
	/*CLIENT*/
	public static Client crear_client() {
		
		String username = Singleton.username;
		String password = "password";
		String email = "ejemplo.@gmail.com";
		Fecha fecha_nacimiento =  func_fecha.craar("fecha nacimiento");
		int edad = 18;
		boolean log = false;
		Fecha fecha_registro = func_fecha.craar("fecha fecha_registro");
		
		return new Client (username, password, email,fecha_nacimiento, edad, log, fecha_registro );
	}
	
	public static Client preguntar_username_client() {
		Singleton.username = validadors.validar_string("Username", "Username");
		return new Client (Singleton.username );
	}
	
	public static Client username_client_dummies(String username) {
		Singleton.username = username;
		return new Client (Singleton.username );
	}
	
	public static void log_in_client() {
		int localizacion = -1;
		boolean contra = false;
		Client username = func_users.preguntar_username_client();
		localizacion =  func_find.find_client(username);
		if (localizacion != -1) {
			do {
				String password = validadors.validar_string("password", "password");
				if (password.equals(Singleton.array_client.get(localizacion).get_password())) {
					JOptionPane.showMessageDialog(null, "Contraseña correcta");
					func_main.menu_cliente();
					contra = true;
				} else {
					JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
				}
			}while(contra != true);
		} else {
			JOptionPane.showMessageDialog(null, "El usuario no exsiste");
		}
	}
	/*CLIENT*/
	
	
	
}
