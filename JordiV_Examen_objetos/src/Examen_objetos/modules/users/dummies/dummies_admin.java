package Examen_objetos.modules.users.dummies;

import Examen_objetos.modules.users.classes.Singleton_users;
import Examen_objetos.modules.users.utils.func_edad;
import Examen_objetos.modules.users.utils.func_find;
import Examen_objetos.modules.users.utils.func_sueldo;

import javax.swing.JOptionPane;

import Examen_objetos.classes.Fecha;
import Examen_objetos.modules.cursos.dummies.dummies;
import Examen_objetos.modules.users.classes.Admin;

public class dummies_admin {

	public static void crear_admin(String username) {
		int localizacion = -1;
		Singleton_users.username = username;
		Admin admin = new Admin (Singleton_users.username);
		localizacion = func_find.find(admin);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null, "El username ya exsiste");
		} else {
			admin = cargarAdmin(username);
			Singleton_users.array_admin.add(admin);
		}
	}
	
	public static Admin cargarAdmin(String superadmin) {

		if (superadmin.equals("idrojone")) {
			String username = Singleton_users.username;
			String password = "1234";
			String email = "superadmin@gmail.com";
			Fecha fecha_nacimiento = dummies_users.crear_fecha_random();
			int edad = func_edad.calcularEdad(fecha_nacimiento);
			String nombre = "Jordi";
			String apellidos = "Valls";
			String telefono = "666666666";
			Fecha fecha_alta =  dummies_users.generarFechaPosterior(fecha_nacimiento);	
			int sueldo = func_sueldo.calcularSueldo(fecha_alta);

			return new Admin (username, password, email, fecha_nacimiento, edad, nombre, apellidos, telefono, fecha_alta, sueldo);
		} else if(superadmin.equals("yomogan")) {
			String username = Singleton_users.username;
			String password = "1234";
			String email = "superadmin@gmail.com";
			Fecha fecha_nacimiento =  dummies_users.crear_fecha_random();;
			int edad = func_edad.calcularEdad(fecha_nacimiento);
			String nombre = "Yolanda";
			String apellidos = "Yolanda";
			String telefono = "666666666";
			Fecha fecha_alta = dummies_users.generarFechaPosterior(fecha_nacimiento);	
			int sueldo = func_sueldo.calcularSueldo(fecha_alta);

			return new Admin (username, password, email, fecha_nacimiento, edad, nombre, apellidos, telefono, fecha_alta, sueldo);
		} else {
			JOptionPane.showMessageDialog(null, "Error");
			return null;
		}
	}
}