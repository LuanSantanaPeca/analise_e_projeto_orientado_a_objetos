package main;

public class Main {
	
	public static void main(String[] args) {
		Carro carro1 = new Carro("Peugeot", "Azul", 1000);
		Trator carro2 = new Trator("CAT", "Verde", 2000);
		
		System.out.println("A marca do carro é " + carro1.getMarca());
		System.out.println(carro1.buzinar());
		System.out.println("-----------------------------------------");
		System.out.println("A cor do trator é " + carro2.getCor());
	}
}
