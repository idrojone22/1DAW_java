package Examen_objetos.modules.users.utils.CRUD;

import javax.swing.JOptionPane;

import Examen_objetos.utils.validadors;
import Examen_objetos.modules.cursos.utils.func_fecha;
import Examen_objetos.modules.users.classes.Admin;
import Examen_objetos.modules.users.classes.Client;
import Examen_objetos.modules.users.classes.Singleton_users;
import Examen_objetos.modules.users.utils.func_find;
import Examen_objetos.modules.users.utils.func_users;
import Examen_objetos.modules.users.utils.validar_regex;
import Examen_objetos.utils.func_main;
import Examen_objetos.utils.menus;

public class func_readone_users {
	public static void read_one_client() {
		Object menu_readone = null;
		Object atributos_client[] = {"username", "password", "email", "fecha nacimiento", "edad", "fecha_registro", "log", "Salir"};
		int salir = 0;
		String username = "";
		Client client = null;
		int localizacion = -1;
		
		if (Singleton_users.array_client.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			username = func_users.mostrar_username_client();
			client = (Client) func_users.username_client_dummies(username);
			localizacion = func_find.find(client);
			
			if (localizacion != -1) {
				client = Singleton_users.array_client.get(localizacion);
				do {
					menu_readone = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_client,atributos_client[0]);
					switch (menu_readone.toString()) {
						case "username":
								JOptionPane.showMessageDialog(null, client.get_username());
							break;
						case "password":
							JOptionPane.showMessageDialog(null, client.get_password());
							break;
						case "email":
							JOptionPane.showMessageDialog(null, client.get_email());
							break;
						case "fecha nacimiento":
							JOptionPane.showMessageDialog(null, client.get_fecha_nacimiento());
							break;
						case "edad":
							JOptionPane.showMessageDialog(null, client.get_edad());
							break;
						case "fecha_registro":
							JOptionPane.showMessageDialog(null, ((Client)client).get_fecha_registro());
							break;
						case "log":
							JOptionPane.showMessageDialog(null, ((Client)client).get_log());
							break;
						case "Salir":
							salir = 1;
							break;
					} // end switch
				}while(salir != 1);
			}
		}
	}
	
	public static void read_one_admin() {
		Object menu_readone = null;
		Object atributos_client[] = {"username", "password", "email", "fecha nacimiento", "edad", "nombre", "apellidos" ,  "telefono", "fecha_alta", "sueldo","Salir"};
		int salir = 0;
		String username = "";
		Admin admin = null;
		int localizacion = -1;
		
		if (Singleton_users.array_client.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			username = func_users.mostrar_username_client();
			admin = (Admin) func_users.username_admin_dummies(username);
			localizacion = func_find.find(admin);
			
			if (localizacion != -1) {
				admin = Singleton_users.array_admin.get(localizacion);
				do {
					menu_readone = menus.combos("Selecciona el atributo", "Selector de atributos", atributos_client,atributos_client[0]);
					switch (menu_readone.toString()) {
						case "username":
								JOptionPane.showMessageDialog(null, admin.get_username());
							break;
						case "password":
							JOptionPane.showMessageDialog(null, admin.get_password());
							break;
						case "email":
							JOptionPane.showMessageDialog(null, admin.get_email());
							break;
						case "fecha nacimiento":
							JOptionPane.showMessageDialog(null, admin.get_fecha_nacimiento());
							break;
						case "edad":
							JOptionPane.showMessageDialog(null, admin.get_edad());
							break;
						case "nombre":
							JOptionPane.showMessageDialog(null, admin.get_nombre());
							break;
						case "apellidos":
							JOptionPane.showMessageDialog(null, admin.get_apellidos());						
							break;
						case "telefono":
							JOptionPane.showMessageDialog(null, admin.get_telefono());						
							break;
						case "fecha_alta":
							JOptionPane.showMessageDialog(null, admin.get_fecha_alta());						
							break;
						case "sueldo":
							JOptionPane.showMessageDialog(null, admin.get_sueldo());						
							break;
						case "Salir":
							salir = 1;
							break;
					} // end switch
				}while(salir != 1);
			}
		}
	}
}
