package Ejercicios.bucle;

import javax.swing.JOptionPane;

public class nnRepite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int n = 0;
		int cont = 0;
		String cad = "";
		int pivot = 0;
		int mayor = 0;

		//validar
		String s;
		boolean correcto = true;
		
		//n
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Escribe un n","Num int",JOptionPane.QUESTION_MESSAGE);
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
		
		for (int i = 0; i < n; i ++) {
			
			if ( pivot  == 0) {
				
				pivot ++;
				mayor = num;
				
			} // end if
			
			//num
			do{
				try{
					s=JOptionPane.showInputDialog(null, "Escribe un num","Num int",JOptionPane.QUESTION_MESSAGE);
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
			
			if (num == mayor) {
				cont ++;
			} // end if
			
			if (num > mayor) {
				mayor = num;
				cont = 0;
			} // end if
					
		} // end for
		
		cad = "El numero mayor es: " + num + " y se ha repetido: " + cont + " veces";
		JOptionPane.showMessageDialog(null, cad);	
	}

}
