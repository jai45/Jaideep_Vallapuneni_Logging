package interest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest {
	public static final Logger logger = LogManager.getLogger(CompoundInterest.class);
	public double calculateCompoundInterest(double principal,double interestRate,double timePeriod)
	{
		logger.info("in the compound interest method");
		
		double interest = principal*Math.pow((1+interestRate/100),timePeriod);
		logger.info("compound interest is"+interest);
		return interest;
	}
}
