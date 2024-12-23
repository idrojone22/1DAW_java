package Examen_objetos.modules.cursos.classes;

import Examen_objetos.classes.Fecha;

public class Diseno_web extends Cursos {

	/* ATRIBUTOS */
	private Fecha f_c_promocion_i;
	private Fecha f_c_promocion_f;
	/* ATRIBUTOS */

	/* CONSTRUCTOR */
	public Diseno_web(String iD_course, String titulo, String descripcion, String categoria, String dificultad,
			Fecha fecha_i, Fecha fecha_f, int precioHora, int horasDias, Fecha f_c_promocion_i, Fecha f_c_promocion_f, Fecha fecha_compra, int precio ) {
		super(iD_course, titulo, descripcion, categoria, dificultad, fecha_i, fecha_f, precioHora, horasDias, fecha_compra, precio);
		this.f_c_promocion_i = f_c_promocion_i;
		this.f_c_promocion_f = f_c_promocion_f;

	}
	
	/*CONSTRUCTOR DE CLAVE PRIMARIA*/
	public Diseno_web(String ID_course) {
		super(ID_course);
	}
	/*CONSTRUCTOR DE CLAVE PRIMARIA*/
	
	/* CONSTRUCTOR */

	/* GET */
	public Fecha get_f_c_promocion_i() {
		return this.f_c_promocion_i;
	}

	public Fecha get_f_c_promocion_f() {
		return this.f_c_promocion_f;
	}
	/* GET */

	/* SET */
	public Fecha set_f_c_promocion_i(Fecha f_c_promocion_i) {
		this.f_c_promocion_i = f_c_promocion_i;
		return this.f_c_promocion_i;
	}

	public Fecha set_f_c_promocion_f(Fecha f_c_promocion_f) {
		this.f_c_promocion_f = f_c_promocion_f;
		return this.f_c_promocion_f;
	}
	/* SET */

	/* TOSTRING */
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
				"f_c_promocion_i: " + this.get_f_c_promocion_i() + "\n" +
				"f_c_promocion_f: " + this.get_f_c_promocion_f();
	}
	/* TOSTRING */

}
