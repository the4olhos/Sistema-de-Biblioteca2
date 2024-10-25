public class Leitor extends Pessoa {
    //Atributos da subclasse leitor 
    private int numeroDeLeitor;

    //construtor da subclasse, que recebe como parametro o nome, email e numero do leitor
    public Leitor(String nome, String email, int numeroDeLeitor) {
        super(nome, email);
        this.numeroDeLeitor = numeroDeLeitor;
    }

    //Metodo para reservar livro recebe um livro e um leitor como parametro
    public void reservarLivro(Livro livro, Leitor leitor){
        Reserva reserva = new Reserva(livro, leitor);
    }

    //Sobreescreve o metodo de pessoa que exibe os detalhes do leitor
    @Override
    public void exibirDetalhes() {
        System.out.println(this.nome);
        System.out.println(this.email);
        System.out.println(this.numeroDeLeitor);
    }

    //Mesma função do metodo exibirDetalhes
    @Override
    public String toString() {
        return "Leitor: " + nome + " - E-mail: " + email +
                "\nNúmero de leitor: " + numeroDeLeitor;
    }
}
