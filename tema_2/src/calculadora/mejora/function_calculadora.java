package calculadora.mejora;

import javax.swing.JOptionPane;

public class function_calculadora {
	
	public static void suma() {
		
		int num1 = 0;
		int num2= 0;
		int operacion = 0;
		
		num1 = validar.validar_int("Escribe un num1", "Num int");
		num2 = validar.validar_int("Escribe un num2", "Num int");
		
		operacion = num1 + num2;
		JOptionPane.showMessageDialog(null, "La suma es: " + operacion);
		
	}
	
	public static void resta() {
		
		int num1 = 0;
		int num2= 0;
		int operacion = 0;
		
		num1 = validar.validar_int("Escribe un num1", "Num int");
		num2 = validar.validar_int("Escribe un num2", "Num int");
		
		operacion = num1 - num2;
		JOptionPane.showMessageDialog(null, "La resta es: " + operacion);
		
	}
	
	public static void multiplicacion() {
		
		int num1 = 0;
		int num2= 0;
		int operacion = 0;
		
		num1 = validar.validar_int("Escribe un num1", "Num int");
		num2 = validar.validar_int("Escribe un num2", "Num int");
		
		 operacion = num1 * num2;
		JOptionPane.showMessageDialog(null, "La multiplicación es: " + operacion);
		
	}
	
	public static void division() {
		
		int num1 = 0;
		int num2= 0;
		int operacion = 0;
		
		num1 = validar.validar_int("Escribe un num1", "Num int");
		num2 = validar.validar_int("Escribe un num2", "Num int");
		
		if (num1 != 0 && num2 != 0) {
			operacion = num1 / num2;
			JOptionPane.showMessageDialog(null, "La división es: " + operacion);
		} else {
			JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
		} // END IF
		
	}
	
	public static void digitos() {
		
		int num = 0;
		int digito = 0;
		int copia = 0;
		String num_digito = "";
		
		num = validar.validar_int("Escribe un num1", "Num int");
		copia = num;
		while (num > 0) {
			digito = num % 10;
			num = num / 10;
			num_digito = num_digito + digito + " ";
		} // END WHILE
		JOptionPane.showMessageDialog(null, "Los digitos de " + copia + " son " + num_digito);
	}
	
	public static void divisors() {

		int num = 0;
		String num_div = "";
		num = validar.validar_int("Escribe un num1", "Num int");
		
		for (int i = 1; i <= num; i++) {
			if ((num % i) == 0) {
				num_div = num_div + i + " ";
			}
		} // END FOR
		JOptionPane.showMessageDialog(null, "Divisores de " + num + " son " + num_div);
	}
}