package Examen_objetos.modules.users.classes;

import Examen_objetos.classes.Fecha;

public class Client  extends User {

    /* ATRIBUTOS */
    private Fecha fecha_registro;
    private boolean log;
    /* ATRIBUTOS */

    /* CONSTRUCTOR */
    public Client(String username, String password, String email , Fecha fecha_nacimiento,  int edad,  boolean log, Fecha fecha_registro) {
        super(username, password, email, fecha_nacimiento, edad);
        this.fecha_registro = fecha_registro;
        this.log = log;
    }
    
    public Client(String username) {
		super(username);
	}
    /* CONSTRUCTOR */

    /* GET */
    public boolean get_log() {
        return this.log;
    }

    public Fecha get_fecha_registro() {
        return this.fecha_registro;
    }
    /* GET */

    /* SET */
    public boolean set_log(boolean log) {
        this.log = log;
        return this.log;
    }

    public Fecha set_fecha_registro(Fecha fecha_registro) {
        this.fecha_registro = fecha_registro;
        return this.fecha_registro;
    }
    /* SET */

    /* TOSTRING */
    public String toString() {
        return "username: " + super.get_username() + "\n" +
                    "password: " + super.get_password() + "\n" +
                    "email: " + super.get_email() + "\n" +
                    "fecha_nacimiento: "  + super.get_fecha_nacimiento() + "\n" +
                    "edad: "  + super.get_edad() + "\n" +
                    "log: "  + this.log + "\n" +
                    "fecha_registro: "  + this.fecha_registro + "\n";
    }
    /* TOSTRING */
}
