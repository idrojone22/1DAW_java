package tema4_v6;
	
public class main {

	public static void main(String[] args) {
		Object primer_menu = null;
		Object segundo_menu = null;
		Object tercer_menu = null;
		
		Object objetos[] =  {"Desarrollo web", "Diseño web", "Desplegament web", "Salir"};
		Object op_CRUD[] = {"Create", "ReadAll", "ReadOne","Update","Delete", "Salir al menú princial" , "Salir"};
		Object op[] = {"Seguir", "Salir al menú principal", "Salir al menu anterior", "Salir"};
		int salir = 0; 
		int i = 0;
		Cursos objeto = null;
		
		do {
			primer_menu = menus.combos("Selecciona el objeto", "Objeto", objetos, objetos[3]);
			
			switch(primer_menu.toString()) {
			case "Desarrollo web":
				i = 0;
				do {
					segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", op_CRUD, op_CRUD[6]);
					switch(segundo_menu.toString()) {
					case "Create":
						do {
							objeto = CRUD.create(i);
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
							CRUD.readall(objeto);
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
							CRUD.readone(objeto);
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
							objeto = CRUD.update(objeto);
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
							objeto = CRUD.delete(objeto);
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
				i = 1;
				do {
					segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", op_CRUD, op_CRUD[6]);
					switch(segundo_menu.toString()) {
					case "Create":
						do {
							objeto = CRUD.create(i);
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
							CRUD.readall(objeto);
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
							CRUD.readone(objeto);
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
							objeto = CRUD.update(objeto);
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
							objeto = CRUD.delete(objeto);
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
				i = 2;
				do {
					segundo_menu = menus.combos("Selecciona la opción", "Selector de opciones", op_CRUD, op_CRUD[6]);
					switch(segundo_menu.toString()) {
					case "Create":
						do {
							objeto = CRUD.create(i);
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
							CRUD.readall(objeto);
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
							CRUD.readone(objeto);
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
							objeto = CRUD.update(objeto);
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
							objeto = CRUD.delete(objeto);
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