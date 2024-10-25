public class Reserva {

    //Declaração de variáveis
    private Livro livro;
    private Leitor leitor;
    private String dataReserva;

    //Método construtor da classe, utiliza um livro e um leitor como parâmetro
    public Reserva(Livro livro, Leitor leitor){

        this.livro = livro;
        this.leitor = leitor;
        dataReserva = "*Dia de hoje*";
    }

    //Método toString da classe
    @Override
    public String toString() {
        return "Data da reserva: " + dataReserva +
                "\n Informações do livro: " + livro +
                "\n Informações do leitor: " + leitor;
    }
}
