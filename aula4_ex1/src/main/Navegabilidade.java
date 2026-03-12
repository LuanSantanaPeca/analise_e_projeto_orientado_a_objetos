package main;

class Cliente {
	private String nome;

	public Cliente(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}

class ContaBancaria {
	private int numero;
	private Cliente cliente;

	public ContaBancaria(int numero, Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}
	public void exibirDetalhes() {
		System.out.println("Conta Bancaria #" + numero + " pertencente a: " + cliente.getNome());
	}
}

public class Navegabilidade {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Luan");
		ContaBancaria contaBancaria = new ContaBancaria(1587, cliente);

		contaBancaria.exibirDetalhes();
	}
}