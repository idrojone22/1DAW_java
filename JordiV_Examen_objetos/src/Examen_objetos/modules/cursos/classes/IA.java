package Examen_objetos.modules.cursos.classes;

import Examen_objetos.classes.Fecha;

public class IA extends Cursos {
	private Fecha f_cupon_ini;
	private Fecha f_c_promocion_f;
	
	public IA(String iD_course, String titulo, String descripcion, String categoria, String dificultad,
			Fecha fecha_i, Fecha fecha_f, int precioHora, int horasDias, Fecha f_cupon_ini, Fecha f_c_promocion_f,Fecha fecha_compra, int precio ) {
		super(iD_course, titulo, descripcion, categoria, dificultad, fecha_i, fecha_f, precioHora, horasDias, fecha_compra, precio);
		this.f_cupon_ini = f_cupon_ini;
		this.f_c_promocion_f = f_c_promocion_f;
	}
	
	public IA (String ID_course) {
		super(ID_course);
	}
	
	public Fecha get_f_cupon_ini() {
		return this.f_cupon_ini;
	}
	
	public Fecha get_f_cupon_fin() {
		return this.f_c_promocion_f;
	}
	
	public Fecha set_f_cupon_ini(Fecha f_cupon_ini) {
		this.f_cupon_ini = f_cupon_ini;
		return this.f_cupon_ini;
	}
	
	public Fecha set_f_cupon_final(Fecha f_cupon_final) {
		this.f_c_promocion_f = f_cupon_final;
		return this.f_c_promocion_f;
	}

	public String toString() {
		return "ID_Course: " + get_ID_course() + "\n" +
				"titulo: " + get_titulo() + "\n" +
				"descripcion: " + get_descripcion() + "\n" +
				"categorio: " + get_dificultad() + "\n" +
				"precio: " + get_precio() + "€" + "\n" +
				"precioHoras: " + get_precioHora() + "€" + "\n" +
				"horasDias: " + get_horasDias() + "\n" +
				"fecha_i: " + get_fecha_i() + "\n" +
				"fecha_f: " + get_fecha_f() + "\n" +
				"fecha_compra: " + get_fecha_compra() + "\n" +
				"f_cupon_ini: " + this.get_f_cupon_ini() + "\n" +
				"f_cupon_fin: " + this.get_f_cupon_fin() + "\n";
	}
}
