package Framework;

import javax.swing.JOptionPane;

public class ex {
	public static int n_nums_media_nums_divisorsimpars() {
		
		int n = 0;
		int num = 0;
		int cont = 0;
		int cont_num = 0;
		int suma = 0;
		int media = 0;
		
		n = validadors.validar_int("¿Cuántas veces quieres repetir?", "N");
		
		/*PRIMER BUCLE*/
		for (int i = 0; i < n; i++) {
			num = validadors.validar_int("Dame un número", "Número");
			
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
				//suma = suma +  num;
				suma = operaciones.suma_dos_num(suma, num);
			}// END IF
			
			if (cont_num != 0 ){
				//media = suma / cont_num;
				media = operaciones.media(suma, cont_num);
			} else {
				 media = 0;
			} // END IF
		}// END FOR
		/*PRIMER BUCLE*/
		return media;
		//JOptionPane.showMessageDialog(null, "La media de los números con dos divisares  impares  es: " + media);
	}
	
	public static int n_nums_media_digitos() {
		int media = 0;
		int n = 0;
		int num = 0;
		int cont = 0;
		int suma = 0;
		
		n = validadors.validar_int("¿Cuántas veces quieres repetir?", "N");
		
		/*PRIMER BUCLE*/
		for (int i = 0; i < n; i++) {
			num = validadors.validar_int("Dame un número", "Número");
			
			/*SEGON BUCLE*/
			for (int j = 1; j <= num; j++) {
				if((num % j) == 0) {
					if ((j % 2) != 0) {
						cont ++;
						//JOptionPane.showMessageDialog(null, j);
						suma = operaciones.suma_dos_num(suma, j);
						//suma = suma + j;
					} // END IF DIVISORS IMPARS
				} // END IF DIVISORS	
			} // END FOR
			/*SEGON BUCLE*/
			if (cont != 0) {
				//media =  suma / cont;
				media = operaciones.media(suma, cont);
			} else {
				media = 0;
			} // END IF
			
		}// END FOR
		/*PRIMER BUCLE*/
		
		//JOptionPane.showMessageDialog(null, "La media de los divisores  impares  es: " + media);
		
		return media;
	}
	
	public static void deseacont_digito_mayor_decadanum__repite()  {
		/*VARIABLES*/
		String cad_user = "";
		int num = 0;
		int copia = 0;
		int digito = 0;
		int mayor = 0;
		int cont = 0;
		/*VARIABLES*/
		
		/*DESEAS CONTINUAR*/
		int continuar = 0;
		/*DESEAS CONTINUAR*/
		
		/*PRIMER BUCLE*/
		do {
			
			num = validadors.validar_int("Dame un número", "Número");
			
			/*IMPORTANT DIGITOS*/
			copia = num;
			/*IMPORTANT DIGITOS*/
			
			/*REINICIALIZACION*/
			cont = 0;
			mayor = 0;
			/*REINICIALIZACION*/
			
			/*DIGITOS*/
			while (num > 0) {
				digito = num % 10;
				num = num / 10;
				
				if (digito == mayor) {
					cont ++;
				} // END IF
				
				if ( digito > mayor) {
					mayor = digito;
					cont = 0;
				}// END IF
			} // END WHILE
			/*DIGITOS*/
			
			/*CADENA*/
			cad_user = cad_user + "El digito mayor de " + copia + " es " + mayor + " y se repite " + cont + " veces"  + "\n";
			/*CADENA*/
			
			/*IMPORTANT DESEA CONTINUAR*/
			continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
			/*IMPORTANT DESEA CONTINUAR*/
		}while(continuar == JOptionPane.OK_OPTION);
		/*PRIMER BUCLE*/
		
		/*CADENA*/
		JOptionPane.showMessageDialog(null, cad_user);
		/*CADENA*/
	}
	
	public static void deseacont_digito_mayor__repite() {
		/*VARIABLES*/
		String cad_user = "";
		int num = 0;
		int copia = 0;
		int digito = 0;
		int mayor = 0;
		int cont = 0;
		/*VARIABLES*/
		
		/*DESEA CONTINUAR*/
		int continuar = 0;
		/*DESEA CONTINUAR*/
		
		do {
			num = validadors.validar_int("Dame un número", "Número");
			
			/*IMPORTANT DIGITOS*/
			copia = num;
			/*IMPORTANT DIGITOS*/
			
			/*DIGITOS*/
			while (num > 0) {
				digito = num % 10;
				num = num / 10;
				
				if (digito == mayor) {
					cont ++;
				} // END IF
				
				if (digito > mayor) {
					mayor = digito;
					cont = 0;
				} // END IF
			} // END WHILE
			/*DIGITOS*/
			
			/*IMPORTANT DESEA CONTINUAR*/
			continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
			/*IMPORTANT DESEA CONTINUAR*/
		}while(continuar == JOptionPane.OK_OPTION);
		
		/*CADENA*/
		cad_user = "El digito mayor de todos los números es: " + mayor + " y se repite " + cont;
		/*CADENA*/
		
		/*CADENA*/
		JOptionPane.showMessageDialog(null, cad_user);
		/*CADENA*/
	}
	
	public static void primers_5_num_sumar_els_que_tinguen_2_digitos_pars() {
	//  primers 5 números pars sumar els números que tinguen dos dígitos pars
		
			/*VARIABLES*/
			int num = 0;
			int digito = 0;
			String cad_user = "";
			int cont_par = 0;
			int suma = 0;
			int copia = 0;
			String num_par_suma = "";
			/*VARIABLES*/
			
			/*CONTADOR*/
			int cont = 0;
			/*CONTADOR*/
			
			/*5 PRIMERS NUMS*/
			while (cont < 5) {
				
				num = validadors.validar_int("Dame un número", "Número");
				
				/*PARS*/
				if ((num % 2) == 0) {
					
					/*IMPORTANT BUCLE*/
					cont ++;
					/*IMPORTANT BUCLE*/
					
					 /*IMPROTANT*/
					copia = num;
					 /*IMPROTANT*/
					
					/*REINICIALIZACION*/
					digito = num;
					cont_par = 0;
					/*REINICIALIZACION*/
					
					/*DIGITOS*/
					while(num > 0) {
						digito = num % 10;
						num = num / 10;
						
						if ((digito % 2) == 0) {
							cont_par++;
						} // END IF
					}// END WHILE
					/*DIGITOS*/
					
					if (cont_par == 2) {
						//suma = suma + copia;
						suma = operaciones.suma_dos_num(suma, copia);
						num_par_suma = num_par_suma + " " + copia;
					}
				} // END IF
				/*PARS*/
			} // END WHILE
			/*5 PRIMERS NUMS*/
			/*CADENA*/
			cad_user = "La suma de los números con 2 digitos pares es: " + suma + " y los números han sido " + num_par_suma;
			/*CADENA*/
			
			/* CADENA */
			JOptionPane.showMessageDialog(null, cad_user);
			/* CADENA */
	}
	
	public static void acabar_media_digtios_multiplos3_mayor_5() {
		// acabar en -1 i dir de cada num si la media de los dígitos múltiplos de 3 es major o igual  que 5
		
				/*VARIABLES*/
				int num = 0;
				String cad_user = "";
				int copia = 0;
				int digito = 0;
				int cont = 0;
				int suma = 0;
				int media = 0;
				/*VARIABLES*/
				
				/*INTERRUPTOR*/
				boolean interruptor = false;
				/*INTERRUPTOR*/
				
				/*PRIMER BUCLE*/
				while(interruptor ==  false) {
					num = validadors.validar_int("Dame un número", "Número");
					
					if (num == -1) {
						interruptor = true;
					} else {
						/*IMPORTANT*/
						copia = num;
						/*IMPORTANT*/
						
						/*REINICIALIZACION*/
						cont = 0;
						suma = 0;
						/*REINICIALIZACION*/
						
						/*DIGITOS*/
						while (num > 0) {
							digito = num % 10;
							num = num / 10;
							
							if (digito % 3 == 0) {
								cont++;
								//suma = suma + digito;
								suma = operaciones.suma_dos_num(suma, digito);
							}
						} // end while
						/*DIGITOS*/
						
						/*Control de errores*/
						
						if (cont != 0) {
							//media = suma / cont;
							media = operaciones.media(suma, cont);
						} else {
							media = 0;
						} // end if
						
						/*CADENA*/
						if (media > 5) {
							cad_user = cad_user + "La media de " + copia + " es mayor que 5  y es: " + media  + "\n"; 
						} else if (media == 5) {
							cad_user = cad_user + "La media de " + copia + " es 5" + "\n"; 
						} else {
							cad_user = cad_user + "La media de " + copia + " es es menor que 5 y es: " + media  + "\n"; 
						} // end if
						/*CADENA*/
					}
				} // end while
				/*PRIMER BUCLE*/
				
				/* CADENA */
				JOptionPane.showMessageDialog(null, cad_user);
				/* CADENA */
	}
	
	public static void parar_num_major_menor_digitos_par() {
		/* Dissenya una aplicació amb Java que acabarà quan l’usuari introduïsca el num -1.
		Imprimirem per a cada num, el major i menor dels seus dígits pars.*/
		
		/*VARIABLES*/
		int num = 0;
		String cad_user = "";
		int copia = 0;
		int digito = 0;
		int mayor = 0;
		int menor = 0;
		int pivot = 0;
		/*VARIABLES*/
		
		/*INTERRUPTOR*/
		boolean interruptor = false;
		/*INTERRUPTOR*/
		
		/*PRIMER BUCLE WHILE*/
		while (interruptor == false) {
			num = validadors.validar_int("Escribe un num", "Num int");
			
			if (num == -1) {
				interruptor = true;
			} else {
				
				/*REINICIALIZACION*/
				pivot = 0;
				digito = 0;
				mayor = 0;
				menor = 0;
				/*REINICIALIZACION*/
				/*IMPRTANT*/
				copia = num;
				/*IMPRTANT*/
				
				/*SEGUNDO BUCLE*/
				while(num > 0) {
					digito = num % 10;
					num = num / 10;
					
					if ((digito % 2) == 0) {
						if (pivot == 0) {
							pivot ++;
							mayor = digito;
							menor = digito;
						}
						if (mayor < digito) {
							mayor = digito;
						}
						if (digito != 0) {
							if (menor > digito) {
								menor = digito;
							}
						} 
					}// end if
				}// end while
				/*SEGUNDO BUCLE*/
				
				/*CADENA*/
				cad_user = cad_user + "num= " +  copia +  " -> Els digits pars majors i menors són " +  mayor + " i " +  menor + "\n";
				/*CADENA*/
			}// end if
		} // end while
		/*PRIMER BUCLE WHILE*/
		
		/* CADENA */
		JOptionPane.showMessageDialog(null, cad_user);
		/* CADENA */ 
	}
	
	public static void sn_dosdigitospars_suma() {
		 /*Dissenya una aplicació amb Java que acabarà quan l’usuari no desitge continuar (S/N).
		Imprimirem la suma dels nº que tinguen 2 dígits pars.*/
		
		/*VARIABLES*/
		int num = 0;
		String cad_user = "";
		int copia = 0;
		int digito = 0;
		String pars_digito = "";
		int suma = 0;
		int coma = 0;
		int cont = 0;
		/*VARIABLES*/
		
		/*DESEAS CONTINUAR*/
		int continuar = 0;
		/*DESEAS CONTINUAR*/
		
		/*PRIMER BUCLE*/
		do {
			num = validadors.validar_int("Dame una número", "NUM");
			
			/*REINIZIALICACIÓN*/
			copia = 0;
			digito = 0;
			cont = 0;
			/*REINIZIALICACIÓN*/
			
			/*IMPORTANT*/
			copia = num;
			/*IMPORTANT*/
			
			/*SEGUNDO BUCLE*/
			while (num > 0) {
				digito= num % 10;
				num = num /  10;
				
				if (digito % 2 == 0) {
					cont ++;
				} // end if 
				
			} // end while
			/*SEGUNDO BUCLE*/
			
			if (cont == 2) {
				if (coma == 0) {
					pars_digito = pars_digito + copia;
					suma = suma + copia;
					coma ++;
				} else {
					pars_digito = pars_digito + " + "+ copia;
					suma = suma + copia;
				} // end if
				
			} // end if 
						
			/*IMPORTANT DESEA CONTINUAR*/
			continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
			/*IMPORTANT DESEA CONTINUAR*/
		}while(continuar == JOptionPane.OK_OPTION);
		/*PRIMER BUCLE*/
		
		/*CADENA*/
		cad_user = cad_user + pars_digito  + " = " + suma + "\n";
		/*CADENA*/
		
		/* CADENA */
		JOptionPane.showMessageDialog(null, cad_user);
		/* CADENA */ 	
	}
	
	public static void primers_num_divisors_media_major_10() {
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