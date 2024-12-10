package Examen_objetos.modules.users.utils;

import java.util.Calendar;

import Examen_objetos.classes.Fecha;

public class func_edad {

    public static int calcularEdad(Fecha fechaNacimiento) {
        // Obtenemos la fecha actual
        Calendar fechaActual = Calendar.getInstance();

        // Obtenemos el año, mes y día de la fecha de nacimiento
        int anioNacimiento = fechaNacimiento.get_anio();
        int mesNacimiento = fechaNacimiento.get_mes();
        int diaNacimiento = fechaNacimiento.get_dia();

        // Obtenemos el año, mes y día actuales
        int anioActual = fechaActual.get(Calendar.YEAR);
        int mesActual = fechaActual.get(Calendar.MONTH) + 1; // +1 porque los meses en Calendar empiezan en 0
        int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);

        // Calculamos la edad inicial
        int edad = anioActual - anioNacimiento;

        // Ajustamos si el cumpleaños no ha pasado este año
        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }

        return edad;
    }
    
    public static boolean esMayorDe18(Fecha fechaNacimiento) {
        // Obtenemos la fecha actual
        Calendar fechaActual = Calendar.getInstance();

        // Obtenemos el año, mes y día de la fecha de nacimiento
        int anioNacimiento = fechaNacimiento.get_anio();
        int mesNacimiento = fechaNacimiento.get_mes();
        int diaNacimiento = fechaNacimiento.get_dia();

        // Obtenemos el año, mes y día actuales
        int anioActual = fechaActual.get(Calendar.YEAR);
        int mesActual = fechaActual.get(Calendar.MONTH) + 1; // +1 porque los meses empiezan en 0
        int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);

        // Calculamos la edad inicial
        int edad = anioActual - anioNacimiento;

        // Ajustamos si el cumpleaños no ha pasado este año
        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }

        // Comprobamos si es mayor o igual a 18
        return edad >= 18;
    }
}
