package Ejercicios.bucle.PDF3;

import javax.swing.JOptionPane;

public class Ex_06 {
	public static void main(String[] args) {
		int num = 0;
		int prod = 1;
		boolean interruptor = false;
		String cad = "";
		
		/*VALIDAR*/
		boolean correcto=true;
		/*VALIDAR*/
		
		while (interruptor == false) {
			
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
			
			if (num < 0) {
				interruptor = true;
			} else {
				prod = prod * num;
			}// end_if
			
		}// end_while
		
		cad = "El producto es: " + prod;
		JOptionPane.showMessageDialog(null, cad);
	}
}
