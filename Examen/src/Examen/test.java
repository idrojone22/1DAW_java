package Examen;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		/*Dissenya una aplicació amb Java que acabarà quan l’usuari introduïsca un -5.
			Imprimirem la suma dels nº on la mitja dels seus dígits pars siga <= que 5.
		 */
		
		/*VARIABLES*/
		int num = 0;
		String cad_user = "";
		int suma = 0;
		int media = 0;
		int copia = 0;
		int digito = 0;
		int cont_digit = 0;
		int suma_copia = 0;
		int cont_coma = 0;
		String copia_copia = "";
		/*VARIABLES*/
		
		/*INTERRUPTOR*/
		boolean interruptor = false;
		/*INTERRUPTOR*/
		
		/*PRIMER BUCLE*/
		while (interruptor == false) {
			
			num = validadors.validar_int("Dame un num", "Num");
			
			if (num == -5) {
				interruptor = true;
			} else {
				
				/*IMPORTANT*/
				copia = num;
				/*IMPORTANT*/
				
				/*SEGUNDO BUCLE*/
				while (num > 0) {
					digito = num % 10;
					num = num / 10;
					if ((digito % 2) == 0) {
						cont_digit ++;
						suma = suma + digito;
					}
				} // end while
				/*SEGUNDO BUCLE*/
				
				if (cont_digit != 0) {
					media = suma / cont_digit;
				} else {
					media = 0;
				} // end if
				
				if (media <= 5) {
					suma_copia = suma_copia + copia;
					
					if (cont_coma == 0) {
						copia_copia = copia_copia + copia;
						cont_coma ++;
					} else {
						copia_copia = copia_copia + " + " +copia;
					} // end if 
				}  // end if
			} // end if
		} // end while
		/*PRIMER BUCLE*/
		
		/*CADENA*/
		cad_user = cad_user + copia_copia  + " = " + suma_copia + "\n";
		/*CADENA*/
		
		/* CADENA */
		JOptionPane.showMessageDialog(null, cad_user);
		/* CADENA */ 
			
	}

}
