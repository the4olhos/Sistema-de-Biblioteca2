public class Funcionario extends Pessoa{

    private String matricula;
    private String cargo;

    public Funcionario(String nome, String email, String matricula, String cargo) {
        super(nome, email);
        this.matricula = matricula;
        this.cargo = cargo;
    }
    @Override
    public void exibirDetalhes(){

    };
}
