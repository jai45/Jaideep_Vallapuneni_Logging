package houseCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class AboveStandard extends HouseConstructionCost{
	public static final Logger logger = LogManager.getLogger(AboveStandard.class);

	public double totalCost(double areaOfHouse)
	{
		logger.info("House uses Above standard Materials");
		double cost =1500*areaOfHouse;
		logger.error("Cost is"+cost);
		return cost;
	}
}
