public class Emprestimo {
    //Atributos da classe emprestimo
    private Leitor leitor;
    private Livro livro;

    //Construtor da clsse exige um leitor e um livro como parametro
    public Emprestimo(Leitor leitor, Livro livro) {
        this.leitor = leitor;
        this.livro = livro;
    }
    //Exibe o leitor e o livro do emprestimo
    public void exibirDetalhes() {
        System.out.println("Empréstimo realizado:");
        leitor.exibirDetalhes();
        System.out.println(livro);
    }
}
