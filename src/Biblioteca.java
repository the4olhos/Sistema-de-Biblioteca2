import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    //Atributos da classe 
    private String nome;
    private List<Livro> livros;
    private Leitor leitor;
    private List<Leitor> leitores;

    //Construtor da classe (exige nome como parametro)
    public Biblioteca(String nome) {
        this.nome = nome;
        this.leitores = new ArrayList<>();
        this.livros = new ArrayList<>();
    }

    //Método que adiciona livros à biblioteca, caso o número total não exceda 5.
    public void adicionarLivro(Livro livro) {
        if (livros.size() > 5) {
            System.out.println("A biblioteca não pode receber mais livros");
        } else {
            livros.add(livro);
        }
    }

    //Método que realiza o registro do leitor, caso o número total não exceda 5
    public void registarLeitor(Leitor leitor) {
        if (leitores.size() > 5) {
            System.out.println("A biblioteca não pode aceitar mais leitores");
        } else {
            leitores.add(leitor);
        }
    }

    //Verifica se existem livros nessa biblioteca e os exibe caso existam
    public void exibirLivro() {
        if (livros != null) {
            for (Livro livro: livros){
                System.out.println(livro);
            }
        } else {
            System.out.println("Nenhum livro disponível na biblioteca.");
        }
    }

    //Verifica se existem leitores nessa biblioteca e os exibe caso existam
    public void eexibirLeitor() {
        if (leitores != null) {
            for (Leitor leitor: leitores){
                System.out.println(leitor);
            }
        } else {
            System.out.println("Nenhum leitor registrado na biblioteca.");
        }
    }
}
