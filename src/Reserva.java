public class Reserva {

    private Livro livro;
    private Leitor leitor;
    private String dataReserva;


    public Reserva(Livro livro, Leitor leitor){

        this.livro = livro;
        this.leitor = leitor;
        dataReserva = "*Dia de hoje*";

    }

    @Override
    public String toString() {
        return "Data da reserva: " + dataReserva +
                "\n Informações do livro: " + livro +
                "\n Informações do leitor: " + leitor;
    }
}
