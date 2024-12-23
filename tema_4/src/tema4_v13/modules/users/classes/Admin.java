package tema4_v13.modules.users.classes;

import tema4_v13.classes.Fecha;

public class Admin  extends User{
    
    /* ATRIBUTOS */
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private Fecha fecha_alta;
    private int sueldo;
    /* ATRIBUTOS */

    /* CONSTRUCTOR */
    public Admin(String username, String password, String email , Fecha fecha_nacimiento,  int edad,  String nombre, String apellidos, String telefono, Fecha fecha_alta, int sueldo) {
        super(username, password, email, fecha_nacimiento, edad);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fecha_alta = fecha_alta;
        this.sueldo = sueldo; 
    }
    
    public Admin(String username) {
		super(username);
	}
    /* CONSTRUCTOR */

    /* GET */
    public String get_nombre() {
        return this.nombre;
    }

    public String get_apellidos() {
        return this.apellidos;
    }
    
    public String get_telefono() {
        return this.telefono;
    }

    public Fecha get_fecha_alta() {
        return this.fecha_alta;
    }

    public int get_sueldo() {
        return this.sueldo;
    }
    /* GET */

    /* SET */
    public String set_nombre(String nombre) {
        this.nombre = nombre;
        return this.nombre;
    }

    public String set_apellidos(String apellidos) {
        this.apellidos = apellidos;
        return this.apellidos;
    }

    public String set_dni(String dni) {
        this.dni = dni;
        return this.dni;
    }

    public String set_telefono(String telefono) {
        this.telefono = telefono;
        return this.telefono;
    }

    public Fecha set_fecha_alta(Fecha fecha_alta) {
        this.fecha_alta = fecha_alta;
        return this.fecha_alta;
    }

    public int set_sueldo(int sueldo) {
        this.sueldo = sueldo;
        return this.sueldo;
    }
    /* SET */

    /* TOSTRING */
    public String toString() {
        return "username: " + super.get_username() + "\n" +
                    "password: " + super.get_password() + "\n" +
                    "email: " + super.get_email() + "\n" +
                    "fecha_nacimiento: "  + super.get_fecha_nacimiento() + "\n" +
                    "edad: "  + super.get_edad() + "\n" +
                    "nombre: "  + get_nombre() + "\n" +
                    "apellidos: "  + get_apellidos() + "\n" +
                    "telefono: "  + get_telefono() + "\n" +
                    "fecha_alta: "  + get_fecha_alta() + "\n" +
                    "sueldo: "  + get_sueldo() + "\n";
    }
    /* TOSTRING */
}
