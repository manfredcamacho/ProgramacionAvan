package principal;

public class Operando {

	private double valor;
	private char variable = ' ';
	
	public Operando(String val){
		if( val.charAt(0) == 'x' ||
			val.charAt(0) == 'y'||
			val.charAt(0) == 'z')
			variable = val.charAt(0);
		else
			valor = Double.parseDouble(val);
	}
	
	public double valor(){
		return valor;
	}
	
	public void setValor( double val ){
		valor = val;
	}
}
