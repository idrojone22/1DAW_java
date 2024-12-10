package Examen_objetos.modules.cursos.utils;

import java.util.ArrayList;

import Examen_objetos.modules.cursos.classes.Desarrollo_web;
import Examen_objetos.modules.cursos.classes.Desplegamiento_web;
import Examen_objetos.modules.cursos.classes.Diseno_web;
import Examen_objetos.modules.cursos.classes.Singleton;
import Examen_objetos.modules.users.classes.Admin;
import Examen_objetos.modules.users.classes.Client;

public class func_singleton {
	public static void crear_singleton() {
		Singleton.array_desarrollo = new ArrayList <Desarrollo_web> ();
		Singleton.array_diseno = new ArrayList <Diseno_web> ();
		Singleton.array_desplegamiento = new ArrayList <Desplegamiento_web> ();
    	//Singleton.array_admin = new ArrayList <Admin> ();
    	//Singleton.array_client = new ArrayList <Client> ();
	}
}
