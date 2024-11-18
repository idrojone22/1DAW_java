package tema4_v8.modules.courses.utils;

import tema4_v8.classes.Fecha;

public class func_precio {

	public static int calcular_precio(Fecha fecha_i, Fecha fecha_f, int precioHora, int horasDias) {
		int duracion = fecha_i.restarFechas(fecha_f);
		int precio = duracion * horasDias * precioHora;
		return precio;
	}
	
	public static int calcular_precio_ultimas_plazas(Fecha fecha_i, Fecha fecha_f, int precioHora, int horasDias, Fecha fecha1, Fecha fecha2, Fecha fecha_compra) {
		int duracion = fecha_i.restarFechas(fecha_f);
		int precio = duracion * horasDias * precioHora;
		
		System.out.println(fecha_compra.compararFechas(fecha1));
		System.out.println(fecha_compra.compararFechas(fecha2));
		System.out.println(duracion);
		System.out.println(precio);
		
		if (fecha_compra.compararFechas(fecha1) == 1 && fecha_compra.compararFechas(fecha2) == -1 ) {
			System.out.println("Estem dins");
			precio *= 0.7;
			System.out.println(precio);
		}
		return precio;
	}
}