package tema4_v1;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		
		/*String ID_course = validadors.validar_string();
		String titulo = validadors.validar_string();
		String descripcion = validadors.validar_string();
		String categoria = validadors.validar_string();
		String dificultad = validadors.validar_string();
		int precio = validadors.validar_int("Dame num", "num");
		String fecha_i = validadors.validar_string();
		String fecha_f = validadors.validar_string();
		
		cursos curso1 = new cursos ( ID_course,  titulo,  descripcion,  categoria,   dificultad,  precio,  fecha_i,   fecha_f);
	
		JOptionPane.showMessageDialog(null, "Hola" + curso1.get_fecha_i());
		fecha_i = validadors.validar_string();
		curso1.set_fecha_i(fecha_i);
		JOptionPane.showMessageDialog(null, "Hola" + curso1.get_fecha_i());
		
	*/
		
		Cursos curso1 = null;
		curso1 = CRUD.create();
		CRUD.readall(curso1);
		curso1 = CRUD.update(curso1);
		CRUD.readall(curso1);
		curso1 = CRUD.delete(curso1);
		CRUD.readall(curso1);
	}
}
