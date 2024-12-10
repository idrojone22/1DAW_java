package Examen_objetos.modules.cursos.dummies;

import java.util.Random;

import javax.swing.JOptionPane;

import Examen_objetos.classes.Fecha;
import Examen_objetos.modules.cursos.classes.Cursos;
import Examen_objetos.modules.cursos.classes.Desarrollo_web;
import Examen_objetos.modules.cursos.classes.Singleton;
import Examen_objetos.modules.cursos.utils.func_buscar;
import Examen_objetos.modules.cursos.utils.func_fecha;
import Examen_objetos.modules.cursos.utils.func_precio;

public class desarrollo_dummies {
public static void crear_desarrollo() {
		
		int localizacion = -1;
		Cursos ID = crear_ID_desarrollo();
		localizacion =  func_buscar.find(ID);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El ID ya exsiste");
		} else {
			ID = cargarDesarrollo();
			Singleton.array_desarrollo.add(((Desarrollo_web)ID));
		}
	}

	public static Desarrollo_web cargarDesarrollo() {
		String ID_course = Singleton.ID_course;
		String titulo = dummies.randomString();
		String descripcion =dummies.randomString();
		String categoria =  "categoria" ;
		String dificultad = "dificultad" ;
		Fecha fecha_i = dummies.crear_fecha_random();
		Fecha fecha_f = func_fecha.crear_fecha_automatic_suma("fecha_f", fecha_i, 20);
		int precioHora = 20; /*validadors.validar_int("Dame num", "precioHora");*/
		int horasDias = 8; /* validar_regex.validar_horas();*/
		Fecha fecha_inscripcion_i =  func_fecha.crear_fecha_automatic("fecha_inscripcion_i", fecha_i, 7);
		Fecha fecha_inscripcion_f =  func_fecha.crear_fecha_automatic("fecha_inscripcion_f", fecha_i, 4);
		Fecha fecha_confirmacion_i =func_fecha.crear_fecha_automatic("fecha_confirmacion_i", fecha_i, 3);
		Fecha fecha_confirmacion_f = func_fecha.crear_fecha_automatic("fecha_confirmacion_f", fecha_i, 1);
		Fecha fecha_compra = dummies.generarFechaAleatoriaAnterior(fecha_i.toString());
		int precio = func_precio.calcular_precio(fecha_i, fecha_f, precioHora, horasDias);
		
		return new Desarrollo_web(ID_course, titulo, descripcion,categoria, dificultad,fecha_i,fecha_f, precioHora, horasDias,fecha_confirmacion_i, fecha_confirmacion_f, fecha_inscripcion_i, fecha_inscripcion_f, fecha_compra, precio);
	}
	
	public static Cursos crear_ID_desarrollo () {
		
		Random random = new Random();
		char letra = (char) ('A' + random.nextInt(26));
		 
		 StringBuilder numeros = new StringBuilder();
		 for (int i = 0; i < 4; i++) {
			 numeros.append(random.nextInt(10));  
	    }
		 
	   String resultado = letra + numeros.toString();
	       
	   Singleton.ID_course = resultado;
	   return new Desarrollo_web (Singleton.ID_course );
	} 
}
