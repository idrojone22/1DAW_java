package tema4_v10;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;


public class test {

	public static void main(String[] args) {
		Random random = new Random();
        
        // Longitud aleatoria entre 5 y 15 (puedes ajustar el rango)
        int longitud = random.nextInt(11) + 5;  // Genera un número entre 5 y 15
        
        StringBuilder resultado = new StringBuilder();
        
        // Definir los caracteres posibles (letras y números)
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        // Generar el String aleatorio
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            resultado.append(caracteres.charAt(indice));
        }
	       
	   System.out.println(resultado.toString());
	}
}
