package houseCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HighStandardAutomated extends HouseConstructionCost{
	public static final Logger logger = LogManager.getLogger(HighStandardAutomated.class);

	public double totalCost(double areaOfHouse)
	{
		logger.info("House uses High standard Materials and automated");
		double cost =2500*areaOfHouse;
		logger.error("Cost is"+cost);
		return cost;
	}
	
}
