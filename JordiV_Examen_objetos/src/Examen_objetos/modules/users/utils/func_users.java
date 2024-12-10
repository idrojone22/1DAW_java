package Examen_objetos.modules.users.utils;

import javax.swing.JOptionPane;

import Examen_objetos.classes.Fecha;
import Examen_objetos.modules.cursos.utils.func_fecha;
import Examen_objetos.modules.users.classes.Admin;
import Examen_objetos.modules.users.classes.Client;
import Examen_objetos.modules.users.classes.Singleton_users;
import Examen_objetos.modules.users.classes.User;
import Examen_objetos.modules.users.dummies.dummies_users;
import Examen_objetos.utils.func_main;
import Examen_objetos.utils.menus;
import Examen_objetos.utils.validadors;



public class func_users {
	
	/*ADMIN*/
	public static Admin crear_admin() {
		
		String username = Singleton_users.username;
		String password = validadors.validar_string("Contraseña", "Contraseña");
		String email = validar_regex.validar_email();
		Fecha fecha_nacimiento =  func_fecha.craar("fecha nacimiento");
		int edad = func_edad.calcularEdad(fecha_nacimiento);
		String nombre = validadors.validar_string("Nombre", "Nombre");
		String apellidos = validadors.validar_string("Apellidos", "Apellidos");
		String telefono = validar_regex.validar_tlf();
		Fecha fecha_alta =  dummies_users.generarFechaPosterior(fecha_nacimiento);
		int sueldo = func_sueldo.calcularSueldo(fecha_alta);
		
		return new Admin (username, password, email, fecha_nacimiento, edad, nombre, apellidos,  telefono, fecha_alta, sueldo);
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
		String password = validadors.validar_string("Contraseña", "Contraseña");
		String email = validar_regex.validar_email();
		Fecha fecha_nacimiento =  func_fecha.craar("fecha nacimiento");
		int edad = func_edad.calcularEdad(fecha_nacimiento);
		boolean log = false;
		Fecha fecha_registro = dummies_users.generarFechaPosterior(fecha_nacimiento);
		
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
	
	public static void update_username_admin(Admin user) {
		int localizacion = -1;
		boolean salir = false;
		do {
			Admin username = preguntar_username_admin();
			localizacion = func_find.find(username);
			if (localizacion != -1) {
				JOptionPane.showMessageDialog(null,"El username ya está en uso");
			} else {
				user.set_username(Singleton_users.username);
				salir = true;
			}
		}while(!salir);
	}
	
	public static void update_username_client(Client user) {
		int localizacion = -1;
		boolean salir = false;
		do {
			Client username = preguntar_username_client();
			localizacion = func_find.find(username);
			if (localizacion != -1) {
				JOptionPane.showMessageDialog(null,"El username ya está en uso");
			} else {
				user.set_username(Singleton_users.username);
				salir = true;
			}
		}while(!salir);
	}
	
	
	public static User update (User user) {
		Object menu_update = null;
		Object atributos_client[] = {"username", "password", "email", "fecha nacimiento",  "fecha_registro", "log", "Salir"};
		Object atributos_admin[] = {"username", "password", "email", "telefono", "Fecha_alta", "sueldo", "Salir"};
		int salir = 0;
		if (user != null) {
			if (user instanceof Client) {
				do {
					menu_update = menus.combos("Selecciona el atributo", "Update", atributos_client, atributos_client[0]);
					switch (menu_update.toString()) {
						case "username":
							update_username_client((Client) user);
							break;
						case "password":
							user.set_password(validadors.validar_string("Nueva contraseña", "Contraseña"));
							break;
						case "email":
							user.set_email(validar_regex.validar_email());
							break;
						case "fecha nacimiento":
							user.set_fecha_nacimiento(func_fecha.craar("fecha nacimiento"));
							user.set_edad(func_edad.calcularEdad(user.get_fecha_nacimiento()));
							break;
						case "Salir":
							salir = 1;
							break;
					} // end switch
				}while(salir != 1);
				return user;
			}
		
			if (user instanceof Admin) {
				do {
					menu_update = menus.combos("Selecciona el atributo", "Update", atributos_admin, atributos_admin[0]);
					switch (menu_update.toString()) {
						case "username":
							update_username(user);
							break;
						case "password":
							user.set_password(validadors.validar_string("Nueva contraseña", "Contraseña"));
							break;
						case "email":
							user.set_email(validar_regex.validar_email());
							break;
						case "fecha nacimiento":
							user.set_fecha_nacimiento(func_fecha.craar("fecha nacimiento"));
							user.set_edad(func_edad.calcularEdad(user.get_fecha_nacimiento()));
							break;
						case "nombre":
							((Admin) user).set_nombre(validadors.validar_string("Nombre", "Nombre"));
							break;
						case "apellido":
							((Admin) user).set_apellidos(validadors.validar_string("Apellidos", "Apellidos"));
							break;
						case "telefono":
							((Admin) user).set_telefono(validar_regex.validar_tlf());
							break;
						case "Fecha_alta":
							((Admin) user).set_fecha_alta(func_fecha.craar("Fecha_alta"));
							((Admin) user).set_sueldo(func_sueldo.calcularSueldo(((Admin)user).get_fecha_alta()));
							break;
						case "sueldo":
							((Admin) user).set_sueldo(validadors.validar_int("sueldo", "sueldo"));
							break;
						case "Salir":
							salir = 1;
							break;
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
	
	public static String mostrar_username_client() {
		Object username_array = null;
		String[] recorrer_array = new String[Singleton_users.array_client.size()];
		 for (int i = 0; i < Singleton_users.array_client.size(); i++) {
	            Client obj = Singleton_users.array_client.get(i);
	            recorrer_array[i] = String.valueOf(obj.get_username());
	      }
		 username_array =  menus.combos("Selecciona la opción", "Manual o Automático",recorrer_array , recorrer_array[0]);
		return username_array.toString();
	}
	
	public static String mostrar_username_admin() {
		Object username_array = null;
		String[] recorrer_array = new String[Singleton_users.array_admin.size()];
		 for (int i = 0; i < Singleton_users.array_admin.size(); i++) {
	            Admin obj = Singleton_users.array_admin.get(i);
	            recorrer_array[i] = String.valueOf(obj.get_username());
	      }
		 username_array =  menus.combos("Selecciona la opción", "Manual o Automático",recorrer_array , recorrer_array[0]);
		return username_array.toString();
	}
	
}
