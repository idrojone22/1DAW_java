package Examen;
import javax.swing.JOptionPane;
public class doble_bucle {
public static void digitos(int num)  {
		
		int copia = 0;
		int digito = 0;
		
		/*IMPORTANT*/
		copia = num;
		/*IMPORTANT*/
		
		/*SEGUNDO BUCLE	*/
		while (num > 0) {
			digito = num % 10;
			num = num / 10;
			JOptionPane.showMessageDialog(null, "Los digitos de " + copia + " son " + digito);
		}
		/*SEGUNDO BUCLE	*/
	}
	
	public static void divisors(int num) {
		
		// en caso de que sea n nums ( i -> j)
		
		/*
		 * for (int j = 1; j  <= num; j++) {
			if ((num % j) == 0) {
				JOptionPane.showMessageDialog(null, "Divisores de " + num + " son " + j);
			} // END IF
		} // END WHILE
		 */
		
		/*SEGON BUCLE*/
		for (int i = 1; i  <= num; i++) {
			if ((num % i) == 0) {
				JOptionPane.showMessageDialog(null, "Divisores de " + num + " son " + i);
			} // END IF
		} // END WHILE
		/*SEGON BUCLE*/
	}
}
