package tema4_v4;

import javax.swing.JOptionPane;

public class func_fecha {
	public static Fecha craar(String titulo) {

		Fecha fecha = null;

		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			}
		} while (!fecha.comprobarFechas());

		return fecha;
	}

	public static Fecha crar_fecha_posterior(String titulo, Fecha fecha1) {

		Fecha fecha = null;
		int comprobar = 0;
		boolean valido = false;

		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				comprobar = fecha1.compararFechas(fecha);

				if (comprobar == -1) {
					valido = true;

				} else if (comprobar == 0) {
					JOptionPane.showMessageDialog(null, "Las fechas son iguales" + "\n" + "Debe de ser posterior a  " + fecha1.toString());
				} else {
					JOptionPane.showMessageDialog(null, "Las fecha es anterior" + "\n" + "Debe de ser posterior a " +  fecha1.toString());
				}
			}
		} while (!valido);

		return fecha;
	}

	public static Fecha crear_fecha_anterior(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		int comprobar = 0;
		boolean valido = false;

		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				comprobar = fecha1.compararFechas(fecha);

				if (comprobar == 1) {
					valido = true;

				} else if (comprobar == 0) {
					JOptionPane.showMessageDialog(null, "Las fechas son iguales" + "\n" + "Debe de ser anterior a " + fecha1.toString());
				} else {
					JOptionPane.showMessageDialog(null, "Las fecha es posterior" + "\n" + "Debe de ser anterior a " + fecha1.toString());
				}
			}
		} while (!valido);

		return fecha;
	}

	public static Fecha crear_entre2(String titulo, Fecha fecha1, Fecha fecha2) {
	    Fecha fecha = null;
	    boolean valido = false;
	    int comprobarFecha1 = 0;
	    int comprobarFecha2 = 0;

	    do {
	        String fecha_s = validar_regex.validar_reg_fecha(titulo);
	        fecha = new Fecha(fecha_s);

	        if (!fecha.comprobarFechas()) {
	            JOptionPane.showMessageDialog(null, "Fecha Inválida");
	        } else {
	            comprobarFecha1 = fecha1.compararFechas(fecha); 
	           comprobarFecha2 = fecha2.compararFechas(fecha);  

	            if (comprobarFecha1 == -1 && comprobarFecha2 == 1) {
	                valido = true;  
	            } else {
	                if (comprobarFecha1 != -1) {
	                    JOptionPane.showMessageDialog(null, "La fecha debe ser posterior a " + fecha1.toString());
	                }
	                if (comprobarFecha2 != 1) {
	                    JOptionPane.showMessageDialog(null, "La fecha debe ser anterior a " + fecha2.toString());
	                }
	            }
	        }
	    } while (!valido);

	    return fecha;
	}

	public static Fecha crear_fecha_inscripcion_i(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		boolean valido = false;
		int dias = 0;

		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				dias = fecha.restarFechas(fecha1);

				// JOptionPane.showMessageDialog(null, dias);

				if (dias == 7) {
					valido = true;
				} else {
					JOptionPane.showMessageDialog(null,
							"Fecha Inválida\n La fecha debe de ser 7 dias antes de " + fecha1.toString());
				} // end if
			}

		} while (valido == false);

		return fecha;
	}

	public static Fecha crear_fecha_inscripcion_f(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		boolean valido = false;
		int dias = 0;

		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				dias = fecha.restarFechas(fecha1);

				if (dias == 3) {
					valido = true;
				} else {
					JOptionPane.showMessageDialog(null,
							"Fecha Inválida\nLa fecha debe de ser 3 dias despues de " + fecha1.toString());
				} // end if
			}
		} while (!valido);

		return fecha;
	}

	public static Fecha crear_fecha_confirmacion_i(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		boolean valido = false;
		int dias = 0;

		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				dias = fecha.restarFechas(fecha1);

				if (dias == 1) {
					valido = true;
				} else {
					JOptionPane.showMessageDialog(null,
							"Fecha Inválida\nLa fecha debe de ser 1 dia despues de " + fecha.toString());
				} // end if
			}
		} while (!valido);

		return fecha;
	}

	public static Fecha crear_fecha_confirmacion_f(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		boolean valido = false;
		int dias = 0;

		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				dias = fecha.restarFechas(fecha1);

				if (dias == 2) {
					valido = true;
				} else {
					JOptionPane.showMessageDialog(null,
							"Fecha Inválida\nLa fecha debe de ser 2 dias despues de " + fecha1.toString());
				} // end if
			}
		} while (!valido);

		return fecha;
	}

	public static Fecha crear_fecha_final(String titulo, Fecha fecha1) {
		Fecha fecha = null;
		boolean valido = false;
		int dias = 0;

		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				dias = fecha.restarFechas(fecha1);

				if (dias == 20) {
					valido = true;
				} else {
					JOptionPane.showMessageDialog(null,
							"Fecha Inválida\nLa fecha debe de ser 20 dias despues de " + fecha1.toString());
				} // end if
			}
		} while (!valido);

		return fecha;
	}

	public static Fecha crear_fecha_diferencia(String titulo, Fecha fecha1, int dias) {
		Fecha fecha = null;
		boolean valido = false;
		int dias_igual = 0;

		do {
			String fecha_s = validar_regex.validar_reg_fecha(titulo);

			fecha = new Fecha(fecha_s);

			fecha.comprobarFechas();

			if (!fecha.comprobarFechas()) {
				JOptionPane.showMessageDialog(null, "Fecha Inválida");
			} else {
				dias_igual = fecha.restarFechas(fecha1);

				if (dias_igual == dias) {
					valido = true;
				} else {
					JOptionPane.showMessageDialog(null, "Fecha Inválida\nLa fecha debe de ser " + dias
							+ "  dias despues de " + fecha.toString());
				} // end if
			}
		} while (!valido);

		return fecha;
	}

}