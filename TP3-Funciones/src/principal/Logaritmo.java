package principal;

public class Logaritmo extends Operador {
	
	private Operador op1;
	
	public Logaritmo( Operador op1 ){
		this.op1 = op1;
	}
	
	public double operar(){
		return Math.log(op1.operar());
	}

}
