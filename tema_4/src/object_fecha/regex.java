

package object_fecha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class regex {

	private static final String plan_id="^([A-Z]{1})([0-9]{4})$";
	private static final String plan_fecha="^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$";
	
	public static boolean validar_id(String id) {
		Pattern pattern = Pattern.compile(plan_id);
		Matcher matcher = pattern.matcher(id);
		
		if (matcher.matches()) {
			return true;
		} 
		JOptionPane.showMessageDialog(null, "El formato debe de ser 1 letra mayuscula 4 digitos");
		return false;
	}
	
	public static boolean validar_fecha(String fecha) {
		Pattern pattern = Pattern.compile(plan_fecha);
		Matcher matcher = pattern.matcher(fecha);
		
		if (matcher.matches()) {
			return true;
		} 
		JOptionPane.showMessageDialog(null,"Dame un String con formato 01/01/2013");
		return false;
	}
}
