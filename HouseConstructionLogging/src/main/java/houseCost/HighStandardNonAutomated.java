package houseCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HighStandardNonAutomated extends HouseConstructionCost{
	public static final Logger logger = LogManager.getLogger(HighStandardNonAutomated.class);

	public double totalCost(double areaOfHouse)
	{
		logger.info("House uses High standard Materials and is non automated");
		double cost =1800*areaOfHouse;
		logger.warn("Cost is"+cost);
		return cost;
	}
	
}
