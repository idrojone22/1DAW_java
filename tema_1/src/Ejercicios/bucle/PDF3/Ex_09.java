package Ejercicios.bucle.PDF3;
import javax.swing.JOptionPane;
public class Ex_09 {
	public static void main(String[] args) {
		int n = 0;
		int num = 0;
		int suma = 0;
		String cad = "";
		String cad_user = "";
		
		/*VALIDAR*/
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
			
			suma = suma + i;
		} // end_for
		cad_user = "La suma es: " + suma;
		JOptionPane.showMessageDialog(null, cad_user);
		
	}

}
