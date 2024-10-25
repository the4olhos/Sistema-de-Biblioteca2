abstract class Pessoa {

    //Declaração das variáveis
    protected  String nome;
    protected  String email;

    //Método construtor da classe
    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    //Método abstrato para exibição de dados
    public abstract  void exibirDetalhes();
}
