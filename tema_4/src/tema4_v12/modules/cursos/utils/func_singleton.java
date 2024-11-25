package tema4_v12.modules.cursos.utils;

import java.util.ArrayList;

import tema4_v12.modules.cursos.classes.Desarrollo_web;
import tema4_v12.modules.cursos.classes.Desplegamiento_web;
import tema4_v12.modules.cursos.classes.Diseno_web;
import tema4_v12.modules.cursos.classes.Singleton;

public class func_singleton {
	public static void crear_singleton() {
		Singleton.array_desarrollo = new ArrayList <Desarrollo_web> ();
		Singleton.array_diseno = new ArrayList <Diseno_web> ();
		Singleton.array_desplegamiento = new ArrayList <Desplegamiento_web> ();
	}
}
