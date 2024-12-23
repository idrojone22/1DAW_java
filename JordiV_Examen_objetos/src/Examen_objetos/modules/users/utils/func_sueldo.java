package Examen_objetos.modules.users.utils;

import java.util.Calendar;

import Examen_objetos.classes.Fecha;

public class func_sueldo {
	public static int calcularSueldo(Fecha fecha_alta) {
		int sueldoBase = 1400;
		int incremento = 25;
		
		  Calendar fechaActual = Calendar.getInstance();
		  
		  int anioAlta = fecha_alta.get_anio(); 
		  int mesAlta = fecha_alta.get_mes(); 
		  int diaAlta = fecha_alta.get_dia();
		  
		  int aniosTrabajados = fechaActual.get(Calendar.YEAR) - anioAlta;
		  
		  if (mesAlta > (fechaActual.get(Calendar.MONTH) + 1) || 
			       (mesAlta == (fechaActual.get(Calendar.MONTH) + 1) && diaAlta > fechaActual.get(Calendar.DAY_OF_MONTH))) {
			        aniosTrabajados--;
		  }
		  
		  return sueldoBase + (aniosTrabajados * incremento);
	}
}
