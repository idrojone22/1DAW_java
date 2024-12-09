package tema4_v13;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import tema4_v13.utils.func_main;
import tema4_v13.utils.menus;
import tema4_v13.modules.cursos.classes.Cursos;
import tema4_v13.modules.cursos.utils.func_singleton;
import tema4_v13.modules.cursos.utils.CRUD.func_create;
import tema4_v13.modules.cursos.utils.CRUD.func_delete;
import tema4_v13.modules.cursos.utils.CRUD.func_read;
import tema4_v13.modules.cursos.utils.CRUD.func_readone;
import tema4_v13.modules.cursos.utils.CRUD.func_update;
import tema4_v13.modules.users.classes.Admin;
import tema4_v13.modules.users.classes.Client;
import tema4_v13.modules.users.classes.Singleton_users;

public class main {

	public static void main(String[] args) {
		Singleton_users.array_admin = new ArrayList <Admin> ();
    	Singleton_users.array_client = new ArrayList <Client> ();
		
		func_singleton.crear_singleton();
		func_main.dummies();
		
		func_main.main();
	}
}