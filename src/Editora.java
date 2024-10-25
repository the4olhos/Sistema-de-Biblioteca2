import java.util.ArrayList;
import java.util.List;

public class Editora {

    //Declaração de variáveis
    private List<Livro> livros;
    private String editora;

    //Método construtor da classe
    public Editora(String editora){
        this.editora = editora;
        this.livros = new ArrayList<>();
    }

    //Método para adicionar livros, demonstrando a associação de objetos
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
}
