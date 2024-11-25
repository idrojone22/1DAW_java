package tema4_v13.modules.cursos.dummies;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

import tema4_v12.modules.cursos.classes.Cursos;
import tema4_v12.modules.cursos.utils.func_fecha;
import tema4_v12.modules.cursos.utils.func_precio;
import tema4_v12.modules.cursos.utils.validar_regex;
import tema4_v12.classes.Fecha;
import tema4_v12.modules.cursos.utils.func_buscar;
import tema4_v12.modules.cursos.utils.func_cursos;
import tema4_v12.modules.cursos.classes.Desarrollo_web;
import tema4_v12.modules.cursos.classes.Singleton;

public class dummies {
		
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
	
	public static Fecha crear_fecha_random() {
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
	 
	 // Pasar fechaLimite
	 //Crear Fecha nueva
	 // Comparar
	 public static Fecha generarFechaAleatoriaAnterior(String fechaLimite) {
	        try {
	        
	            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	            Date fechaLimiteDate = sdf.parse(fechaLimite);  

	            long fechaLimiteMillis = fechaLimiteDate.getTime();

	            Random random = new Random();
	            
	            long fechaAleatoriaMillis = random.nextLong() % fechaLimiteMillis;
	            if (fechaAleatoriaMillis < 0) {
	                fechaAleatoriaMillis = -fechaAleatoriaMillis;
	            }

	            Date fechaAleatoria = new Date(fechaAleatoriaMillis);

	            String fechaAleatoriaStr = sdf.format(fechaAleatoria);

	            return new Fecha(fechaAleatoriaStr);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	 
	 public static void crear_cursos() {
		 desarrollo_dummies.crear_desarrollo();
		diseno_dummies.crear_diseno();
		desplegamiento_dummies.crear_desplegamiento();
	 }
	
}
