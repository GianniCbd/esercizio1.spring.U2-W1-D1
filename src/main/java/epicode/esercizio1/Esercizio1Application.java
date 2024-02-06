package epicode.esercizio1;

import epicode.esercizio1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Esercizio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Esercizio1Application.class);

//		Pizza pizza = (Pizza) ctx.getBean("pizza");
//		Toppings toppings = (Toppings) ctx.getBean("toppings");
		Menu menu = (Menu) ctx.getBean("menu");

		menu.printMenu();
		}
}

