package tema4_v01;

import javax.swing.JOptionPane;

public class CRUD {

	/*CRUD*/
	
	/*CREATE (crear)*/
	public static Cursos create() {
		
		String ID_course = validadors.validar_string("Dame un String", "ID_course");
		String titulo = validadors.validar_string("Dame un String", "titulo");
		String descripcion = validadors.validar_string("Dame un String", "descripcion");
		String categoria = validadors.validar_string("Dame un String", "categoria");
		String dificultad = validadors.validar_string("Dame un String", "dificultad");
		int precio = validadors.validar_int("Dame num", "num");
		String fecha_i = validadors.validar_string("Dame un String", "fecha_i");
		String fecha_f = validadors.validar_string("Dame un String", "fecha_f");
		
		Cursos curso1 = new Cursos ( ID_course,  titulo,  descripcion,  categoria,   dificultad,  precio,  fecha_i,   fecha_f);
		
		return curso1;
	}
	/*CREATE (crear)*/
	
	/*READALL*/
	public static void  readall(Cursos curso) {
		if (curso != null) {
			JOptionPane.showMessageDialog(null, curso.toString());
		} else {
			JOptionPane.showMessageDialog(null, "No exsiste el objeto");
		}
	}
	/*READALL*/
	
	/*READONE*/
	public static void  readone(Cursos curso) {
		if (curso != null) {
			Object menu_readone = null;
			Object atributos[] = {"ID_course", "titulo", "descripcion", "categoria", "dificultad", "precio", "fecha_i", "fecha_f", "salir"};
			int salir = 0;
			
			do {
				menu_readone = menus.combos("Selecciona el atributo", "Selector de atributos", atributos, atributos[0]);
				
				switch(menu_readone.toString()) {
				case "ID_course":
					JOptionPane.showMessageDialog(null, curso.get_ID_course());
					break;
				case "titulo":
					JOptionPane.showMessageDialog(null, curso.get_titulo());
					break;
				case "descripcion":
					JOptionPane.showMessageDialog(null, curso.get_descripcion());
					break;
				case "categoria":
					JOptionPane.showMessageDialog(null, curso.get_categoria());
					break;
				case "dificultad":
					JOptionPane.showMessageDialog(null, curso.get_dificultad());
					break;
				case "precio":
					JOptionPane.showMessageDialog(null, curso.get_precio());
					break;
				case "fecha_i":
					JOptionPane.showMessageDialog(null, curso.get_fecha_i());
					break;
				case "fecha_f":
					JOptionPane.showMessageDialog(null, curso.get_fecha_f());
					break;
				case "salir":
					salir = 8;
					break;
				}
			}while( salir != 8);
		} else {
			JOptionPane.showMessageDialog(null, "No exsiste el objecto");
		}			
}
	/*READONE*/
	
	/*UPDATE*/
	public static Cursos update(Cursos curso) {
			if (curso != null) {
				Object menu_update = null;
				Object atributos[] = {"ID_course", "titulo", "descripcion", "categoria", "dificultad", "precio", "fecha_i", "fecha_f", "salir"};
				int salir = 0;
				
				do {
					menu_update = menus.combos("Selecciona el atributo", "Selector de atributos", atributos, atributos[0]);
					
					switch(menu_update.toString()) {
					case "ID_course":
						String ID_course = validadors.validar_string("Dame un String", "ID_course");
						curso.set_ID_course(ID_course);
						break;
					case "titulo":
						String titulo = validadors.validar_string("Dame un String", "titulo");
						curso.set_titulo(titulo);
						break;
					case "descripcion":
						String descripcion = validadors.validar_string("Dame un String", "descripcion");
						curso.set_descripcion(descripcion);
						break;
					case "categoria":
						String categoria = validadors.validar_string("Dame un String", "categoria");
						curso.set_categoria(categoria);
						break;
					case "dificultad":
						String dificultad = validadors.validar_string("Dame un String", "dificultad");
						curso.set_dificultad(dificultad);
						break;
					case "precio":
						int precio = validadors.validar_int("Dame un número", "num");
						curso.set_precio(precio);
						return curso;
					case "fecha_i":
						String fecha_i = validadors.validar_string("Dame un String", "fecha_i");
						curso.set_fecha_i(fecha_i);
						break;
					case "fecha_f":
						String fecha_f = validadors.validar_string("Dame un String", "fecha_f");
						curso.set_fecha_f(fecha_f);
						break;
					case "salir":
						salir = 0;
						break;
					}
				}while( salir != 8);
				return curso;
			} else {
				JOptionPane.showMessageDialog(null, "No exsiste el objecto");
				return null;
			}
	}
	/*UPDATE*/
	
	public static Cursos delete(Cursos curso) {
		if (curso != null) {
			curso = null;
			JOptionPane.showMessageDialog(null, "He borrado el objeto");
			return curso;
		} else {
			return curso;
		}
	}
}