package Ejercicios.bucle;
import javax.swing.JOptionPane;

public class sacar_num_mayor {
	public static void main (String[] args) {
		
		int num1 = 0, num2 = 0;
		String cad = "";
		
		//validar
		String s;
		boolean correcto = true;
		
		//num1
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Escribe un num1 ","Num int",JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
				}else {
					num1=Integer.parseInt(s);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		//end num1
		
		//num2
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Escribe un num2 ","Num int",JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
				}else {
					num2=Integer.parseInt(s);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		//end num2
		
		if (num1 > num2) {
			cad = "El número mayor es: " + num1 + " el menor es: " + num2;
		} else if (num2 > num1) {
			cad = "El número mayor es: " + num2 + "y el menor es: " + num1;
		} else {
			cad = "Son  iguales";
		} // end if
		
		JOptionPane.showMessageDialog(null, cad);
		
	}
}