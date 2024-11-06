package Ejercicios.bucle.PDF3;
import javax.swing.JOptionPane;
public class Ex_12 {
	public static void main(String[] args) {
		/*VARIABLES*/
		int num1 = 0;
		int num2 = 0;
		String cad_user = "";
		int suma = 0;
		/*VARIABLES*/
		
		/*VALIDAR*/
		String cad = "";
		boolean correcto=true;
		/*VALIDAR*/
		
		/*DO WHILE*/
		int continuar = 0;
		/*DO WHILE*/
		
		do {
			
			/*NUM1*/
			do{
				try{
					cad=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
					if(cad==null){
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
					}else {
						num1=Integer.parseInt(cad);
						correcto=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}while(correcto==false);
			/*NUM1*/
			
			/*NUM2*/
			do{
				try{
					cad=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
					if(cad==null){
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
					}else {
						num2=Integer.parseInt(cad);
						correcto=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}while(correcto==false);
			/*NUM2*/
			
			suma = num1 + num2;
			
			cad_user = cad_user + " La suma de: " + num1 + " y " + num2 +" es: " + suma;
			
			continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		}while( continuar == JOptionPane.OK_OPTION);
		
		JOptionPane.showMessageDialog(null, cad_user);
	}
}