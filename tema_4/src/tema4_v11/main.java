package tema4_v11;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import tema4_v11.modules.courses.dummies.desarrollo_dummies;
import tema4_v11.modules.courses.dummies.desplegamiento_dummies;
import tema4_v11.modules.courses.dummies.diseno_dummies;
import tema4_v11.modules.courses.dummies.dummies;
import tema4_v11.utils.func_main;
import tema4_v11.utils.menus;
import tema4_v11.utils.validadors;
import tema4_v11.modules.courses.classes.Cursos;
import tema4_v11.modules.courses.classes.Desarrollo_web;
import tema4_v11.modules.courses.classes.Diseno_web;
import tema4_v11.modules.courses.classes.Desplegamiento_web;
import tema4_v11.modules.courses.classes.Singleton;
import tema4_v11.modules.courses.utils.CRUD.func_create;
import tema4_v11.modules.courses.utils.CRUD.func_delete;
import tema4_v11.modules.courses.utils.CRUD.func_read;
import tema4_v11.modules.courses.utils.CRUD.func_update;

public class main {

	public static void main(String[] args) {
		Object primer_menu = null;
		Object segundo_menu = null;
		Object tercer_menu = null;
		Object manual_auto_menu = null;
		
		Object manual_auto[] = {"auto", "manual"};
		Object objetos[] =  {"Desarrollo web", "Diseño web", "Desplegament web", "Salir"};
		Object op_CRUD[] = {"Create", "ReadAll", "ReadOne","Update","Delete", "Salir al menú princial" , "Salir"};
		Object op[] = {"Seguir", "Salir al menú principal", "Salir al menu anterior", "Salir"};
		
		int salir = 0;
		int n = 0;
		
		Cursos objeto = null;
		Singleton.array_desarrollo = new ArrayList <Desarrollo_web> ();
		Singleton.array_diseno = new ArrayList <Diseno_web> ();
		Singleton.array_desplegamiento = new ArrayList <Desplegamiento_web> ();
		
		manual_auto_menu = menus.combos("Selecciona la opción", "Manual o Automático",manual_auto , manual_auto[0]);
		
		if (manual_auto_menu.toString() == "auto") {
			n = validadors.validar_int("Cuántos objetos quieres automáticos", "Repeticiones");
			for (int i = 0; i < n; i++) {
				dummies.crear_cursos();
			} // end for
		} // end if
		
		do {
			primer_menu = menus.combos("Selecciona el objeto", "Objeto", objetos, objetos[3]);
			
			switch(primer_menu.toString()) {
			case "Desarrollo web":
				do {
					segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", op_CRUD, op_CRUD[6]);
					switch(segundo_menu.toString()) {
					case "Create":
						do {
							func_create.crear_desarrollo();
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
							func_read.read_desarrollo(func_main.mostrarID());
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
							JOptionPane.showMessageDialog(null, "Desarrollo ReadOne");
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
							func_update.update_desarrollo(func_main.mostrarID());
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
							func_delete.delete_desarrollo();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "Salir al menu principal":
						break;
					case "Salir":
						System.exit(0);
						break;
					} // end switch
					if (segundo_menu == op_CRUD[5]) {
						break;
					} // end if 
				}while(segundo_menu != op_CRUD[6]);
				break;
			case "Diseño web":
				do {
					segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", op_CRUD, op_CRUD[6]);
					switch(segundo_menu.toString()) {
					case "Create":
						do {
							func_create.crear_diseno();
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
							func_read.read_diseno();
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
							JOptionPane.showMessageDialog(null, "Diseño One");
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
							func_update.update_diseno();
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
							func_delete.delete_diseno();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "Salir al menu principal":
						break;
					case "Salir":
						System.exit(0);
						break;
					} // end switch
					if (segundo_menu == op_CRUD[5]) {
						break;
					} // end if 
				}while(segundo_menu != op_CRUD[6]);
				break;
			case "Desplegament web":
				do {
					segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", op_CRUD, op_CRUD[6]);
					switch(segundo_menu.toString()) {
					case "Create":
						do {
							func_create.crear_desplegamiento();
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
							func_read.read_desplegamiento();
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
							JOptionPane.showMessageDialog(null, "Desplegament ReadOne");
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
							func_update.update_desplegamiento();
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
							func_delete.delete_desplegamiento();
							tercer_menu = menus.combos("Seleciona la opción", "Selector de opciones", op, op[0]);
							if (tercer_menu == op[3]) {
								System.exit(0);
							} else if (tercer_menu == op[1]) {
								segundo_menu = op_CRUD[5];
								break;
							} // end if 
						}while(tercer_menu == op[0]);
						break;
					case "Salir al menu principal":
						break;
					case "Salir":
						System.exit(0);
						break;
					} // end switch
					if (segundo_menu == op_CRUD[5]) {
						break;
					} // end if 
				}while(segundo_menu != op_CRUD[6]);
				break;
				
			case "Salir":
				System.exit(0);
				break;
			} // end switch
		}while (salir != 3);
	}
}