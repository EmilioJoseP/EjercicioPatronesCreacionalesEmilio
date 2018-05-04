package packageTodo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) throws IOException {
		FileInputStream fichero = new FileInputStream("personas");
		BufferedReader lector = new BufferedReader (new InputStreamReader(fichero));
		String linea = "";
		String tipoDato[];
		String valorTipoDato[];
		int contadorPersona = 0;
		
		ArrayList<PersonaBuilder> listaPersonas = new ArrayList<PersonaBuilder>();
		ArrayList<Persona> listaPersonasDefinitivas = new ArrayList<Persona>();

		while ((linea = lector.readLine()) != null) {
			// Dividir la linea en secciones
			tipoDato = linea.split("#");
			
			valorTipoDato = tipoDato[0].split(":");
			
			//añadimos el objecto
			listaPersonas.add(new PersonaBuilder(valorTipoDato[1]));
			
			//For para recorrer 
			for (int i = 1; i < tipoDato.length; i++) {
				
				valorTipoDato = tipoDato[i].split(":");
				
				if (valorTipoDato[0].equals("colorOjos")) {
					listaPersonas.get(contadorPersona).setColorOjos(valorTipoDato[1]);
				}
				
				if (valorTipoDato[0].equals("colorPelo")) {
					listaPersonas.get(contadorPersona).setColorPelo(valorTipoDato[1]);
				}
				
				if (valorTipoDato[0].equals("tipoPelo")) {
					listaPersonas.get(contadorPersona).setTipoPelo(valorTipoDato[1]);
				}
				
				if (valorTipoDato[0].equals("tipoOjos")) {
					listaPersonas.get(contadorPersona).setTipoOjos(valorTipoDato[1]);
				}
				
				if (valorTipoDato[0].equals("edad")) {
					listaPersonas.get(contadorPersona).setEdad(Integer.valueOf(valorTipoDato[1]));
				}
				
				if (valorTipoDato[0].equals("ciudad")) {
					listaPersonas.get(contadorPersona).setCiudad(valorTipoDato[1]);
				}
				
				if (valorTipoDato[0].equals("peso")) {
					listaPersonas.get(contadorPersona).setPeso(Double.parseDouble(valorTipoDato[1]));
				}
				
				if (valorTipoDato[0].equals("altura")) {
					listaPersonas.get(contadorPersona).setAltura(Double.parseDouble(valorTipoDato[1]));
				}
				
			}
			
			listaPersonasDefinitivas.add(listaPersonas.get(contadorPersona).build());
			contadorPersona++;
		}
		
		for (Persona p : listaPersonasDefinitivas) {
			System.out.println(p.toString());
		}

		lector.close();
	}
}
