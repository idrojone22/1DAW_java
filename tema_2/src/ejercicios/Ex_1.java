package ejercicios;
import javax.swing.JOptionPane;

import calculadora.mejora.validar;
public class Ex_1 {

	public static void main(String[] args) {
		/*
		 * " Pijades"
		 *  i, j ...
		 *   media (si no hay nada dividiriamos entre 0 necesitamos  )
		 * */
		
		/*n nums, la mitja dels números que tinguen dos divisors impars*/
		
		int n = 0;
		int num = 0;
		int cont = 0;
		int cont_num = 0;
		int suma = 0;
		int media = 0;
		
		n = validar.validar_int("¿Cuántas veces quieres repetir?", "N");
		
		/*PRIMER BUCLE*/
		for (int i = 0; i < n; i++) {
			num = validar.validar_int("Dame un número", "Número");
			
			/*REINICIALIZACIÓN*/
			cont = 0;
			/*REINICIALIZACIÓN*/
			
			/*SEGON BUCLE*/
			for (int j  = 1 ;  j  <= num;  j++) {
				if ((num % j) == 0) {
					if (( j % 2) != 0) {
						cont ++;
					}// END IF 
				}// END IF
			}// END FOR
			/*SEGON BUCLE*/
			
			if (cont == 2) {
				cont_num++;
				suma = suma +  num;
			}// END IF
			
			if (cont_num != 0 ){
				media = suma / cont_num;
			} else {
				 media = 0;
			} // END IF
		} // END FOR
		/*PRIMER BUCLE*/
		JOptionPane.showMessageDialog(null, "La media de los números con dos digitos impares  es: " + media);
	}
}