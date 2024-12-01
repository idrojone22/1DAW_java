package tema4_v13.modules.cursos.utils;

import java.util.ArrayList;

import tema4_v13.modules.cursos.classes.Desarrollo_web;
import tema4_v13.modules.cursos.classes.Desplegamiento_web;
import tema4_v13.modules.cursos.classes.Diseno_web;
import tema4_v13.modules.cursos.classes.Singleton;
import tema4_v13.modules.users.classes.Admin;
import tema4_v13.modules.users.classes.Client;

public class func_singleton {
	public static void crear_singleton() {
		Singleton.array_desarrollo = new ArrayList <Desarrollo_web> ();
		Singleton.array_diseno = new ArrayList <Diseno_web> ();
		Singleton.array_desplegamiento = new ArrayList <Desplegamiento_web> ();
    	//Singleton.array_admin = new ArrayList <Admin> ();
    	//Singleton.array_client = new ArrayList <Client> ();
	}
}
