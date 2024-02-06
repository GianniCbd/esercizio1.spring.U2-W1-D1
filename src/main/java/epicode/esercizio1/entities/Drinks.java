package epicode.esercizio1.entities;

public class Drinks implements PrezzoENome{

    private String nome;
    private double prezzo;

    public Drinks() {
    }

    public Drinks(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public double getPrices() {
        return prezzo;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String toString() {
        return "Bevande " +
                nome + ' ' +
                 prezzo +
                ' ';
    }
}
