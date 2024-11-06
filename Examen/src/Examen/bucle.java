package Examen;
import javax.swing.JOptionPane;

/**
 *   Contiene los 4 bucles principales a modo de guia.
 *   
 *   Requiere la clase validadors.java para validar las entradas de enteros.
  */

public class bucle {
	
	/**
	 *  bucle for
	 */
	  public static void n_num() {

	        /* VARIABLES */
	        int num = 0;
	        String cad_user = "";
	        /* VARIABLES */

	        /*N*/
	        int n = 0;
	        /*N*/

	        n = validadors.validar_int("Escribe n", "Num int");

	        /*PRIMER BUCLE */
	        for (int i = 0; i < n;  i++) {
	            num = validadors.validar_int("Escribe un num ", "Num int");
	        } // end for
	        /*PRIMER BUCLE */
	    }
	  
	  /**
		 *   bucle while amb contador
		 */

	    public static void primers_5_num() {
	        /* VARIABLES */
	        int num = 0;
	        String cad_user = "";
	        /* VARIABLES */

	        /*CONTADOR*/
	        int cont = 0;
	        /*CONTADOR*/

	        	/*PRIMER BUCLE*/
			while(cont < 5) {

	            num = validadors.validar_int("Escribe un num ", "Num int");
				
				if ((num % 2) != 0) {

	                cont ++;
					/*CADENA*/
					cad_user = "El número " + num + " es impar";
					/*CADENA*/
				}		
			}// END WHILE	
			
			/*CADENA*/
			JOptionPane.showMessageDialog(null, cad_user);
			/*CADENA*/
	    }
	    
	    /**
		 *   bucle do while
		 */

	    public static void desea_continuar()  { 
	        /* VARIABLES */
			String cad_user = "";
			int num = 0;
			/* VARIABLES */

	        /* DESEA CONTINUAR */
			int continuar = 0;
			/* DESEA CONTINUAR */

	        /* PRIMER BUCLE */
	        do{
	            num = validadors.validar_int("Escribe un num int", "Num int");
	            continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
	        }while (continuar == JOptionPane.OK_OPTION);
	        /* PRIMER BUCLE */
	    }
	    
	    /**
		 *   bucle while amb boolean interruptor
		 */

	    public static void interruptor()  {    
	        /* VARIABLES */
			int num = 0;
			String cad_user = "";
			/* VARIABLES */

	        /* INTERRUPTOR */
			boolean interruptor = false;
			/* INTERRUPTOR */

	        /* PRIMER BUCLE */
			while (interruptor == false) {

				num = validadors.validar_int("Escribe un num ", "Num int");

				if (num < 0) {
					interruptor = true;
				} // END IF
			} // END WHILE
			/* PRIMER BUCLE */
		}
}
