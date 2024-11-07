package tema4_v4;

import javax.swing.JOptionPane;

public class func_fecha {
	public static Fecha craar(String titulo) {
		
		Fecha fecha = null;
		
		do {
			String fecha_s =  validar_regex.validar_reg_fecha( titulo);
			
			fecha = new Fecha (fecha_s);
			
			fecha.comprobarFechas();
			
			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			}
		}while(!fecha.comprobarFechas());
		
		return fecha;
	}
	
	public static Fecha crar_fecha_posterior(String titulo, Fecha fecha1) {
		
		Fecha fecha = null;
		int comprobar = 0;
		boolean valido = false;
		
		do {
			String fecha_s =  validar_regex.validar_reg_fecha( titulo);
			
			fecha = new Fecha (fecha_s);
			
			fecha.comprobarFechas();
			JOptionPane.showMessageDialog(null, fecha);
			
			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				comprobar = fecha1.compararFechas(fecha);
				
				if (comprobar == -1 ) {
					valido = true;
					
				} else  if (comprobar == 0){
					JOptionPane.showMessageDialog(null, "Las fechas son iguales" + "\n" + "Debe de ser posterior");
				} else {
					JOptionPane.showMessageDialog(null, "Las fecha es anterior" + "\n" + "Debe de ser posterior");
				}
			}
		}while(!valido);
		
		return fecha;
	}
	
	public static Fecha crear_fecha_anterior(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		int comprobar = 0;
		boolean valido = false;
		
		do {
			String fecha_s =  validar_regex.validar_reg_fecha( titulo);
			
			fecha = new Fecha (fecha_s);
			
			fecha.comprobarFechas();
			
			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				comprobar = fecha1.compararFechas(fecha);
				
				if (comprobar == 1 ) {
					valido = true;
					
				} else  if (comprobar == 0){
					JOptionPane.showMessageDialog(null, "Las fechas son iguales" + "\n" + "Debe de ser anterior");
				} else {
					JOptionPane.showMessageDialog(null, "Las fecha es posterior" + "\n" + "Debe de ser anterior");
				}
			}
		}while(!valido);
		
		return fecha;
	}
	
	public static Fecha crear_entre2(String titulo, Fecha fecha1, Fecha fecha2) {
		Fecha fecha = null;
		boolean valido = false;
		boolean valido1 = false;
		boolean valido2 = false;
		int comprobar = 0;
		int comprobar1 = 0;
		
		do {
			
			comprobar = 0;
			comprobar1 = 0;
			String fecha_s =  validar_regex.validar_reg_fecha( titulo);
			
			fecha = new Fecha (fecha_s);
			
			fecha.comprobarFechas();
			
			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				
				comprobar = fecha1.compararFechas(fecha);
				
				if (comprobar == 1 ) {
					valido1 = true;	
				} else  if (comprobar == 0){
					JOptionPane.showMessageDialog(null, "Las fechas son iguales" + "\n" + "Debe de ser anterior");
				} else {
					JOptionPane.showMessageDialog(null, "Las fecha es posterior" + "\n" + "Debe de ser anterior");
				}
				
				comprobar1 = fecha2.compararFechas(fecha);
				
				if (comprobar1 == -1 ) {
					valido2 = true;	
				} else  if (comprobar1 == 0){
					JOptionPane.showMessageDialog(null, "Las fechas son iguales" + "\n" + "Debe de ser posterior");
				} else {
					JOptionPane.showMessageDialog(null, "Las fecha es anterior" + "\n" + "Debe de ser posterior");
				}
			}
			
			if (valido1 == true && valido2 == true) {
				valido = true;
			}
			
		}while(!valido);
		
		return fecha;
	}
	
	public static Fecha crear_fecha_inscripcion_i(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		boolean valido = false;
		int dias = 0;
		
		do {
			String fecha_s =  validar_regex.validar_reg_fecha(titulo);
			
			fecha = new Fecha (fecha_s);
			
			fecha.comprobarFechas();
			
			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				 dias = fecha.restarFechas(fecha1);
				 
				// JOptionPane.showMessageDialog(null, dias);
				 
				 if (dias == 7) {
					 valido = true;
				 } else {
					 JOptionPane.showMessageDialog(null, "Fecha Inválida\n La fecha debe de ser 7 dias antes de la fecha inicial" );
				 } // end if 
			}
			
		}while(valido == false);
		
		return fecha;
	}
	
	public static  Fecha crear_fecha_inscripcion_f(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		boolean valido = false;
		int dias = 0;
		
		do {
			String fecha_s =  validar_regex.validar_reg_fecha(titulo);
			
			fecha = new Fecha (fecha_s);
			
			fecha.comprobarFechas();
			
			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				 dias = fecha.restarFechas(fecha1);
				 
				 if (dias == 3) {
					 valido = true;
				 } else {
					 JOptionPane.showMessageDialog(null, "Fecha Inválida\nLa fecha debe de ser 3 dias despues de la fecha de inscipcion inicial" );
				 } // end if 
			}
		}while(!valido);
		
		return fecha;
	}
	
	public static Fecha crear_fecha_confirmacion_i(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		boolean valido = false;
		int dias = 0;
		
		do {
			String fecha_s =  validar_regex.validar_reg_fecha(titulo);
			
			fecha = new Fecha (fecha_s);
			
			fecha.comprobarFechas();
			
			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				 dias = fecha.restarFechas(fecha1);
				 
				 if (dias == 1) {
					 valido = true;
				 } else {
					 JOptionPane.showMessageDialog(null, "Fecha Inválida\nLa fecha debe de ser 1 dia despues de la fecha de inscipcion final" );
				 } // end if 
			}
		}while(!valido);
		
		return fecha;
	}
	
	public static Fecha crear_fecha_confirmacion_f(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		boolean valido = false;
		int dias = 0;
		
		do {
			String fecha_s =  validar_regex.validar_reg_fecha(titulo);
			
			fecha = new Fecha (fecha_s);
			
			fecha.comprobarFechas();
			
			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				 dias = fecha.restarFechas(fecha1);
				 
				 if (dias == 2) {
					 valido = true;
				 } else {
					 JOptionPane.showMessageDialog(null, "Fecha Inválida\nLa fecha debe de ser 2 dias despues de la fecha de fecha confirmacion incial" );
				 } // end if 
			}
		}while(!valido);
		
		return fecha;
	}
	
	public static Fecha crear_fecha_final(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		boolean valido = false;
		int dias = 0;
		
		do {
			String fecha_s =  validar_regex.validar_reg_fecha(titulo);
			
			fecha = new Fecha (fecha_s);
			
			fecha.comprobarFechas();
			
			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				 dias = fecha.restarFechas(fecha1);
				 
				 if (dias == 20) {
					 valido = true;
				 } else {
					 JOptionPane.showMessageDialog(null, "Fecha Inválida\nLa fecha debe de ser 20 dias despues de la fecha de fecha confirmacion incial" );
				 } // end if 
			}
		}while(!valido);
		
		return fecha;
	}
	
	public static  Fecha crear_fecha_diferencia(String titulo, Fecha fecha1, int dias) {
		Fecha fecha = null;
		boolean valido = false;
		int dias_igual = 0;
		
		do {
			String fecha_s =  validar_regex.validar_reg_fecha(titulo);
			
			fecha = new Fecha (fecha_s);
			
			fecha.comprobarFechas();
			
			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				dias_igual = fecha.restarFechas(fecha1);
				 
				 if (dias_igual == dias) {
					 valido = true;
				 } else {
					 JOptionPane.showMessageDialog(null, "Fecha Inválida\nLa fecha debe de ser "  + dias + "  dias despues de la fecha de fecha confirmacion incial" );
				 } // end if 
			}
		}while(!valido);
		
		return fecha;
	}
	
}