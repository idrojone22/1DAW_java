package Examen_objetos.modules.users.classes;

import Examen_objetos.classes.Fecha;

public class Vip extends User{
	private Fecha f_compra_ini;
	private Fecha f_compra_fin;
	private int compra;
	
	public Vip(String username, String password, String email , Fecha fecha_nacimiento,  int edad,  Fecha f_compra_ini, Fecha f_compra_fin, int compra ) {
		 super(username, password, email, fecha_nacimiento, edad);
		 this.f_compra_ini = f_compra_ini;
		 this.f_compra_fin = f_compra_fin;
		 this.compra = compra;
	}
	
	public Vip(String username) {
		 super(username);
	 }
	
	public Fecha get_f_compra_ini() {
		return this.f_compra_ini;
	}
	
	public Fecha get_f_compra_fin() {
		return this.f_compra_fin;
	}
	
	public int get_compra() {
		return  this.compra;
	}
	
	public Fecha set_f_compra_ini(Fecha f_compra_ini) {
		this.f_compra_ini = f_compra_ini;
		return this.f_compra_ini;
	}
	
	public int set_compra(int compra) {
		this.compra = compra;
		return this.compra;
	}
	
	public Fecha set_f_compra_fin(Fecha f_compra_fin) {
		this.f_compra_fin = f_compra_fin;
		return this.f_compra_fin;
	}
	
	 public String toString() {
	        return "username: " + super.get_username() + "\n" +
	                    "password: " + super.get_password() + "\n" +
	                    "email: " + super.get_email() + "\n" +
	                    "fecha_nacimiento: "  + super.get_fecha_nacimiento() + "\n" +
	                    "edad: "  + super.get_edad() + "\n" +
	                   "f_compra_ini: " + this.get_f_compra_ini() + "\n" +
	                    "f_compra_fin" + this.get_f_compra_fin() + "\n" + 
	                    "compra" + this.get_compra();
	    }
}

