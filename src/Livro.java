public class Livro {
    private String titulo;
    private Autor autor;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void alterarAltor(Autor autor){
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + autor;
    }
}