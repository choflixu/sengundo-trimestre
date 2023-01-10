
public class Practica7a {

	public static void main(String[] args) {

		Centralita c = new Centralita();
		
		LlamadaLocal llam1 = new LlamadaLocal(3423434, 342343, 34);
		LlamadaLocal llam2 = new LlamadaLocal(3423434, 342343, 64);

		LlamadaProvincial llam3 = new LlamadaProvincial(34243434, 3423443, 36, 3);
		LlamadaProvincial llam4 = new LlamadaProvincial(34234434, 3423443, 65, 2);
		
		c.registrarLlamada(llam1);
		c.registrarLlamada(llam2);
		c.registrarLlamada(llam3);
		c.registrarLlamada(llam4);
		
		System.out.println("Num total llamadas: "+c.getNumLlamadas());
		System.out.println("Coste total llamadas: "+c.getCosteTotal());

	}

}
