package Framework.bucle;
import javax.swing.JOptionPane;
public class primers_5_num {

	public static void main(String[] args) {
		
		/* VARIABLES */
		int num = 0;
		String cad_user = "";
		/* VARIABLES */

		/* VALIDAR */
		String cad;
		boolean correcto = true;
		/* VALIDAR */
		
		/*CONTADOR*/
		int cont = 0;
		/*CONTADOR*/
		
		/*PRIMER BUCLE*/
		while(cont < 5) {
			
			if ((num % 2) != 0) {
				/*CADENA*/
				cad_user = "El número " + num + " es impar";
				/*CADENA*/
			}		
		}// END WHILE	
		
		/*CADENA*/
		JOptionPane.showMessageDialog(null, cad_user);
		/*CADENA*/
	}
}