package Ejercicios.bucle;

import javax.swing.JOptionPane;

public class suma {
	public static void main (String[] args) {
		
		int num = 0;
		int suma = 0;
		int n = 0;
		String cad = "";
		
		//validar 
		String s;
		boolean correcto = true;
		
		//n
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Escribe un num1 ","Num int",JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
				}else {
					n=Integer.parseInt(s);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		//end n
		
		for (int i = 0; i < n; i++) {
			
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
			
			suma = suma + num;
		
		} // end for 
		
		cad = "La suma es: " + suma;
		JOptionPane.showMessageDialog(null, cad);
	}
}
