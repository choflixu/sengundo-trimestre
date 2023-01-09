package ejercicios;

public class Practica6 {

	public static void main(String[] args) {
		
		CuentaAhorro ch1= new CuentaAhorro(new Titular("juan","Arderiouos",19),"1236777");
		CuentaCorriente cc1= new CuentaCorriente(new Titular("jose","Arderous",96),"12542");
		
		System.out.println(ch1.getTitular().toString());
		System.out.println(cc1.getTitular().toString());
		
		
		
	    ch1.reintegro();
	    cc1.reintegro();
	    
	    System.out.println(ch1.toString());
	    System.out.println(cc1.toString());
	    
	    System.out.println(ch1.comparar(cc1)); 
	    
	    ch1.setSaldo(500);
	    cc1.setSaldo(90);
	    
	    ch1.ingresar();
		cc1.ingresar();
	    
	  ch1.calculoInteres();
	  System.out.println(ch1.toString());
	  System.out.println(cc1.toString());
	    
	}

}
