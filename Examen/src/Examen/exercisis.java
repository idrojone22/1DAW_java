package Examen;

import javax.swing.JOptionPane;

public class exercisis {
	public static void Ex_01() {
		/*Dissenya una aplicació amb Java que acabarà quan l’usuari introduïsca n nums.
		Imprimir per a cada num, el major i menor dels seus dígits impars, i quin és el dígit impar major i quantes
		vegades es repeteix
	*/
	
	/*VARIABLES*/
	int num = 0;
	String cad_user = "";
	int copia = 0;
	int digito = 0;
	int mayor = 0;
	int menor = 0;
	int pivot = 0;
	int cont_mayor = 0;
	/*VARIABLES*/
	
	/*N*/
	int n = 0;
	/*N*/
	
	n = validadors.validar_int("¿Cuántas veces quieres que se repita?", " N");
	
	/*PRIMER BUCLE*/
	for (int i = 0; i < n;  i++) {
		num = validadors.validar_int("¿Qué número quieres?", "Num");
		
		/*IMPORTANTE DIGITOS*/
		copia = num;
		/*IMPORTANTE DIGITOS*/
		
		/*REINICIALIZACIÓN*/
		pivot = 0;
		mayor = 0;
		menor = 0;
		cont_mayor = 0;
		/*REINICIALIZACIÓN*/
		
		/*DIGITOS*/
		while (num > 0) {
			digito = num % 10;
			num = num / 10;
			
			 if ((digito % 2) != 0) {
				 
				 if (pivot == 0) {
					 mayor = 1;
					 menor = digito;
					 pivot ++;
				 } // end if (pivot)
				 
				if (digito == mayor) {
						cont_mayor ++;
				}// end if (cont_mayor)
				
				if (digito > mayor) {
					mayor = digito;
					cont_mayor = 0;
				} // end if (mayor)
				
				
				if (digito < menor) {
					menor = digito;
				} // end if (menor)
			 }// end if (impar)
		}
		/*DIGITOS*/
		
		/*CADENA*/
		cad_user = cad_user + "Del número " + copia + " los digitos impares mayores y menores son: " + mayor + " y " + menor + ". Y el digito mayor impar se repite: " + cont_mayor + "\n";
		/*CADENA*/
		
	}// end for
	/*PRIMER BUCLE*/
	
	/*CADENA*/
	JOptionPane.showMessageDialog(null, cad_user);
	/*CADENA*/
	}
	
	public static void Ex_02() {
		/*Dissenya una aplicació amb Java que acabarà quan l’usuari no desitge continuar (S/N).
		Imprimirem la suma dels nº que tinguen 3 divisors pars.
		*/

	/*VARIABLES*/
	String cad_user = "";
	int num = 0;
	int suma = 0;
	int cont_par = 0;
	String pars_digito = "";
	int cont_coma = 0;
	/*VARIABLES*/
	
	/*DESEA CONTINUAR*/
	int continuar = 0;
	/*DESEA CONTINUAR*/
	
	/*PRIMER BUCLE*/
	do {
		num = validadors.validar_int("Dame un num","num");
		/*REINICIALIZACION*/
		cont_par = 0;
		/*REINICIALIZACION*/
		for (int i = 1; i <= num; i++) {
			if ((num % i) == 0) {
				if ((i % 2) == 0) {
					cont_par++;
				} // end if
			} // end if
		} // end for
		
		if (cont_par == 4) {
			suma = suma + num;
			if (cont_coma == 0) {
				pars_digito = pars_digito + num;
				cont_coma++;
			} else {
				pars_digito = pars_digito + " + "+ num;
			} // end if
		} // end if 
		
		/*CONTINUAR*/
		  continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		/*CONTINUAR*/
	}while (continuar == JOptionPane.OK_OPTION);
	/*PRIMER BUCLE*/
	
	/*CADENA*/
	cad_user = cad_user + pars_digito  + " = " + suma + "\n";
	/*CADENA*/
	
	/* CADENA */
	JOptionPane.showMessageDialog(null, cad_user);
	/* CADENA */ 
	}
	
	public static void Ex_03() {
		/*Dissenya una aplicació amb Java que acabarà quan l’usuari introduïsca els 4 primers nums impars.
		Calcularem per a cada nº si la mitja dels seus divisors múltiplos de 3 es <= que 10 o no.
	*/
	
	/*VARIABLES*/
	int num = 0;
	String cad_user = "";
	int media = 0;
	int suma = 0;
	int cont_media = 0;
	/*VARIABLES*/
	
	/*CONTADOR*/
	int cont = 0;
	/*CONTADOR*/
	
	/*PRIMER BUCLE*/
	while (cont < 4) {
		num = validadors.validar_int("Dame un num", "num");
		
		/*REINICALIZACI	ÓN*/
		cont_media = 0;
		media = 0;
		suma = 0;
		/*REINICALIZACI	ÓN*/
		
		if ((num % 2) != 0) {
			cont ++;
			
			for (int i=1; i <= num; i++) {
				if ((num % i) == 0) {
					if ((i % 3) == 0) {
						cont_media ++;
						suma = suma + i;
					} // end if
				} // end if
			} // end for 
			
			if (cont_media != 0) {
				media = suma / cont_media;
			} else {
				media = 0;
			} // end if
			
			if (media <= 10) {
				cad_user = cad_user + "La media de " +  num + " es " +  media + " y es <= 10" + "\n";
			} else {
				cad_user = cad_user + "La media de " +  num + " es " +  media + " y es > 10" + "\n";
			} // end if
		} // end if
		
	}  // end while
	/*PRIMER BUCLE*/
	
	/* CADENA */
	JOptionPane.showMessageDialog(null, cad_user);
	/* CADENA */
	}

	public static void Ex_04() {
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
