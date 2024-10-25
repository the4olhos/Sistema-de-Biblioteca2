public class Funcionario extends Pessoa{

    //Declaração das variáveis
    private String matricula;
    private String cargo;

    //Método construtor da classe, utiliza Strings como parâmetros
    public Funcionario(String nome, String email, String matricula, String cargo) {
        super(nome, email);
        this.matricula = matricula;
        this.cargo = cargo;
    }

    //Método toString
    @Override
    public void exibirDetalhes(){

    };
}
