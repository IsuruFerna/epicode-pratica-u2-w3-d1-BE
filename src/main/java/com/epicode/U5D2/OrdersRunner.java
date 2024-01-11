package com.epicode.U5D2;

import com.epicode.U5D2.dao.PizzaService;
import com.epicode.U5D2.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class OrdersRunner implements CommandLineRunner {
	@Autowired
	PizzaService pizzaService;
	@Override
	public void run(String... args) throws Exception {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D2Application.class);

		pizzaService.save(ctx.getBean("pizza_margherita", Pizza.class));
//		System.out.println(ctx.getBean("pizza_margherita", Pizza.class));
//		try {
//			Menu m = (Menu) ctx.getBean("menu");
//			m.printMenu();
//
//			Table t1 = (Table) ctx.getBean("Tavolo1");
//
//			Order o1 = new Order(4, t1);
//
//			o1.addItem(ctx.getBean("pizza_margherita", Pizza.class));
//			o1.addItem(ctx.getBean("hawaiian_pizza", Pizza.class));
//			o1.addItem(ctx.getBean("salami_pizza_xl", Pizza.class));
//			o1.addItem(ctx.getBean("lemonade", Drink.class));
//			o1.addItem(ctx.getBean("lemonade", Drink.class));
//			o1.addItem(ctx.getBean("wine", Drink.class));
//
//			System.out.println("DETTAGLI TAVOLO 1:");
//			o1.print();
//
//			System.out.println("CONTO TAVOLO 1");
//			System.out.println(o1.getTotal());


//
//
//		} catch (Exception ex) {
//			System.err.println(ex.getMessage());
//		} finally {
//			ctx.close();
//		}
	}
}
