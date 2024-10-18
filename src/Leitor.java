public class Leitor extends Pessoa {
    private int numeroDeLeitor;

    public Leitor(String nome, String email, int numeroDeLeitor) {
        super(nome, email);
        this.numeroDeLeitor = numeroDeLeitor;
    }

    public void reservarLivro(Livro livro, Leitor leitor){
        Reserva reserva = new Reserva(livro, leitor);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Leitor: " + nome + " - E-mail: " + email +
                "\nNúmero de leitor: " + numeroDeLeitor;
    }
}