package tema4_v13;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import tema4_v13.utils.menus;
import tema4_v13.modules.cursos.utils.func_singleton;
import tema4_v13.modules.users.classes.Admin;
import tema4_v13.modules.users.classes.Client;
import tema4_v13.modules.users.classes.Singleton;
import tema4_v13.modules.users.utils.CRUD.func_create;
import tema4_v13.modules.users.utils.CRUD.func_delete;
import tema4_v13.modules.users.utils.CRUD.func_read;
import tema4_v13.utils.func_main;

public class test {

    public static void main(String[] args) {
    	
    	Singleton.array_admin = new ArrayList <Admin> ();
    	Singleton.array_client = new ArrayList <Client> ();
    	/*
    	func_create.crear_admin();
    	func_create.crear_client();
    	
    	func_read.read_admin();
    	func_read.read_client();r
    	
    	func_delete.delete_admin();
    	func_delete.delete_client();
    	
      	func_read.read_admin();
    	func_read.read_client();
	*/			
    	Object primer_menu = null;
    	Object segundo_menu_client = null;
    	Object segundo_menu_admin= null;
		Object tercer_menu = null;
		
		Object opciones_pm[] = {"Log in","Sign up", "Salir"};
		Object opciones_sm_client[] = {"Read All" , "Read One", "Perfil", "Log out"};
		Object opciones_sm_admin[] = {"CRUD cursos", "CRUD usuaris", "Perfil", "Log out"};
		
		int salir = 0;
		
		func_singleton.crear_singleton();
		func_main.dummies();
		
		do {
			primer_menu = menus.combos("Selecciona la opción", "Selector de opciones", opciones_pm, opciones_pm[0]);
			
			switch (primer_menu.toString()) {
				case "Log in":
					func_main.log_in();
					break;
				case "Sign up":
					func_main.sign_up();
					break;
				case "Salir":
					System.exit(0);
					break;
			} // END SWITCH
		} while ( salir != 2);
    }
}


