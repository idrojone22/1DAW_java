package Ejercicios.bucle;
import javax.swing.JOptionPane;
public class Ex_03 {
	public static void main(String[] args) {
		
		/*El producto de impares positivos, dado n número*/
		
		/*VARIABLES*/
		int n= 0;
		int num = 0;
		int prod = 1;
		String cad_user = "";
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
		
		for (int i = 0; i < n ; i ++) {
			
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
			
			if (((num % 2) != 0) && (num > 0)) {
				prod = prod * num;
			} // end if
		} // end for
		
		cad_user = "El producto de los imapres positivos es:  " + prod;
		JOptionPane.showMessageDialog(null, cad_user);
	}

}
