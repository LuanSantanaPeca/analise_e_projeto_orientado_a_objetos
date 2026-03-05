package main;

public class Trator extends Carro{
	private int potencia;
	private String modelo;

	public Trator(String marca, String cor, int ano, int potencia, String modelo) {
		super(marca, cor, ano);
		this.potencia = potencia;
		this.modelo = modelo;
	}
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String buzinar() {
		return "ROOM ROOM";
	}
}
