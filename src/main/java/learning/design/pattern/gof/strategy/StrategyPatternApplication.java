package learning.design.pattern.gof.strategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrategyPatternApplication.class, args);
		PaymentContext paymentContext = new PaymentContext();
		paymentContext.setStrategy(new PaymentByCardCredit());
		paymentContext.payment("1000");
	}

}
