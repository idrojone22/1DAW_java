package tema4_v13.modules.users.dummies;

import tema4_v13.modules.users.classes.Singleton_users;
import tema4_v13.modules.users.utils.func_find;

import javax.swing.JOptionPane;

import tema4_v13.classes.Fecha;
import tema4_v13.modules.cursos.dummies.dummies;
import tema4_v13.modules.users.classes.Admin;

public class dummies_admin {
	public static void crear_admin(String username) {
		int localizacion = -1;
		Singleton_users.username = username;
		Admin admin = new Admin (Singleton_users.username);
		localizacion = func_find.find(admin);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null, "El username ya exsiste");
		} else {
			admin = cargarAdminJordi();
			Singleton_users.array_admin.add(admin);
		}
	}
	
	public static Admin cargarAdminJordi(String superadmin) {
		String username = Singleton_users.username;
		String password = "1234";
		String email = "superadmin@gmail.com";
		Fecha fecha_nacimiento = ;
		int edad = 18;
		String
		
	}
}