package main;

class Motor{
	private int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }
}

class Carro{
	private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public void especificacoes(Motor motor) {
        System.out.println("O modelo " + modelo + " tem " + motor.getPotencia() + " cavalos de potência");
    }
}

public class Composicao {
	public static void main(String[] args) {
		Carro carro = new Carro("Opala");
		Motor motor = new Motor(123445);
		
		carro.especificacoes(motor);
	}
}
