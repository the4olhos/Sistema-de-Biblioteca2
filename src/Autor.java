public class Autor extends Pessoa {
    private String biografia;

    public Autor(String nome, String email, String biografia) {
        super(nome, email);
        this.biografia = biografia;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Autor: " + nome + " - Email: " + email);
        System.out.println("Biografia: " + biografia);
    }

    @Override
    public String toString() {
        return "\nAutor: " + nome + "- E-mail: " + email +
                "\nBiográfia: " + biografia;
    }
}