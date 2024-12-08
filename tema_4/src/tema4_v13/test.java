package tema4_v13;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import tema4_v13.utils.menus;
import tema4_v13.modules.cursos.utils.func_singleton;
import tema4_v13.modules.users.classes.Admin;
import tema4_v13.modules.users.classes.Client;
import tema4_v13.modules.users.classes.Singleton_users;
import tema4_v13.modules.users.utils.CRUD.func_create_users;
import tema4_v13.modules.users.utils.CRUD.func_delete_users;
import tema4_v13.modules.users.utils.CRUD.func_read_users;
import tema4_v13.modules.users.utils.CRUD.func_readone_users;
import tema4_v13.modules.users.utils.CRUD.func_updates_users;
import tema4_v13.utils.func_main;

public class test {

    public static void main(String[] args) {
    	
    	Object primer_menu = null;
		Object segundo_menu = null;
		Object tercer_menu = null;

		Object objetos[] =  {"Client", "Admin", "Salir al menu anterior","Salir"};
		Object op_CRUD[] = {"Create", "ReadAll", "ReadOne","Update","Delete", "Salir al menu anterior" , "Salir"};
		Object op[] = {"Seguir", "Salir al menú principal", "Salir al menu anterior", "Salir"};
		
		boolean SalirDelMenu = false;
		
		do {
			primer_menu = menus.combos("Selecciona el objeto", "Objeto", objetos, objetos[3]);
			switch(primer_menu.toString()) {
				case "Client":
					do {
						segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", op_CRUD, op_CRUD[6]);
						switch(segundo_menu.toString()) {
						case "Create":
							do {
								func_create_users.crear_client_CURD();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "ReadAll":
							do {
								func_read_users.read_client();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "ReadOne":
							do {
								func_readone_users.read_one_client();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "Update":
							do {
								func_updates_users.update_client_CRUD(func_main.mostrar_username_client());
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "Delete":
							do {
								//func_delete.delete_desarrollo();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "Salir al menu anterior":
							segundo_menu = op_CRUD[5];
							break;
						case "Salir":
							System.exit(0);
							break;
						} // end switch
					}while(segundo_menu != op_CRUD[5]);
					break;
				case "Admin":
					do {
						segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", op_CRUD, op_CRUD[6]);
						switch(segundo_menu.toString()) {
						case "Create":
							do {
								func_create_users.crear_admin_CRUD();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "ReadAll":
							do {
								func_read_users.read_admin();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "ReadOne":
							do {
								func_readone_users.read_one_admin();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "Update":
							do {
								func_updates_users.update_admin_CRUD(func_main.mostrar_username_admin());
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "Delete":
							do {
								func_delete_users.delete_admin();
								tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
								if (tercer_menu == op[3]) {
									System.exit(0);
								} else if (tercer_menu == op[1]) {
									segundo_menu = op_CRUD[5];
									break;
								} // end if 
							}while(tercer_menu == op[0]);
							break;
						case "Salir al menu anterior":
							segundo_menu = op_CRUD[5];
							break;
						case "Salir":
							System.exit(0);
							break;
						} // end switch
					}while(segundo_menu != op_CRUD[5]);
					break;
				case "Salir al menu anterior":
					SalirDelMenu = true;
					break;
				case "Salir":
					System.exit(0);
					break;
			}
		}while(!SalirDelMenu);
	}
}


