package Examen_objetos.modules.cursos.utils;

import Examen_objetos.modules.cursos.classes.Desarrollo_web;
import Examen_objetos.modules.cursos.classes.Desplegamiento_web;
import Examen_objetos.modules.cursos.classes.Diseno_web;
import Examen_objetos.modules.cursos.classes.IA;
import Examen_objetos.modules.cursos.classes.Singleton;
import Examen_objetos.modules.cursos.classes.Cursos;

public class func_buscar {
	
	/*public static int find_desarrollo (Desarrollo_web desarrollo) {
		for (int i = 0; i <= (Singleton.array_desarrollo.size() -1); i++) {
			if((Singleton.array_desarrollo.get(i).equals(desarrollo)) ) return i;
		}
		return -1;
	} */
	
	public static int find_diseno (Diseno_web diseno) {
		for (int i = 0; i <= (Singleton.array_diseno.size() -1); i++) {
			if((Singleton.array_diseno.get(i).equals(diseno)) ) return i;
		}
		return -1;
	}
	
	public static int find_desplegamiento (Desplegamiento_web desplegamiento) {
		for (int i = 0; i <= (Singleton.array_desplegamiento.size() -1); i++) {
			if((Singleton.array_desplegamiento.get(i).equals(desplegamiento)) ) return i;
		}
		return -1;
	} 
	
	public static int find_ia (IA ia) {
		for (int i = 0; i <= (Singleton.array_ia.size() -1); i++) {
			if((Singleton.array_ia.get(i).equals(ia)) ) return i;
		}
		
		return -1;
	}
	
	public static int find(Cursos curso) {
		for (int i = 0; i <= (Singleton.array_desarrollo.size() -1); i++) {
			if((Singleton.array_desarrollo.get(i).equals(curso)) ) return i;
		}
		
		for (int i = 0; i <= (Singleton.array_diseno.size() -1); i++) {
			if((Singleton.array_diseno.get(i).equals(curso)) ) return i;
		}
		
		for (int i = 0; i <= (Singleton.array_desplegamiento.size() -1); i++) {
			if((Singleton.array_desplegamiento.get(i).equals(curso)) ) return i;
		}
		
		for (int i = 0; i <= (Singleton.array_ia.size() -1); i++) {
			if((Singleton.array_ia.get(i).equals(curso)) ) return i;
		}
		
		return -1;
	}
}
