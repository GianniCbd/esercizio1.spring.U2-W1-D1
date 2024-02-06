package epicode.esercizio1.entities;

public class Toppings implements PrezzoENome {

    private String nome;
    private double prezzo;

    public Toppings() {
    }

    public Toppings(String nome, double prezzo) {
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
        return nome;
    }

    @Override
    public String toString() {
        return "Condimenti " +
                 nome +
                " "+prezzo +
                ' ';
    }
}
