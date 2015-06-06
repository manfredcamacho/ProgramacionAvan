package principal;
import java.util.ArrayList;

import tda.clases.PilaEstatica;
import entradaSalida.*;


public class Expresion extends Operador {
	
	private final String ruta = "expresion.in";
	private ArrayList<Operador>operaciones;
	private double resultado;
	private double variables[];
	private int puntosAevaluar;
	
	public void agregar(Expresion c) {
		operaciones.add(c);
	}
	
	public Expresion( String linea ){
		Entrada fp = new Entrada(ruta);
		String []dato = fp.leer().split(" ");
		
		PilaEstatica<Operador> pila = new PilaEstatica<Operador>();
		
		String[] datoVariables = fp.leer().split(" ");
		this.variables = new double[Integer.parseInt(datoVariables[0]) ];
		this.puntosAevaluar = Integer.parseInt(datoVariables[1]);
		
		/*
		 * TERMINE ACA, ESTABA POR EMPECEAR A CARGAR LOS DATOS, NO SE SI
		 * ESTARA BIEN LA ESTRUCTURA DEL COMPOSITE, LA IDEA ES QUE TENGO CLASES DE
		 * CADA TIPO DE OPERACION DONDE CADA UNA TIENE UN METODO EN COMUN " OPERAR "
		 * QUE HACE LA OPERACION QUE LE ORRESPONDE, TODAS HEREDAN DE OPERADOR, Y EXPRESION TAMBIEN 
		 * HEREDA DE OPERADOR LO QUE SIGNIFICA QUE UNA EXPRESION ES UN OPERADOR POR ASI DECIRLO
		 * ( LA VERDAD NI IDEA XD ) , LA IDEA ES QUE UNA EXPRESION PUEDA CONTENER EXPRESIONES
		 * Y QUE LAS HOJAS DE ESAS EXPRESIONES SEAN OPERACIONES ( PENSANDOLO COMO ARBOL ) Y ME
		 * ACABO DE DAR CUENTA MIENTRAS ESCRIBO ESTO QUE HICE CUALQUIER PAVADA CREO...
		  */
		
		for (int i = 0; i < dato.length; i++) {
			if( dato[])
		}
	}

	@Override
	public void agregar(Operador c) {
		// TODO Auto-generated method stub
		
	}
	
}
