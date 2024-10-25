public class Main {
    public static void main(String[] args) {

        //Instanciação de dois objetos Autor com parâmetros diferentes
        Autor autor1 = new Autor("Geoger Orwell", "orwell@email.com","Autor de clássicos como Revolução dos Bichos.");
        Autor autor2 = new Autor("Mark Zuckerberg", "zuckerberg@meta.com","Autor da obra Facebook, Instagram, entre outros.");

        //Intanciação de dois objetos Livro com parâmetros diferentes
        Livro livro1 = new Livro("1984", autor1);
        Livro livro2 = new Livro("1945", autor1);

        //Secção utilizada para demonstrar a funcionalidade de alteração do autor
        System.out.println(livro1);
        livro1.alterarAutor(autor2);
        System.out.println(livro1);

        //Instanciação de dois objetos Leitor com parâmetros distintos
        Leitor leitor1 = new Leitor("Maria Da Silva", "maria.silva@email.com", 101);
        Leitor leitor2 = new Leitor("Alexksandro Queiroz", "alezinho@reidelas.gov", 69);

        //Intânciação de um objeto Biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");

        //Adição de livros e registros de leitor à biblioteca, reperesentando a associação
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.registarLeitor(leitor1);
        biblioteca.registarLeitor(leitor2);

        //Exibição da lista de livros associados à biblioteca
        System.out.println("Livros na biblioteca:");
        biblioteca.exibirLivro();

        //Exibição da lista de leitores associados à biblioteca
        System.out.println("\nLeitores registrados:");
        biblioteca.eexibirLeitor();

        //Instanciação de um objeto Empréstimo, utilizando como parãmetros os objetos leitor1 e livro1
        Emprestimo emprestimo = new Emprestimo(leitor1, livro1);

        //Exibição de detalhes do empréstimo
        System.out.println("\nDetalhes do Empréstimo:");
        emprestimo.exibirDetalhes();

    }
}
