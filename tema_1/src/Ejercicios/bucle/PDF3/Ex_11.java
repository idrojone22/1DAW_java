package Ejercicios.bucle.PDF3;
import javax.swing.JOptionPane;
public class Ex_11 {
	public static void main(String[] args) {
		
		/*VARIABLES*/
		int num = 0;
		String cad_user = "";
		int n = 0;
		/*VARIABLES*/
		
		/*VALIDAR*/
		String cad = "";
		boolean correcto=true;
		/*VALIDAR*/
		
		/*N*/
		do{
			try{
				cad=JOptionPane.showInputDialog(null, "Escribe N","Num int",JOptionPane.QUESTION_MESSAGE);
				if(cad==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
				}else {
					n=Integer.parseInt(cad);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		/*N*/
		
		for (int i = 0; i < n; i++) {
			
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
			
			if ((num >= 0) && ((num %2)==0)) {
				cad_user = cad_user + "El num " + num + "es par y positivo ";
			} else {
				cad_user = cad_user + "El num" + num + " no es par y positivo ";
			} // end if 
		} // end for
		
		JOptionPane.showMessageDialog(null, cad_user);
	}

}
