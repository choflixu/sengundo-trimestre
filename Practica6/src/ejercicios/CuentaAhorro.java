package ejercicios;

public class CuentaAhorro extends CuentaCorriente{

	private double interes;
	
	
	public CuentaAhorro(double interes, double saldo, Titular ti, String cuenta) {
		super(ti,cuenta,saldo);
		this.interes=interes;
	     
	}
	
	public CuentaAhorro(double interes, Titular ti, String cuenta) {
		super(ti,cuenta);
		this.interes=interes;
		this.setSaldo(1.5);
	     
	}
	
	public CuentaAhorro( Titular ti, String cuenta) {
		super(ti,cuenta);
		this.interes=2.5;
		this.setSaldo(1.5);
	     
	}

	public double getInteres() {
		return interes;
	}
	
	public void calculoInteres() {
		
		if (this.interes>=2.5) {
			
			this.setSaldo(100+this.getSaldo());
			
		}
	
		
	}
}
