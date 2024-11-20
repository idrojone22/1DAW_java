package tema4_v10.modules.courses.dummies;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

import tema4_v10.modules.courses.classes.Cursos;
import tema4_v10.modules.courses.utils.func_fecha;
import tema4_v10.modules.courses.utils.func_precio;
import tema4_v10.modules.courses.utils.validar_regex;
import tema4_v10.classes.Fecha;
import tema4_v10.modules.courses.utils.func_buscar;
import tema4_v10.modules.courses.utils.func_cursos;
import tema4_v10.modules.courses.classes.Desarrollo_web;
import tema4_v10.modules.courses.classes.Singleton;

public class crear_dummies {
	
public static void crear_desarrollo() {
		
		int localizacion = -1;
		Cursos ID = crear_ID_desarrollo();
		//JOptionPane.showMessageDialog(null, ID.toString());
		localizacion =  func_buscar.find(ID);
		//JOptionPane.showMessageDialog(null, localizacion);
		if (localizacion != -1) {
			JOptionPane.showMessageDialog(null,"El ID ya exsiste");
		} else {
			ID = cargarDesarrollo();
			Singleton.array_desarrollo.add(((Desarrollo_web)ID));
			//JOptionPane.showMessageDialog(null, ID.toString());
		}
	}
	public static Desarrollo_web cargarDesarrollo() {
		String ID_course = Singleton.ID_course;
		JOptionPane.showMessageDialog(null, ID_course);
		String titulo = randomString();
		String descripcion = randomString();
		String categoria =  "categoria" ;
		String dificultad = "dificultad" ;
		Fecha fecha_i = crear_random();
		Fecha fecha_f = func_fecha.crear_fecha_automatic_suma("fecha_f", fecha_i, 20);
		int precioHora = 20; /*validadors.validar_int("Dame num", "precioHora");*/
		int horasDias = 8; /* validar_regex.validar_horas();*/
		Fecha fecha_inscripcion_i =  func_fecha.crear_fecha_automatic("fecha_inscripcion_i", fecha_i, 7);
		Fecha fecha_inscripcion_f =  func_fecha.crear_fecha_automatic("fecha_inscripcion_f", fecha_i, 4);
		Fecha fecha_confirmacion_i =func_fecha.crear_fecha_automatic("fecha_confirmacion_i", fecha_i, 3);
		Fecha fecha_confirmacion_f = func_fecha.crear_fecha_automatic("fecha_confirmacion_f", fecha_i, 1);
		Fecha fecha_compra = generarFechaAleatoriaAnterior(fecha_i.toString());
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
	
	public static String randomString() {
		 Random random = new Random();
	        
	        // Longitud aleatoria entre 5 y 15 (puedes ajustar el rango)
	        int longitud = random.nextInt(11) + 5;  // Genera un número entre 5 y 15
	        
	        StringBuilder resultado = new StringBuilder();
	        
	        // Definir los caracteres posibles (letras y números)
	        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        
	        // Generar el String aleatorio
	        for (int i = 0; i < longitud; i++) {
	            int indice = random.nextInt(caracteres.length());
	            resultado.append(caracteres.charAt(indice));
	        }
	      return resultado.toString();
	}
	
	public static Fecha crear_random() {
		Fecha fecha = null;

		do {
			String fecha_s = generarFechaAleatoria();//validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			}
		} while (!fecha.comprobarFechas());

		return fecha;
	}
	
	 public static String generarFechaAleatoria() {
	        Random random = new Random();

	        int año = random.nextInt(125) + 1900;  

	        int mes = random.nextInt(12) + 1;  
	        
	        int dia;
	        if (mes == 2) {  
	            if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
	                dia = random.nextInt(29) + 1;  
	            } else {
	                dia = random.nextInt(28) + 1; 
	            }
	        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { 
	            dia = random.nextInt(30) + 1;
	        } else {  
	            dia = random.nextInt(31) + 1;
	        }

	        String fecha = String.format("%02d/%02d/%04d", dia, mes, año);

	        return fecha;
	    }
	 
	 public static Fecha generarFechaAleatoriaAnterior(String fechaLimite) {
	        try {
	            // Formato de la fecha
	            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	            Date fechaLimiteDate = sdf.parse(fechaLimite);  // Parsear la fecha límite a tipo Date

	            // Convertir la fecha límite a milisegundos
	            long fechaLimiteMillis = fechaLimiteDate.getTime();

	            Random random = new Random();
	            
	            // Generar un número aleatorio de milisegundos entre 0 y la fecha límite
	            long fechaAleatoriaMillis = random.nextLong() % fechaLimiteMillis;
	            if (fechaAleatoriaMillis < 0) {
	                fechaAleatoriaMillis = -fechaAleatoriaMillis;
	            }

	            // Crear la fecha aleatoria
	            Date fechaAleatoria = new Date(fechaAleatoriaMillis);

	            // Convertir la fecha aleatoria a String en formato dd/MM/yyyy
	            String fechaAleatoriaStr = sdf.format(fechaAleatoria);

	            // Devolver el objeto Fecha con la fecha como String
	            return new Fecha(fechaAleatoriaStr);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	
}