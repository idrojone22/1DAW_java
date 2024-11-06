package Ejercicios.bucle;
import javax.swing.JOptionPane;
public class Ex_05 {
	public static void main(String[] args) {
		/*n números mayor y menor*/
		
		/*VARIABLES*/
		int n= 0;
		int num = 0;
		int pivot = 0;
		int mayor = 0;
		int menor = 0;
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
		
		for (int i = 0; i < n; i ++) {
			
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
			
			if (pivot == 0) {
				mayor = num;
				menor = num;
				pivot++;
			} // END IF
			
			if (num > mayor) {
				mayor = num;
			} // END IF
			
			if (num < menor) {
				menor = num;
			}// END IF 
		}// END FOR
		
		/*CADENA*/
		cad_user = "El número mayor es: " +  mayor + " y el menor es: " +  menor;
		JOptionPane.showMessageDialog(null, cad_user);
		/*CADENA*/
	}

}
