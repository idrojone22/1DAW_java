package Ejercicios.bucle.PDF3;
import javax.swing.JOptionPane;
public class Ex_02 {
	public static void main(String[] args) {
		
		/*VARIABLES*/
		int num = 0;
		String cad_user = "";
		/*VARIABLES*/
		
		/*VALIDAR*/
		String cad = "";
		boolean correcto=true;
		/*VALIDAR*/
		
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
			
			if((num % 2) == 0) {
				cad_user = "El numero " + num + " es positivo y par";
			}else {
				cad_user = "El numero " + num + " es positivo y impar";
			}
		} else {
			cad_user = "El numero " + num + " es negativo";
		} // end if 
		
		JOptionPane.showMessageDialog(null, cad_user);
	}

}