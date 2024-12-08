package tema4_v13.modules.users.utils;

import javax.swing.JOptionPane;

import tema4_v10.utils.validadors;
import tema4_v13.classes.Fecha;
import tema4_v13.modules.cursos.utils.func_fecha;
import tema4_v13.modules.users.classes.Admin;
import tema4_v13.modules.users.classes.Client;
import tema4_v13.modules.users.classes.Singleton_users;
import tema4_v13.modules.users.classes.User;
import tema4_v13.utils.func_main;
import tema4_v13.utils.menus;

public class func_users {
	
	/*ADMIN*/
	public static Admin crear_admin() {
		
		String username = Singleton_users.username;
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
		Singleton_users.username = validadors.validar_string("Username", "Username");
		return new Admin (Singleton_users.username );
	}
	
	public static Admin username_admin_dummies(String username) {
		Singleton_users.username = username;
		return new Admin (Singleton_users.username );
	}
	
	//SIGN UP
	public static void log_in_admin() {
		int localizacion = -1;
		boolean contra = false;
		Admin username = func_users.preguntar_username_admin();
		localizacion =  func_find.find_admin(username);
		if (localizacion != -1) {
			if (username.get_username().equals("idrojone")|| username.get_username().equals("yomogan")) {
				JOptionPane.showMessageDialog(null, "Entre");
				do {
					String password = validadors.validar_string("password", "password");
					if (password.equals(Singleton_users.array_admin.get(localizacion).get_password())) {
						JOptionPane.showMessageDialog(null, "Contraseña correcta");
						func_main.menu_superadmin(username);
						contra = true;
					} else { 
						JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
					}
				}while(contra != true);
			}
			do {
				String password = validadors.validar_string("password", "password");
				if (password.equals(Singleton_users.array_admin.get(localizacion).get_password())) {
					JOptionPane.showMessageDialog(null, "Contraseña correcta");
					func_main.menu_admin(username);
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
		
		String username = Singleton_users.username;
		String password = "password";
		String email = "ejemplo.@gmail.com";
		Fecha fecha_nacimiento =  func_fecha.craar("fecha nacimiento");
		int edad = 18;
		boolean log = false;
		Fecha fecha_registro = func_fecha.craar("fecha fecha_registro");
		
		return new Client (username, password, email,fecha_nacimiento, edad, log, fecha_registro );
	}
	
	public static Client preguntar_username_client() {
		Singleton_users.username = validadors.validar_string("Username", "Username");
		return new Client (Singleton_users.username );
	}
	
	public static Client username_client_dummies(String username) {
		Singleton_users.username = username;
		return new Client (Singleton_users.username );
	}
	
	public static void log_in_client() {
		int localizacion = -1;
		boolean contra = false;
		Client username = func_users.preguntar_username_client();
		localizacion =  func_find.find_client(username);
		if (localizacion != -1) {
			do {
				String password = validadors.validar_string("password", "password");
				if (password.equals(Singleton_users.array_client.get(localizacion).get_password())) {
					JOptionPane.showMessageDialog(null, "Contraseña correcta");
					username.set_log(true);
					func_main.menu_cliente(username);
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
	
	public static void update_username(User user) {
		int localizacion = -1;
		User  username= preguntar_username_admin();
		localizacion = func_find.find(username);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El username ya está en uso");
		} else {
			user.set_username(Singleton_users.username);
		}		
	}
	
	
	public static User update (User user) {
		Object menu_update = null;
		Object atributos_client[] = {"username", "password", "email", "fecha nacimiento", "edad", "fecha_registro", "log", "Salir"};
		Object atributos_admin[] = {"username", "password", "email", "fecha nacimiento", "edad","nombre", "apellidos", "DNI", "telefono", "Fecha_alta", "sueldo"};
		int salir = 0;
		if (user != null) {
			if (user instanceof Client) {
				do {
					menu_update = menus.combos("Selecciona el atributo", "Update", atributos_client, atributos_client[0]);
					switch (menu_update.toString()) {
						case "username":
							update_username(user);
							break;
						case "password":
							user.set_password(validadors.validar_string("Nueva contraseña", "Contraseña"));
						case "email":
							user.set_email(validar_regex.validar_email());
						case "fecha nacimiento":
							user.set_fecha_nacimiento(func_fecha.craar("fecha nacimiento"));
						case "edad":
							user.set_edad(validadors.validar_int("Tu edad", "Edad"));
						case "fecha_registro":
							((Client) user).set_fecha_registro(func_fecha.craar("fecha registro"));
						case "log":
							((Client) user).set_log(false); // Hacer validar boolean
						case "Salir":
							salir = 1;
					} // end switch
				}while(salir != 1);
				return user;
			}
		
			if (user instanceof Admin) {
				do {
					menu_update = menus.combos("Selecciona el atributo", "Update", atributos_client, atributos_client[0]);
					switch (menu_update.toString()) {
						case "username":
							update_username(user);
							break;
						case "password":
							user.set_password(validadors.validar_string("Nueva contraseña", "Contraseña"));
						case "email":
							user.set_email(validar_regex.validar_email());
						case "fecha nacimiento":
							user.set_fecha_nacimiento(func_fecha.craar("fecha nacimiento"));
						case "edad":
							user.set_edad(validadors.validar_int("Tu edad", "Edad"));
						case "nombre":
							((Admin) user).set_nombre(validadors.validar_string("Nombre", "Nombre"));
						case "apellido":
							((Admin) user).set_apellidos(validadors.validar_string("Apellidos", "Apellidos"));
						case "DNI":
							((Admin) user).set_dni(validadors.validar_string("DNI", "DNI"));
						case "telefono":
							((Admin) user).set_telefono(validadors.validar_int("Telefono", "Telefono"));
						case "Fecha_alta":
							((Admin) user).set_fecha_alta(func_fecha.craar("Fecha_alta"));
						case "sueldo":
							((Admin) user).set_sueldo(validadors.validar_int("sueldo", "sueldo"));
						case "Salir":
							salir = 1;
					} // end switch
				}while(salir != 1);
				return user;
			}
			return user;
		} else {
			JOptionPane.showMessageDialog(null, "No exsiste el usuario");
			return null;
		}
	}
	
	
}
