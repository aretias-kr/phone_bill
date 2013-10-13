import static org.junit.Assert.*;

import org.junit.Test;


public class PhoneBillCalculatorTest {
	@Test
	public void should_return_0_when_every_rate_is_0() throws Exception {
		PhoneBillCalculator sut = new PhoneBillCalculator();
		assertEquals(0d, sut.getBill(new Account(), 0), 0);
	}
}
