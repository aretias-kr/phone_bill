import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PhoneBillCalculatorTest {
	private PhoneBillCalculator sut;
	private Account account;

	private int basicMonthlyRate = 0;
	private int rateForAdditionalLines = 0;
	private int rateForExcessMinutes = 0;
	
	@Before
	public void before() {
		sut = new PhoneBillCalculator();
		account = new FakeAccount();
	}
	private class FakeAccount extends Account {
		@Override
		public double getBasicMonthlyRate() {
			return basicMonthlyRate;
		}
		@Override
		public double getRateForAdditionalLines() {
			return rateForAdditionalLines;
		}
		@Override
		public double getRateForExcessMinutes(int usedMinutes) {
			return rateForExcessMinutes;
		}
	}
	@Test
	public void should_return_0_when_every_rate_is_0() throws Exception {
		assertEquals(0d, sut.getBill(account, 0), 0);
	}
	
	@Test
	public void should_return_9_when_every_rate_is_3() throws Exception {
		basicMonthlyRate = 3;
		rateForAdditionalLines = 3;
		rateForExcessMinutes = 3;
		assertEquals(9d, sut.getBill(account, 0), 0);
	}
}
