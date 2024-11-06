package tema4_v2;

public class Diseno_web extends Cursos{
	
	/*ATRIBUTOS*/
	private String f_c_promocion_i;
	private String f_c_promocion_f;
	/*ATRIBUTOS*/

	/*CONSTRUCTOR*/
	public Diseno_web(String iD_course, String titulo, String descripcion, String categoria, String dificultad, int precio, String fecha_i, String fecha_f, String f_c_promocion_i, String f_c_promocion_f) {
		super(iD_course, titulo, descripcion, categoria, dificultad, precio, fecha_i, fecha_f);
		this.f_c_promocion_i = f_c_promocion_i;
		this.f_c_promocion_f = f_c_promocion_f;
		
	}
	/*CONSTRUCTOR*/

	/*GET*/
	public String get_f_c_promocion_i() {
		return this.f_c_promocion_i;
	}
	
	public String get_f_c_promocion_f() {
		return this.f_c_promocion_f;
	}
	/*GET*/
	
	/*SET*/
	public String set_f_c_promocion_i(String  f_c_promocion_i) {
		this.f_c_promocion_i =  f_c_promocion_i;
		return this.f_c_promocion_i;
	}
	
	public String set_f_c_promocion_f(String  f_c_promocion_f) {
		this.f_c_promocion_f =  f_c_promocion_f;
		return this.f_c_promocion_f;
	}
	/*SET*/
	
	/*TOSTRING*/	
	public String toString() { 
		return "ID_Course: " + get_ID_course() + "\n" +
						"titulo: " + get_titulo() + "\n" +
						"descripcion: " + get_descripcion() + "\n" +
						"categorio: " + get_dificultad() + "\n" +
						"precio: " + get_precio() + "\n" +
						"fecha_i: " + get_fecha_i() + "\n" +
						"fecha_f: " + get_fecha_f() + "\n" +
						"f_c_promocion_i: " + this.get_f_c_promocion_i() + "\n" +
						"f_c_promocion_f: " + this.get_f_c_promocion_f();
	}
	/*TOSTRING*/
	
}
