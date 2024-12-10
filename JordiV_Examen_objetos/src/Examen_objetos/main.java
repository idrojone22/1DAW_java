package Examen_objetos;

import java.util.ArrayList;

import Examen_objetos.modules.users.classes.Admin;
import Examen_objetos.modules.users.classes.Client;
import Examen_objetos.modules.users.classes.Singleton_users;
import Examen_objetos.utils.func_main;
import Examen_objetos.utils.func_singleton;

public class main {

	public static void main(String[] args) {
		Singleton_users.array_admin = new ArrayList <Admin> ();
    	Singleton_users.array_client = new ArrayList <Client> ();
		
		func_singleton.crear_singleton();
		func_main.dummies();
		
		func_main.main();
	}
}