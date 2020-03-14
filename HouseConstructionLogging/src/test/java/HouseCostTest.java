import static org.junit.Assert.*;

import org.junit.Test;

import houseCost.HouseConstructionCost;
import houseCost.TypeOfHouse;

public class HouseCostTest {

	@Test
	public void test() {
		TypeOfHouse t =new TypeOfHouse();
		HouseConstructionCost h=t.type("standard", false);
		assertEquals(150000,h.totalCost(125),0);
	}
	@Test
	public void test1()
	{
		TypeOfHouse t =new TypeOfHouse();
		HouseConstructionCost h=t.type("above standard", false);
		assertEquals(187500,h.totalCost(125),0);
	}
	@Test
	public void test2()
	{
		TypeOfHouse t =new TypeOfHouse();
		HouseConstructionCost h=t.type("high standard", false);
		assertEquals(180000,h.totalCost(100),0);
	}
	@Test
	public void test3()
	{
		TypeOfHouse t =new TypeOfHouse();
		HouseConstructionCost h=t.type("high standard", true);
		assertEquals(250000,h.totalCost(100),0);
	}
	@Test
	public void test4()
	{
		TypeOfHouse t =new TypeOfHouse();
		HouseConstructionCost h=t.type("standardxfcgvhbjnd", false);
		assertNull(h);
	}

}
