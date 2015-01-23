package ecp.prj;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class MultiplesCalculatorTest {

	private MultiplesCalculator calculator;
	
	@Before
	public void startUp() {
		calculator = new MultiplesCalculator();
	}
	
	@Test
	public void testGetSumUpTo1000() {
		assertEquals(233168, calculator.getSum(1000));
	}
}