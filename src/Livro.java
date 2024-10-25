public class Livro {

    //Declaração de variáveis
    private String titulo;
    private Autor autor;
    
    //Método construtor da classe, utilizando um objeto Autor e uma string
    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //Função para realizar alteração do autor
    public void alterarAutor(Autor autor){
        this.autor = autor;
    }

    //Método toString
    @Override
    public String toString() {
        return "Livro: " + titulo + autor;
    }
}
