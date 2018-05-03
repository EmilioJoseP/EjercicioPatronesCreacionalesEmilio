package packageTodo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejecutable {

	public static void main(String[] args) throws IOException {
		FileInputStream fichero = new FileInputStream("personas");
		BufferedReader lector = new BufferedReader (new InputStreamReader(fichero));
		String linea = "";
		String tipoDato[];
		String valorTipoDato[];
		int contador = 0;
		
		PersonaBuilder per1 = new PersonaBuilder("hola");
		
		while ((linea = lector.readLine()) != null) {
			tipoDato = linea.split("#");
			if (tipoDato[contador].equals("colorOjos")) {
				valorTipoDato = tipoDato[contador].split(":");
				per1.setColorOjos(valorTipoDato[1]);
			} else if (tipoDato[contador].equals("colorPelo")) {
				valorTipoDato = tipoDato[contador].split(":");
				per1.setColorPelo(valorTipoDato[1]);
			} else if (tipoDato[contador].equals("tipoPelo")) {
				valorTipoDato = tipoDato[contador].split(":");
				per1.setTipoPelo(valorTipoDato[1]);
			} else if (tipoDato[contador].equals("tipoOjos")) {
				valorTipoDato = tipoDato[contador].split(":");
				per1.setTipoOjos(valorTipoDato[1]);
			} else if (tipoDato[contador].equals("edad")) {
				valorTipoDato = tipoDato[contador].split(":");
				per1.setEdad(valorTipoDato[1]);
			} else if (tipoDato[contador].equals("colorPelo")) {
				valorTipoDato = tipoDato[contador].split(":");
				per1.setColorPelo(valorTipoDato[1]);
			} else if (tipoDato[contador].equals("colorPelo")) {
				valorTipoDato = tipoDato[contador].split(":");
				per1.setColorPelo(valorTipoDato[1]);
			} else if (tipoDato[contador].equals("colorPelo")) {
				valorTipoDato = tipoDato[contador].split(":");
				per1.setColorPelo(valorTipoDato[1]);
			}
			
			contador++;
		}
		
		per1.build();

		lector.close();
	}
}
