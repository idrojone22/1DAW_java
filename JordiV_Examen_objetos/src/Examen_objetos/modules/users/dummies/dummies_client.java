package Examen_objetos.modules.users.dummies;

import java.util.Random;

import javax.swing.JOptionPane;

import Examen_objetos.classes.Fecha;
import Examen_objetos.modules.cursos.dummies.dummies;
import Examen_objetos.modules.users.classes.Admin;
import Examen_objetos.modules.users.classes.Client;
import Examen_objetos.modules.users.classes.Singleton_users;
import Examen_objetos.modules.users.utils.func_edad;
import Examen_objetos.modules.users.utils.func_find;

public class dummies_client {
	public static void crear_client () {
		int localizacion = -1;
		Client client =  crear_client_username();
		localizacion = func_find.find(client);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El username ya exsiste");
		} else {
			client = cargarClient();
			Singleton_users.array_client.add(client);
			System.out.print("Username = " + client.get_username() + "\n");
		}
	}
	
	public static Client crear_client_username() {
	    Random random = new Random();

	    // Determinar una longitud aleatoria entre 1 y 4
	    int longitud = 1 + random.nextInt(4); 

	    StringBuilder letras = new StringBuilder();
	    for (int i = 0; i < longitud; i++) {
	        char letra = (char) ('A' + random.nextInt(26)); // Generar letra aleatoria
	        letras.append(letra);
	    }

	    String resultado = letras.toString();
	    Singleton_users.username = resultado;
	    return new Client(Singleton_users.username);
	}

	
	public static Client cargarClient()  {
		String username = Singleton_users.username;
		String password = "password";
		String email = "ejemplo.@gmail.com";
		Fecha fecha_nacimiento  = dummies_users.crear_fecha_random();
		int edad = func_edad.calcularEdad(fecha_nacimiento);
		boolean log = false;
		Fecha fecha_registro = dummies_users.generarFechaPosterior(fecha_nacimiento);
		
		return new Client (username, password, email,fecha_nacimiento, edad, log, fecha_registro );
	}
}
