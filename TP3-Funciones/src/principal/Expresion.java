package principal;
import java.util.ArrayList;

import tda.clases.PilaEstatica;
import entradaSalida.*;


public class Expresion {
	
	private final String ruta = "expresion.in";
	private double resultado;
	private double variables[];
	private int puntosAevaluar;
	
	public Expresion( String linea ){
		Entrada fp = new Entrada(ruta);
		String []expresion = fp.leer().split(" ");
		
		PilaEstatica<Operador> pila = new PilaEstatica<Operador>();
		
		String[] datoVariables = fp.leer().split(" ");
		this.variables = new double[Integer.parseInt(datoVariables[0]) ];
		this.puntosAevaluar = Integer.parseInt(datoVariables[1]);
		
		
		
	}

	
}
