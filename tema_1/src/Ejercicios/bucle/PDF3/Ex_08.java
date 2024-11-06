package Ejercicios.bucle.PDF3;
import javax.swing.JOptionPane;
public class Ex_08 {
	public static void main(String[] args) {
		int num = 0;
		int prod = 1;
		String cad_user = "";
		
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
			
			prod = prod * num;
			
			
			continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		}while (continuar == JOptionPane.OK_OPTION);
		/*PRIMER BUCLE*/
		
		cad_user = "El prod es: " + prod;
		JOptionPane.showMessageDialog(null, cad_user);
	}

}
		