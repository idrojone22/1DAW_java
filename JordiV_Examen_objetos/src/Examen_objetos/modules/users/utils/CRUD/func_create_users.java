package Examen_objetos.modules.users.utils.CRUD;

import javax.swing.JOptionPane;

import Examen_objetos.utils.validadors;
import Examen_objetos.modules.users.classes.Admin;
import Examen_objetos.modules.users.classes.Client;
import Examen_objetos.modules.users.classes.Singleton_users;
import Examen_objetos.modules.users.classes.Vip;
import Examen_objetos.modules.users.utils.func_find;
import Examen_objetos.modules.users.utils.func_users;
import Examen_objetos.utils.func_main;

public class func_create_users {
	public static void crear_admin() {
		int localizacion = -1;
		Admin username = func_users.preguntar_username_admin();
		localizacion =  func_find.find(username);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El username ya esta en uso");
		} else {
			username = func_users.crear_admin();
			Singleton_users.array_admin.add((Admin) username);
			func_main.menu_admin(username);
		}
	}
	
	public static void crear_client() {
		int localizacion = -1;
		Client username = func_users.preguntar_username_client();
		localizacion =  func_find.find(username);
		if (localizacion != -1) {
				JOptionPane.showMessageDialog(null,"El username ya esta en uso");
		} else {
			username = func_users.crear_client();
			Singleton_users.array_client.add((Client) username);
			username.set_log(true);
			func_main.menu_cliente(username);
		}
	}
	
	public static void crear_vip() {
		int localizacion = -1;
		Vip username = func_users.preguntar_username_vip();
		localizacion =  func_find.find(username);
		if (localizacion != -1) {
				JOptionPane.showMessageDialog(null,"El username ya esta en uso");
		} else {
			username = func_users.crear_vip();
			Singleton_users.array_vip.add((Vip) username);
			func_main.menu_vip(username);
		}
	}
	
	public static void crear_client_CURD() {
		int localizacion = -1;
		Client username = func_users.preguntar_username_client();
		localizacion =  func_find.find(username);
		if (localizacion != -1) {
				JOptionPane.showMessageDialog(null,"El username ya esta en uso");
		} else {
			username = func_users.crear_client();
			Singleton_users.array_client.add((Client) username);
		}
	}
	
	public static void crear_admin_CRUD() {
		int localizacion = -1;
		Admin username = func_users.preguntar_username_admin();
		localizacion = func_find.find(username);
		
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El username ya esta en uso");
		} else {
			username = func_users.crear_admin();
			Singleton_users.array_admin.add((Admin)username);
		}
	}
}
