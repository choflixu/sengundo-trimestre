package ejercicios;

public class CuentaCorriente {
	private Titular titular;
	private String tipoCuenta;
	private double saldo;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public CuentaCorriente(Titular tit, String tipoCuenta, double saldo) {

		this.saldo = saldo;
		this.titular = tit;
		this.tipoCuenta = tipoCuenta;

	}

	public CuentaCorriente(Titular tit, String tipoCuenta) {

		this.saldo = 15.3;
		this.titular = tit;
		this.tipoCuenta = tipoCuenta;

	}

	public Titular getTitular() {
		return titular;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void ingresar() {

		double incrementa;
		incrementa = this.saldo+(this.saldo*0.3);

	}
	
	public void reintegro() {
		
		double decrementa;
		
		decrementa=this.saldo-(this.saldo*0.3);
	}
	
	public void imprimir() {
		
		System.out.println(this.tipoCuenta);
		System.out.println(this.saldo);
		
	}
	
	public boolean comparar(CuentaCorriente cuenta) {
		
		if (this.tipoCuenta.equals(cuenta.tipoCuenta)) {
			return true;
		}
		return false;
	}
}
