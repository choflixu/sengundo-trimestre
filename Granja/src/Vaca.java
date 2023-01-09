
public class Vaca extends Animal {

	private int litrosLecheDia;

	public Vaca(int id, String nombre, String fechaNacimiento, int litrosLecheDia) {
		super(id, nombre, fechaNacimiento);
		this.litrosLecheDia = litrosLecheDia;
	}

	public int getLitrosLecheDia() {
		return litrosLecheDia;
	}

	public void setLitrosLecheDia(int litrosLecheDia) {
		this.litrosLecheDia = litrosLecheDia;
	}

	@Override
	public boolean esRentable() {
		return this.litrosLecheDia > 30;
	}

	@Override
	public String toString() {
		return super.toString() + " Litros Leche/d: " + this.litrosLecheDia;
	}
}
