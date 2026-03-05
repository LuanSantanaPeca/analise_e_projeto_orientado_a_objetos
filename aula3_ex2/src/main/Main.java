package main;

public class Main {
	
	public static void main(String[] args) {
		Carro carro1 = new Carro("Peugeot", "Azul", 1000);
		Trator trator1 = new Trator("CAT", "Verde", 2000, 100, "Colheitadeira");
		
		System.out.println("A marca do carro é " + carro1.getMarca());
		System.out.println(carro1.buzinar());
		System.out.println("-----------------------------------------");
		System.out.println("A cor do trator é " + trator1.getCor());
		System.out.println(trator1.buzinar());
		System.out.println("-----------------------------------------");
		System.out.println("A potencia do trator é " + trator1.getPotencia());
		System.out.println("O modelo do trator é " + trator1.getModelo());
	}
}
