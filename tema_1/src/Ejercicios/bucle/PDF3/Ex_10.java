package Ejercicios.bucle.PDF3;
import javax.swing.JOptionPane;
public class Ex_10 {
	public static void main(String[] args) {
		
		/*VARIABLES*/
		int num = 0;
		String cad_user = "";
		int neg = 0;
		int pos = 0;
		/*VARIABLES*/

		/*DESEA CONTINUAR*/
		int continuar = 0;
		/*DESEA CONTINUAR*/
		
		/*VALIDAR*/
		String cad = "";
		boolean correcto=true;
		/*VALIDAR*/
		
		/*PRIMER BUCLE*/
		do {
			/*NUM*/
			do{
				try{
					cad=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
					if(cad==null){
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
					}else {
						num=Integer.parseInt(cad);
						correcto=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}while(correcto==false);
			/*NUM*/
			
			if (num >= 0) {
				pos++;
			} else {
				neg++;
			}// end if
			
			continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		}while(continuar == JOptionPane.OK_OPTION);
		/*PRIMER BUCLE*/
		
		cad_user = "El número de positivos es: " + pos + " y el de negativos es: " + neg;
		JOptionPane.showMessageDialog(null, cad_user);
	}

}
