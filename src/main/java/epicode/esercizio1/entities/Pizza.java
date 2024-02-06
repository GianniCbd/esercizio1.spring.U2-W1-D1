package epicode.esercizio1.entities;


import java.util.List;


public class Pizza implements PrezzoENome {

    private String nome;
    private double prezzoBase;
    private List<Toppings> condimenti;

    private int calories;
    public Pizza() {
    }

    public Pizza(String nome, double prezzoBase, int calories){
        this.nome = nome;
        this.prezzoBase = prezzoBase;
        this.calories = calories;
    }
    public Pizza(String nome, double prezzoBase, List<Toppings> condimenti, int calories) {
        this.nome = nome;
        this.prezzoBase = prezzoBase;
        this.condimenti = condimenti;
        this.calories = calories;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzoBase() {
        return prezzoBase;
    }

    public void setPrezzoBase(double prezzoBase) {
        this.prezzoBase = prezzoBase;
    }

    public List<Toppings> getCondimenti() {
        return condimenti;
    }

    public void setCondimenti(List<Toppings> condimenti) {
        this.condimenti = condimenti;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public double getPrices() {
        double totalPrice = prezzoBase;
        if (condimenti != null) {
            for (Toppings topping : condimenti) {
                totalPrice += topping.getPrezzo();
            }
        }
        return totalPrice;
    }

    @Override
    public String getName() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pizza " +
                "Gusti -> " + nome + '\'' +
                ", prezzo " + prezzoBase +
                ", calories " + calories +
                ' ';
    }
}
