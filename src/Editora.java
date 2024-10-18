import java.util.ArrayList;
import java.util.List;

public class Editora {

    private List<Livro> livros;
    private String editora;

    public Editora(String editora){
        this.editora = editora;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
}
