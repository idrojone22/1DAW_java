package tema4_v13.modules.users.dummies;

import java.util.Calendar;
import java.util.Random;

import javax.swing.JOptionPane;

import tema4_v13.classes.Fecha;

public class dummies_users {
	public static String randomString() {
		 Random random = new Random();
	       
	        int longitud = random.nextInt(11) + 5;  
	        StringBuilder resultado = new StringBuilder();
	        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        for (int i = 0; i < longitud; i++) {
	            int indice = random.nextInt(caracteres.length());
	            resultado.append(caracteres.charAt(indice));
	        }
	      return resultado.toString();
	}
	
	public static Fecha crear_fecha_random() {
		  Random random = new Random();
		    int anioActual = Calendar.getInstance().get(Calendar.YEAR);
		    int mesActual = Calendar.getInstance().get(Calendar.MONTH) + 1; // Los meses van de 0 a 11
		    int diaActual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

		    while (true) {
		        int anio = random.nextInt(anioActual - 1900 + 1) + 1900;
		        int mes = random.nextInt(12) + 1;
		        int dia;

		        // Generar día válido para el mes y año
		        switch (mes) {
		            case 2:
		                if (esBisiesto(anio)) {
		                    dia = random.nextInt(29) + 1;
		                } else {
		                    dia = random.nextInt(28) + 1;
		                }
		                break;
		            case 4: case 6: case 9: case 11:
		                dia = random.nextInt(30) + 1;
		                break;
		            default:
		                dia = random.nextInt(31) + 1;
		                break;
		        }

		        // Calcular la edad
		        int edad = anioActual - anio;
		        if (mes > mesActual || (mes == mesActual && dia > diaActual)) {
		            edad--; // Si aún no ha llegado su cumpleaños este año, restar 1
		        }

		        // Si la edad es mayor o igual a 18, devolver la fecha
		        if (edad >= 18) {
		            return new Fecha(dia + "/" + mes + "/" + anio);
		        }
		    }
	}
	    private static boolean esBisiesto(int anio) {
	        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
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
	 
	 public static Fecha generarFechaPosterior(Fecha fechaNacimiento) {
	        Random random = new Random();

	        int anioNacimiento = fechaNacimiento.get_anio();
	        int mesNacimiento = fechaNacimiento.get_mes();
	        int diaNacimiento = fechaNacimiento.get_dia();
	        Calendar fechaActual = Calendar.getInstance();
	        int anioActual = fechaActual.get(Calendar.YEAR);
	        int anio = random.nextInt(anioActual - anioNacimiento) + anioNacimiento + 1;
	        int mes = random.nextInt(12) + 1;

	        int dia;
	        switch (mes) {
	            case 2: 
	                if (esBisiesto(anio)) {
	                    dia = random.nextInt(29) + 1;
	                } else {
	                    dia = random.nextInt(28) + 1;
	                }
	                break;
	            case 4: case 6: case 9: case 11: 
	                dia = random.nextInt(30) + 1;
	                break;
	            default: 
	                dia = random.nextInt(31) + 1;
	                break;
	        }
	        return new Fecha(dia + "/" + mes + "/" + anio);
	    }
	 
}
