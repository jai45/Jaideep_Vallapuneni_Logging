package houseCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Standard extends HouseConstructionCost{
	public static final Logger logger = LogManager.getLogger(Standard.class);

	public double totalCost(double areaOfHouse)
	{
		logger.info("House uses standard Materials");
		double cost =1200*areaOfHouse;
		logger.error("Cost is"+cost);
		return cost;
	}
	
}
