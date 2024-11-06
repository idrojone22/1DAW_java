package Framework;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		/*Dissenya una aplicació amb Java que acabarà quan l’usuari introduïsca els 4 primers nums pars.
		Calcularem per a cada nº si la mitja dels seus divisors pars es <= que 10 o no.*/
		
		/*VARIABLES*/
		int num = 0;
		String cad_user = "";
		int suma = 0;
		int media = 0;
		int cont_media = 0;
		/*VARIABLES*/
		
		/*CONTADOR*/
		int cont = 0;
		/*CONTADOR*/
		
		/*PRIMER BUCLE*/
		while (cont < 4) {
			
			num = validadors.validar_int("Escribe un num", "NUM");
			
			/*REINICALIZACI	ÓN*/
			cont_media = 0;
			media = 0;
			suma = 0;
			/*REINICALIZACI	ÓN*/
			
			if ((num % 2) == 0) {
				cont ++;
			}
			
			/*SEGON BUCLE (DIGITOS)*/
			for (int i = 1; i <= num; i++) {
				if ((num % i) == 0) {
					if (i % 2 == 0 ) {
						cont_media ++;
						suma = suma + i;
					} // end if
				} // end if 
			} // end for
			/*SEGON BUCLE (DIGITOS*/
			
			media = suma / cont_media;
			
			if (media > 10) {
				cad_user = cad_user + "num=" + num + " -> media=" +  media + " es > 10" + "\n";
			} else {
				cad_user = cad_user + "num=" + num + " -> mediaa=" +  media + " es <= 10"  + "\n";
			} // end if 
		}
		/*PRIMER BUCLE*/
		
		/* CADENA */
		JOptionPane.showMessageDialog(null, cad_user);
		/* CADENA */
		
	}
}