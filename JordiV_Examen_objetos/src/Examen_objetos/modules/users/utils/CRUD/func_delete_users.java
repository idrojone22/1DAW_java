package Examen_objetos.modules.users.utils.CRUD;

import javax.swing.JOptionPane;

import Examen_objetos.modules.users.classes.Singleton_users;
import Examen_objetos.modules.users.utils.func_find;
import Examen_objetos.modules.users.utils.func_users;
import Examen_objetos.utils.func_main;
import Examen_objetos.modules.users.classes.Admin;
import Examen_objetos.modules.users.classes.Client;

public class func_delete_users {
	public static void delete_admin() {
		int localizacion = -1;
		Admin username = null;
		if (Singleton_users.array_admin.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			username = (Admin) func_users.username_admin_dummies(func_users.mostrar_username_admin());
			localizacion = func_find.find(username);
			if (localizacion != -1) {
				username = Singleton_users.array_admin.remove(localizacion);
				JOptionPane.showMessageDialog(null, "Usuario borrado");
			} else {
				JOptionPane.showMessageDialog(null, "Error, el Usuario no exsiste");
			}
		}
	}
	
	public static void delete_client() {
		int localizacion = -1;
		Client username = null;
		if (Singleton_users.array_client.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			username = (Client) func_users.username_client_dummies(func_users.mostrar_username_client());
			localizacion = func_find.find(username);
			if (localizacion != -1) {
				username = Singleton_users.array_client.remove(localizacion);
				JOptionPane.showMessageDialog(null, "Usuario borrado");
			} else {
				JOptionPane.showMessageDialog(null, "Error, el Usuario no exsiste");
			}
		}
	}
	
	public static void delete_client_profile(Client username) {
		int localizacion = -1;
		localizacion = func_find.find(username);
		username = Singleton_users.array_client.remove(localizacion);
		JOptionPane.showMessageDialog(null, "Usuario borrado");
	}
}
