package tema4_v13.modules.users.utils;

import tema4_v13.modules.users.classes.Singleton;
import tema4_v13.modules.users.classes.User;

public class func_find {
	public static int find (User user) {
		
		for (int i = 0; i <= (Singleton.array_admin.size() -1); i++) {
			if((Singleton.array_admin.get(i).equals(user)) ) return i;
		}
		
		for (int i = 0; i <= (Singleton.array_client.size() -1); i++) {
			if((Singleton.array_client.get(i).equals(user)) ) return i;
		} 
		
		return -1;
	}
}