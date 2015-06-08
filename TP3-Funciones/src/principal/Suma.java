package principal;

public class Suma extends Operador {
	
	private Operador op1;
	private Operador op2;
	
	public Suma( Operador op1, Operador op2 ){
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public double operar(){
		return op1.operar() + op2.operar();
	}
}
