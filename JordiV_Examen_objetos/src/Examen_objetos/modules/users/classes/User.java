package Examen_objetos.modules.users.classes;

import Examen_objetos.classes.Fecha;

public abstract class User {
    /*ATRIBUTOS */
    private String username;
    private String password;
    private String email;
    private Fecha fecha_nacimiento;
    private int edad;
    /*ATRIBUTOS */

    /* MÉTODOS */

    /* CONSTRUCTOR */
    public User(String username, String password, String email, Fecha fecha_nacimiento, int edad) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
    }
    /* CONSTRUCTOR */

    /*CONSTRUCTOR DE CLAVE PRIMARIA*/
    public User(String username) {
        this.username = username;
    }
    /*CONSTRUCTOR DE CLAVE PRIMARIA*/

    /* GET */
    public String get_username() {
        return this.username;
    }

    public String get_password() {
        return this.password;
    }

    public String get_email() {
        return this.email;
    }

    public Fecha get_fecha_nacimiento() {
        return this.fecha_nacimiento;
    }

    public int get_edad() {
        return this.edad;
    }
    /* GET */

    /* SET */
    public String set_username(String username) {
        this.username = username;
        return this.username;
    }

    public String set_password(String password) {
        this.password = password;
        return this.password;
    }

    public String set_email(String email) {
        this.email = email;
        return this.email;
    }

    public Fecha set_fecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
        return this.fecha_nacimiento;
    }

    public int set_edad(int edad) {
        this.edad = edad;
        return this.edad;
    }
    /* SET */

    /*EQUALS*/
    public boolean equals (Object object) {
        return 	get_username().equals(((User)object).get_username());
    }
    /*EQUALS*/

    /* TOSTRING */
    public abstract String toString();
    /* TOSTRING */
    
     /* MÉTODOS */

}

