package main;

class Pessoa {
	private String nome;
	private Pessoa amigo;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public void setAmigo(Pessoa amigo) {
		this.amigo = amigo;
	}

	public void exibirAmigo() {
		if (amigo != null) {
			System.out.println(nome + " tem como amigo: " + amigo.nome);
		} else {
			System.out.println(nome + " não tem amigos.");
		}
	}
}

public class Unaria {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Luan");
		Pessoa pessoa2 = new Pessoa("Gabriel");

		pessoa1.setAmigo(pessoa2);
		pessoa1.exibirAmigo();
	}
}
