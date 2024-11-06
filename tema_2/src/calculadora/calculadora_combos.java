package calculadora;

import javax.swing.JOptionPane;

import calculadora.mejora.validar;

public class calculadora_combos {

	public static void main(String[] args) {
		
		/* VARIABLES */
		int operacion = 0;
		int num1 = 0;
		int salir = 0;
		int num2 = 0;
		/* VARIABLES */
		Object seleccion1 = null;
		
		do {
			
			seleccion1 = JOptionPane.showInputDialog(null, "Selecciona una vocal", "Selector de opciones",
					JOptionPane.QUESTION_MESSAGE, null, // null para icono defecto
					new Object[] { "suma", "resta", "multiplicación", "división", "salir" }, "suma");
			
			switch (seleccion1.toString()) {
			case "suma":
				
				num1 = validar.validar_int("Escribe un num1", "Num int");
				num2 = validar.validar_int("Escribe un num2", "Num int");
				
				/* SUMA */
				operacion = num1 + num2;
				/* SUMA */
				
				JOptionPane.showMessageDialog(null, "La suma es: " + operacion);
				break;
			case "resta":
				
				num1 = validar.validar_int("Escribe un num1", "Num int");
				num2 = validar.validar_int("Escribe un num2", "Num int");
				
				/* RESTA */
				operacion = num1 - num2;
				/* RESTA */
				
				JOptionPane.showMessageDialog(null, "La resta es: " + operacion);
				break;
			case "multiplicación":
				
				num1 = validar.validar_int("Escribe un num1", "Num int");
				num2 = validar.validar_int("Escribe un num2", "Num int");
				
				/* MULTIPLICACIÓN */
				operacion = num1 * num2;
				/* MULTIPLICACIÓN */
				
				JOptionPane.showMessageDialog(null, "La multiplicación  es: " + operacion);
				break;
			case "división":
				
				num1 = validar.validar_int("Escribe un num1", "Num int");
				num2 = validar.validar_int("Escribe un num2", "Num int");
				
				if (num1 != 0 && num2 != 0) {
					/* DIVISION */
					operacion = num1 / num2;
					/* DIVISION */
					JOptionPane.showMessageDialog(null, "La división es: " + operacion);
				} else {
					JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
				} // END IF
				break;
			case "salir":
				salir = 4;
				break;
			default:
				JOptionPane.showMessageDialog(null, "No has elegido ninguna de las anteirores opciones");
			}//END CASE
		}while(salir != 4);
	}
}