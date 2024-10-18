public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Geoger Orwell", "orwell@email.com","Autor de clássicos como Revolução dos Bichos.");
        Autor autor2 = new Autor("Mark Zuckerberg", "zuckerberg@meta.com","Autor da obra Facebook, Instagram, entre outros.");

        Livro livro1 = new Livro("1984", autor1);
        Livro livro2 = new Livro("1945", autor1);
        System.out.println(livro1);
        livro1.alterarAltor(autor2);
        System.out.println(livro1);

        Leitor leitor1 = new Leitor("Maria Da Silva", "maria.silva@email.com", 101);
        Leitor leitor2 = new Leitor("Alexksandro Queiroz", "alezinho@reidelas.gov", 69);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.registarLeitor(leitor1);
        biblioteca.registarLeitor(leitor2);

        System.out.println("Livros na biblioteca:");
        biblioteca.exibirLivro();

        System.out.println("\nLeitores registrados:");
        biblioteca.eexibirLeitor();

        Emprestimo emprestimo = new Emprestimo(leitor1, livro1);
        System.out.println("\nDetalhes do Empréstimo:");
        emprestimo.exibirDetalhes();

    }
}