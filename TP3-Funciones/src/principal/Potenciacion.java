package principal;

public class Potenciacion extends Operador{

	private Operando op1;
	private Operando op2;
	
	public Potenciacion( Operando op1, Operando op2 ){
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public double operar(){
		return Math.pow( op1.valor(), op2.valor() );
	}
}
