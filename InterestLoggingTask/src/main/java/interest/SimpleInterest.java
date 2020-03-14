package interest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest {
	public static final Logger logger = LogManager.getLogger(SimpleInterest.class);
	
	public double calculateSimpleInterest(double principal,double rateOfInterest ,double time)
	{
		logger.error("in the simple interest method");
		double interest = (principal*time*rateOfInterest)/100;
		logger.info("Simple interest is"+interest);
		return interest;
		
	}
}
