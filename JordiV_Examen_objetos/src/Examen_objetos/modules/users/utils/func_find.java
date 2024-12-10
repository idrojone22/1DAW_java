package Examen_objetos.modules.users.utils;

import Examen_objetos.modules.users.classes.Singleton_users;
import Examen_objetos.modules.users.classes.User;

public class func_find {
	public static int find (User user) {
		
		for (int i = 0; i <= (Singleton_users.array_admin.size() -1); i++) {
			if((Singleton_users.array_admin.get(i).equals(user)) ) return i;
		}
		
		for (int i = 0; i <= (Singleton_users.array_client.size() -1); i++) {
			if((Singleton_users.array_client.get(i).equals(user)) ) return i;
		} 
		
		return -1;
	}
	
	public static int find_admin (User user) {
		for (int i = 0; i <= (Singleton_users.array_admin.size() -1); i++) {
			if((Singleton_users.array_admin.get(i).equals(user)) ) return i;
		}
		return -1;
	}
	
	public static int find_client (User user) {
		for (int i = 0; i <= (Singleton_users.array_client.size() -1); i++) {
			if((Singleton_users.array_client.get(i).equals(user)) ) return i;
		} 
		return -1;
	}
}
