
public abstract class Animal {

	private int id;
	private String nombre;
	private String fechaNacimiento;

	public Animal(int id, String nombre, String fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public abstract boolean esRentable();

	@Override
	public String toString() {
		return "id: " + this.id + " " + this.nombre + " Fecha Nacimiento: " + this.fechaNacimiento;
	}

}
