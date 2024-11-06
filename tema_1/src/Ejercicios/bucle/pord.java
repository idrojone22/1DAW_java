package Ejercicios.bucle;

import javax.swing.JOptionPane;

public class pord {
	public static void main (String[] args) {
		
		int num = 0;
		int prod = 1;
		boolean interruptor = false;
		String cad = "";
		
		//validar 
		String s;
		boolean correcto = true;
		
		while (interruptor == false) {
			
			//num
			do{
				try{
					s=JOptionPane.showInputDialog(null, "Escribe un num1 ","Num int",JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
					}else {
						num=Integer.parseInt(s);
						correcto=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}while(correcto==false);
			//end num
			
			if (num < 0) {
				interruptor = true;
			} else {
				prod = prod * num;
			} // end if
		} // end while
		
		cad = "El prod es: " + prod;
		JOptionPane.showMessageDialog(null, cad);
		
	}
}
