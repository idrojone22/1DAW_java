package tema4_v9.modules.courses.classes;

import tema4_v9.classes.Fecha;

public class Desplegamiento_web extends Cursos {

	/* ATRIBUTOS */
	private Fecha fecha_ultimas_plazas_i;
	private Fecha fecha_ultimas_plazas_f;
	/* ATRIBUTOS */

	/* CONSTRUCTOR */
	public Desplegamiento_web(String iD_course, String titulo, String descripcion, String categoria, String dificultad,
			Fecha fecha_i, Fecha fecha_f,  int precioHora, int horasDias,Fecha fecha_ultimas_plazas_i, Fecha fecha_ultimas_plazas_f,
			Fecha fecha_compra, int precio ) {
		super(iD_course, titulo, descripcion, categoria, dificultad,fecha_i, fecha_f,precioHora, horasDias, fecha_compra, precio);
		this.fecha_ultimas_plazas_i = fecha_ultimas_plazas_i;
		this.fecha_ultimas_plazas_f = fecha_ultimas_plazas_f;
	}
	
	/*CONSTRUCTOR DE CLAVE PRIMARIA*/
	public Desplegamiento_web(String ID_course) {
		super(ID_course);
	}
	/*CONSTRUCTOR DE CLAVE PRIMARIA*/
	/* CONSTRUCTOR */

	public Fecha get_fecha_ultimas_plazas_i() {
		return fecha_ultimas_plazas_i;
	}

	public Fecha get_fecha_ultimas_plazas_f() {
		return fecha_ultimas_plazas_f;
	}

	public Fecha set_fecha_ultimas_plazas_i(Fecha fecha_ultimas_plazas_i) {
		this.fecha_ultimas_plazas_i = fecha_ultimas_plazas_i;
		return this.fecha_ultimas_plazas_i;
	}

	public Fecha set_fecha_ultimas_plazas_f(Fecha fecha_ultimas_plazas_f) {
		this.fecha_ultimas_plazas_f = fecha_ultimas_plazas_f;
		return this.fecha_ultimas_plazas_f;
	}

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
				"fecha_ultimas_plazas_i: " + this.get_fecha_ultimas_plazas_i() + "\n" +
				"fecha_ultimas_plazas_f: " + this.get_fecha_ultimas_plazas_f();
	}
	/* TOSTRING */
}
