package epicode.esercizio1.entities;


import java.util.List;


public class Menu {
    private List<Pizza> pizze;
    private List<Toppings> condimenti;
    private List<Drinks> bevande;

    public Menu() {
    }

    public Menu(List<Pizza> pizze, List<Toppings> condimenti, List<Drinks> bevande) {
        this.pizze = pizze;
        this.condimenti = condimenti;
        this.bevande = bevande;
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public List<Toppings> getCondimenti() {
        return condimenti;
    }

    public void setCondimenti(List<Toppings> condimenti) {
        this.condimenti = condimenti;
    }

    public List<Drinks> getBevande() {
        return bevande;
    }

    public void setBevande(List<Drinks> bevande) {
        this.bevande = bevande;
    }

    public void printMenu() {
        System.out.println("**Benvenuti nel nostro delizioso menù!**");
        System.out.println(" **Pizze deliziose:**");
        for (Pizza pizza : pizze) {
            if (pizza.getCondimenti() == null || pizza.getCondimenti().isEmpty()) {
                System.out.println("\t- " + pizza.getNome() + " - " + pizza.getPrezzoBase() + "€");
            } else {
                System.out.println("\t- " + pizza.getNome() + " - " + pizza.getPrices() + "€");
            }
        }


        System.out.println("\n **Condimenti sfiziosi:**");
        for (Toppings topping : condimenti) {
            System.out.println("\t- " + topping + "€");
        }

        System.out.println("\n **Bevande:**");
        for (Drinks drink : bevande) {
            System.out.println("\t- " + drink + "€");
        }

        System.out.println("\n Quale pizza preferisci?");
    }

    @Override
    public String toString() {
        return "Menu " +
                "pizze=" + pizze +
                ", condimenti=" + condimenti +
                ", bevande=" + bevande +
                ' ';
    }

}
