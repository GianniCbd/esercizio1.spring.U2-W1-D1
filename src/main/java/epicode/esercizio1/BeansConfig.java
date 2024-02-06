package epicode.esercizio1;

import epicode.esercizio1.entities.Drinks;
import epicode.esercizio1.entities.Menu;
import epicode.esercizio1.entities.Pizza;
import epicode.esercizio1.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeansConfig {

    @Bean(name = "pizza")
   public Pizza margherita(){
        return new Pizza("Margherita",4.50,700);
    }
    @Bean
    public Pizza marinaraPizza() {
        return new Pizza("Marinara", 3.50 , List.of(pomodoroTopping(), aglioTopping()),600);
    }
    @Bean
    public Pizza BoscaiolaPizza() {
        return new Pizza("Boscaiola", 4.50 , List.of(funghiPorciniTopping(), aglioTopping(),pannaTopping()),850);
    }

    //toppings*******************************************
    @Bean
    public Toppings pomodoroTopping() {
        return new Toppings("Pomodoro", 0.50);
    }
    @Bean
    public Toppings mozzarellaTopping() {
        return new Toppings("Mozzarella", 1.00);
    }
    @Bean
    public Toppings pannaTopping(){
        return new Toppings("Panna", 0.50);
    }
    @Bean
    public Toppings funghiPorciniTopping() {
        return new Toppings("Funghi", 2.00);
    }
    @Bean
    public Toppings aglioTopping() {
        return new Toppings("Aglio", 0.25);
    }
    @Bean
    public Toppings CottoTopping() {
        return new Toppings("ProsciuttoCotto", 1.00);
    }

    //Drinks***************************************************
    @Bean
    public Drinks cokeDrink() {
        return new Drinks("Coca-cola", 2.50);
    }
    @Bean
    public Drinks birraDrink() {
        return new Drinks("Birra(0,33)", 4.00);
    }
    @Bean
    public  Drinks Acqua(){
        return new Drinks("Acqua(1L)",1.50);
    }
    @Bean(name = "menu")
    public Menu menu(List<Pizza> pizze, List<Toppings> condimenti, List<Drinks> bevande) {
        return new Menu(pizze, condimenti, bevande);
    }

}
