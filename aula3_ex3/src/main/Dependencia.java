package main;

class Noticias{
	public String noticiasDoDia(String data){
		return "Essas são as notícias do dia " + data;
	}
}

class Pessoa{
	public void checarNoticias(Noticias noticias, String data) {
		String conhecimento = noticias.noticiasDoDia(data);
		System.out.println("Agora eu sei que: " + conhecimento + "!");
	}
}

public class Dependencia {
	public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Noticias noticias = new Noticias();

        pessoa.checarNoticias(noticias, "05/03/2026");
    }
}
