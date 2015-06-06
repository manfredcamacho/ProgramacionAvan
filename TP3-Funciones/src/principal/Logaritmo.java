package principal;

public class Logaritmo extends Operador {
	
	private Operando op1;
	
	public Logaritmo( Operando op1 ){
		this.op1 = op1;
	}
	
	public double operar(){
		return Math.log(op1.valor());
	}
}
