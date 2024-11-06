package tema4_v3;

public class Desplegamiento_web extends Cursos {

	/*ATRIBUTOS*/
	private String fecha_ultimas_plazas_i;
	private String fecha_ultimas_plazas_f;
	/*ATRIBUTOS*/
	
	/*CONSTRUCTOR*/
	public Desplegamiento_web(String iD_course, String titulo, String descripcion, String categoria, String dificultad,
			int precio, String fecha_i, String fecha_f, String fecha_ultimas_plazas_i, String fecha_ultimas_plazas_f) {
		super(iD_course, titulo, descripcion, categoria, dificultad, precio, fecha_i, fecha_f);
		this.fecha_ultimas_plazas_i = fecha_ultimas_plazas_i;
		this.fecha_ultimas_plazas_f = fecha_ultimas_plazas_f;
	}
	/*CONSTRUCTOR*/

	public String get_fecha_ultimas_plazas_i() {
		return fecha_ultimas_plazas_i;
	}

	public String get_fecha_ultimas_plazas_f() {
		return fecha_ultimas_plazas_f;
	}

	
	public String set_fecha_ultimas_plazas_i(String fecha_ultimas_plazas_i) {
		this.fecha_ultimas_plazas_i = fecha_ultimas_plazas_i;
		return this.fecha_ultimas_plazas_i;
	}
	
	public String set_fecha_ultimas_plazas_f(String fecha_ultimas_plazas_f) {
		this.fecha_ultimas_plazas_f = fecha_ultimas_plazas_f;
		return this.fecha_ultimas_plazas_f;
	}
	
	/*TOSTRING*/	
	public String toString() { 
		return "ID_Course: " + get_ID_course() + "\n" +
						"titulo: " + get_titulo() + "\n" +
						"descripcion: " + get_descripcion() + "\n" +
						"categorio: " + get_dificultad() + "\n" +
						"precio: " + get_precio() + "\n" +
						"fecha_i: " + get_fecha_i() + "\n" +
						"fecha_f: " + get_fecha_f() + "\n" +
						"fecha_ultimas_plazas_i: " + this.get_fecha_ultimas_plazas_i() + "\n" +
						"fecha_ultimas_plazas_f: " + this.get_fecha_ultimas_plazas_i();
	}
	/*TOSTRING*/
}
