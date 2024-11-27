package tema4_v13.modules.users.utils.CRUD;

import javax.swing.JOptionPane;

import tema4_v13.modules.users.classes.Singleton;
import tema4_v13.modules.users.utils.func_find;
import tema4_v13.modules.users.utils.func_users;
import tema4_v13.modules.users.classes.Admin;
import tema4_v13.modules.users.classes.Client;

public class func_delete {
	public static void delete_admin() {
		int localizacion = -1;
		Admin username = null;
		if (Singleton.array_admin.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			username = (Admin) func_users.preguntar_username_admin();
			localizacion = func_find.find(username);
			if (localizacion != -1) {
				username = Singleton.array_admin.remove(localizacion);
				JOptionPane.showMessageDialog(null, "Usuario borrado");
			} else {
				JOptionPane.showMessageDialog(null, "Error, el Usuario no exsiste");
			}
		}
	}
	
	public static void delete_client() {
		int localizacion = -1;
		Client username = null;
		if (Singleton.array_client.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error");
		} else {
			username = (Client) func_users.preguntar_username_client();
			localizacion = func_find.find(username);
			if (localizacion != -1) {
				username = Singleton.array_client.remove(localizacion);
				JOptionPane.showMessageDialog(null, "Usuario borrado");
			} else {
				JOptionPane.showMessageDialog(null, "Error, el Usuario no exsiste");
			}
		}
	}
}
