package tema4_v01;
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		Object menu = null;
		Object menu_secundario = null;
		
		Object op_CRUD[] = {"Create", "ReadAll", "ReadOne","Update","Delete", "Salir"};
		Object op[] = {"Seguir", "Salir al menú principal", "Salir"};
		int salir = 0; 
		Cursos curso1 = null;
		do {
			menu = menus.combos("Seleciona que quieres hacer", "CRUD", op_CRUD, op_CRUD[5]);
			
			switch(menu.toString()) {
			case "Create":
				do {
					curso1 = CRUD.create();
					menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
					if (menu_secundario == op[2]) {
						menu = op_CRUD[5];
						System.exit(0);
					}
				}while(menu_secundario == op[0]);
				break;
			case "ReadAll":
				do {
					 CRUD.readall(curso1);
					menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
					if (menu_secundario == op[2]) {
						menu = op_CRUD[5];
						System.exit(0);
					}
				}while(menu_secundario == op[0]);
				break;
			case "ReadOne":
				do {
					 CRUD.readone(curso1);
					menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
					if (menu_secundario == op[2]) {
						menu = op_CRUD[5];
						System.exit(0);
					}
				}while(menu_secundario == op[0]);
				break;
			case "Update":
				do {
					curso1 = CRUD.update(curso1);
					menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
					if (menu_secundario == op[2]) {
						menu = op_CRUD[5];
						System.exit(0);
					}
				}while(menu_secundario == op[0]);
				break;
			case "Delete":
				do {
					curso1 = CRUD.delete(curso1);
					menu_secundario = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
					if (menu_secundario == op[2]) {
						menu = op_CRUD[5];
						System.exit(0);
					}
				}while(menu_secundario == op[0]);
				break;
			case "Salir":
				JOptionPane.showMessageDialog(null, "Gracias por utlizar la calculadora de idrojone");
				System.exit(0);
				break;
			} // end swithc
		}while (salir != 5);
	}
}