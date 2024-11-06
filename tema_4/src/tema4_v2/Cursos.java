package tema4_v2;

public abstract class Cursos {
	 /*ATRIBUTOS*/
	private String ID_course;
	 private String titulo;
	 private String descripcion;
	 private String categoria;
	 private String dificultad;
	 private int precio;
	 private String fecha_i;
	 private String fecha_f;
	 /*ATRIBUTOS*/
	 
	 /*MÉTPDPS*/
	 
	/*CONSTRUCTOR*/
	public Cursos(String iD_course, String titulo, String descripcion, String categoria, String dificultad, int precio, String fecha_i, String fecha_f) {
		ID_course = iD_course;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.dificultad = dificultad;
		this.precio = precio;
		this.fecha_i = fecha_i;
		this.fecha_f = fecha_f;
	}
	/*CONSTRUCTOR*/
	
	/*GET*/
	String get_ID_course() {
		return this.ID_course;
	}
	String get_titulo() {
		return this.titulo;
	}
	String get_descripcion() {
		return this.descripcion;
	}
	String get_categoria() {
		return this.categoria;
	}
	String get_dificultad() {
		return this.dificultad;
	}
	int get_precio() {
		return this.precio;
	}
	String get_fecha_i() {
		return this.fecha_i;
	}
	String get_fecha_f() {
		return this.fecha_f;
	}
	/*GET*/
	
	/*SET*/
	public String  set_ID_course(String ID_course) {
	    this.ID_course = ID_course;
	    return ID_course;
	}
	public String set_titulo(String titulo) {
	    this.titulo = titulo;
	    return titulo;
	}
	public String set_descripcion(String descripcion) {
	    this.descripcion = descripcion;
	    return descripcion;
	}
	public String set_categoria(String categoria) {
	    this.categoria = categoria;
	    return categoria;
	}
	public String set_dificultad(String dificultad) {
	    this.dificultad = dificultad;
	    return dificultad;
	}
	public int set_precio(int precio) {
	    this.precio = precio;
	    return precio;
	}
	public String set_fecha_i(String fecha_i) {
	    this.fecha_i = fecha_i;
	    return fecha_i;
	}
	public String set_fecha_f(String fecha_f) {
	    this.fecha_f = fecha_f;
	    return fecha_f;
	}
	/*SET*/
	
	/*TOSTRING*/
	 public abstract String toString();
	/*TOSTRING*/
	 
}