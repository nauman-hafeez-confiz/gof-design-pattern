package learning.design.pattern.gof.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplatePatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplatePatternApplication.class, args);

		OrderProcessTemplate orderProcessTemplate = new OnlineOrder();
		orderProcessTemplate.templateProcessOrder();
        System.out.println();
		orderProcessTemplate = new StoreOrder();
		orderProcessTemplate.templateProcessOrder();

	}

}
