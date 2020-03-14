import static org.junit.Assert.*;

import org.junit.Test;

import interest.CompoundInterest;
import interest.SimpleInterest;

public class interestTest {

	@Test
	public void test() {
		
		CompoundInterest ci = new CompoundInterest();
		assertEquals(1693.8979320000005,ci.calculateCompoundInterest(1200,9,4),0);
		
	}
	@Test
	public void test1()
	{
		SimpleInterest si = new SimpleInterest();
		assertEquals(432.0,si.calculateSimpleInterest(1200,9,4),0);	
	}

}
