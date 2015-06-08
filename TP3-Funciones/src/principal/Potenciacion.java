package principal;

public class Potenciacion extends Operador{

	private Operador op1;
	private Operador op2;
	
	public Potenciacion( Operador op1, Operador op2 ){
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public double operar(){
		return Math.pow( op1.operar(), op2.operar() );
	}
}
