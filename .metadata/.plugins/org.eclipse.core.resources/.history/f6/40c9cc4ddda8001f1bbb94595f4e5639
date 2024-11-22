package tema4_v10.modules.courses.classes;

import tema4_v10.classes.Fecha;

public class Desarrollo_web extends Cursos {

	/* ATRIBUTOS */
	private Fecha fecha_confirmacion_i;
	private Fecha fecha_confirmacion_f;
	private Fecha fecha_inscripcion_i;
	private Fecha fecha_inscripcion_f;
	/* ATRIBUTOS */

	/* CONSTRUCTOR */
	public Desarrollo_web(String iD_course, String titulo, String descripcion, String categoria, String dificultad,
			Fecha fecha_i, Fecha fecha_f,  int precioHora, int horasDias,Fecha fecha_confirmacion_i, Fecha fecha_confirmacion_f,
			Fecha fecha_inscripcion_i, Fecha fecha_inscripcion_f ,Fecha fecha_compra, int precio ) {
		super(iD_course, titulo, descripcion, categoria, dificultad,fecha_i, fecha_f,precioHora, horasDias, fecha_compra, precio);
		this.fecha_confirmacion_i = fecha_confirmacion_i;
		this.fecha_confirmacion_f = fecha_confirmacion_f;
		this.fecha_inscripcion_i = fecha_inscripcion_i;
		this.fecha_inscripcion_f = fecha_inscripcion_f;
	}
	
	/*CONSTRUCTOR DE CLAVE PRIMARIA*/
	public Desarrollo_web(String ID_course) {
		super(ID_course);
	}
	/*CONSTRUCTOR DE CLAVE PRIMARIA*/
	
	/* CONSTRUCTOR */

	/* GET */
	public Fecha get_fecha_confirmacion_i() {
		return this.fecha_confirmacion_i;
	}

	public Fecha get_fecha_confirmacion_f() {
		return this.fecha_confirmacion_f;
	}

	public Fecha get_fecha_inscripcion_i() {
		return this.fecha_inscripcion_i;
	}

	public Fecha get_fecha_inscripcion_f() {
		return this.fecha_inscripcion_f;
	}
	/* GET */

	/* SET */
	public Fecha set_fecha_confirmacion_i(Fecha fecha_confirmacion_i) {
		this.fecha_confirmacion_i = fecha_confirmacion_i;
		return fecha_confirmacion_i;
	}

	public Fecha set_fecha_confirmacion_f(Fecha fecha_confirmacion_f) {
		this.fecha_confirmacion_f = fecha_confirmacion_f;
		return fecha_confirmacion_f;
	}

	public Fecha set_fecha_inscripcion_i(Fecha fecha_inscripcion_i) {
		this.fecha_inscripcion_i = fecha_inscripcion_i;
		return fecha_inscripcion_i;
	}

	public Fecha set_fecha_inscripcion_f(Fecha fecha_inscripcion_f) {
		this.fecha_inscripcion_f = fecha_inscripcion_f;
		return fecha_inscripcion_f;
	}
	/* SET */

	/* TOSTRING */
	public String toString() {
		return "ID_Course: " + super.get_ID_course() + "\n" +
				"titulo: " + get_titulo() + "\n" +
				"descripcion: " + get_descripcion() + "\n" +
				"categoria: " + get_categoria() + "\n" +
				"dificultad: " + get_dificultad() + "\n" +
				"precio: " + get_precio() + "€" + "\n" +
				"precioHoras: " + get_precioHora() + "€" + "\n" +
				"horasDias: " + get_horasDias() + "\n" +
				"fecha_i: " + get_fecha_i() + "\n" +
				"fecha_f: " + get_fecha_f() + "\n" +
				"fecha_compra: " + this.get_fecha_compra() + "\n" +
				"fecha_confirmacion_i: " + this.get_fecha_confirmacion_i() + "\n" +
				"fecha_confirmacion_f: " + this.get_fecha_confirmacion_f() + "\n" +
				"fecha_inscripcion_i: " + this.get_fecha_inscripcion_i() + "\n" +
				"fecha_inscripcion_f: " + this.get_fecha_inscripcion_f();
	}
	/* TOSTRING */
}
