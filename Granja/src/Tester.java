
public class Tester {

	public static void main(String[] args) {

		Granja granja = new Granja(10);
		
		System.out.println(granja.listarAnimales());
		
		granja.altaAnimal(2, "Gallina ejemplo", "02-03-2001", 5 );
		granja.bajaAnimal(3);
		granja.modificarIdAnimal(4, 52);
		
		System.out.println(granja.listarAnimales());
		System.out.println(granja.listarAnimalesRentables());

	}

}
