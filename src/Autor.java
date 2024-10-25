public class Autor extends Pessoa {//criação da classe Autor que está herdando da classe Pessoas
    //variável biografia do tipo String que está privada
    private String biografia;

    public Autor(String nome, String email, String biografia) {//construtor
        super(nome, email);
        this.biografia = biografia;
    }

    @Override
    public void exibirDetalhes() {//método
        System.out.println("Autor: " + nome + " - Email: " + email);
        System.out.println("Biografia: " + biografia);
    }

    @Override
    public String toString() {//método
        return "\nAutor: " + nome + "- E-mail: " + email +
                "\nBiográfia: " + biografia;
    }
}
