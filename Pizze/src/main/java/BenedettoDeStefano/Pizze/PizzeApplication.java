package BenedettoDeStefano.Pizze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class PizzeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzeApplication.class, args);
		ciaoMondo();

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PizzeApplication.class);

		log.info("Godfather's Pizza - Menu");
		log.info("=========================");
		log.info("Pizze:");
		log.info("------");
		log.info("{}", ctx.getBean("margherita"));
		log.info("{}", ctx.getBean("prosciutto"));
		log.info("{}", ctx.getBean("hawaiiPizza"));

		log.info("Bevande:");
		log.info("--------");
		log.info("{}", ctx.getBean("cocacola"));
		log.info("{}", ctx.getBean("fanta"));

		log.info("Merchandise:");
		log.info("------------");
		log.info("{}", ctx.getBean("tshirt"));
		log.info("{}", ctx.getBean("tazza"));

		ctx.close();
	}

	public static void ciaoMondo() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PizzeApplication.class);
		log.info(ctx.getBean("Hello").toString());
		ctx.close();
	}
}
