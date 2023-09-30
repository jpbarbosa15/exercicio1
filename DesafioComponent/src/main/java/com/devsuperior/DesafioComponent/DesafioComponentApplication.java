package com.devsuperior.DesafioComponent;

import com.devsuperior.DesafioComponent.entities.Order;
import com.devsuperior.DesafioComponent.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioComponentApplication implements CommandLineRunner {
	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioComponentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(2282,800,10);


		System.out.println("Pedido código " + order.getCode() );
		System.out.println("Valor total:" + orderService.OrderService(order));
	}
}
