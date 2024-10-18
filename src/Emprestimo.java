public class Emprestimo {
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(Leitor leitor, Livro livro) {
        this.leitor = leitor;
        this.livro = livro;
    }
    public void exibirDetalhes() {
        System.out.println("Empréstimo realizado:");
        leitor.exibirDetalhes();
        System.out.println(livro);
    }
}