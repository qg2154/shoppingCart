package onlineShop.log;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component means PaymentAction is a bean
@Component
public class PaymentAction {
	//@Autowired 让spring注入了一个instance
	@Autowired
	private Logger logger;
	
	public void pay(BigDecimal payValue) {
		logger.log("pay begin, payValue is " + payValue);
		logger.log("pay end");
	}
}
