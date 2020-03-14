package houseCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TypeOfHouse {
	public static final Logger logger = LogManager.getLogger(TypeOfHouse.class);

	public HouseConstructionCost type(String standard,boolean automated)
	{
		if(standard.equalsIgnoreCase("standard"))
		{
			logger.info("Standard materials");
			return new Standard();
		}
		else if(standard.equalsIgnoreCase("above standard"))
		{
			logger.info("Above Standard materials");
			return new AboveStandard();
		}
		else if(standard.equalsIgnoreCase("high standard"))
		{
			logger.info("High Standard materials");
			if(automated==true)
			{
				logger.info("And Automated");
				return new HighStandardAutomated();
			}
			else
			{
				logger.info("Non Automated");
				return new HighStandardNonAutomated();
			}
		}
		return null;
	}
	
}
