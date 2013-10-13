import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PhoneBillCalculatorTest {
	private PhoneBillCalculator sut;
	private SpyAccount account;

	private int basicMonthlyRate = 0;
	private int rateForAdditionalLines = 0;
	private int rateForExcessMinutes = 0;
	
	@Before
	public void before() {
		sut = new PhoneBillCalculator();
		account = new SpyAccount();
	}
	
	private class SpyAccount extends Account {
		public int countOfBasicMonthlyRate = 0;
		public int countOfRateForAdditionalLines = 0;
		public int countOfRateForExcessMinutes = 0;
		@Override
		public double getBasicMonthlyRate() {
			countOfBasicMonthlyRate++;
			return basicMonthlyRate;
		}
		@Override
		public double getRateForAdditionalLines() {
			countOfRateForAdditionalLines++;
			return rateForAdditionalLines;
		}
		@Override
		public double getRateForExcessMinutes(int usedMinutes) {
			countOfRateForExcessMinutes++;
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
	
	@After
	public void tearDown() {
		assertEquals(1, account.countOfBasicMonthlyRate);
		assertEquals(1, account.countOfRateForAdditionalLines);
		assertEquals(1, account.countOfRateForExcessMinutes);
	}
}
