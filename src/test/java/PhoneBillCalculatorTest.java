import static org.junit.Assert.*;

import org.junit.Test;


public class PhoneBillCalculatorTest {
	@Test
	public void should_return_0_when_every_rate_is_0() throws Exception {
		PhoneBillCalculator sut = new PhoneBillCalculator();
		Account account = new Account() {
			@Override
			public double getBasicMonthlyRate() {
				return 0;
			}
			@Override
			public double getRateForAdditionalLines() {
				return 0;
			}
			@Override
			public double getRateForExcessMinutes(int usedMinutes) {
				return 0;
			}
			
		};
		assertEquals(0d, sut.getBill(account, 0), 0);
	}
	
	@Test
	public void should_return_9_when_every_rate_is_3() throws Exception {
		PhoneBillCalculator sut = new PhoneBillCalculator();
		Account account = new Account() {
			@Override
			public double getBasicMonthlyRate() {
				return 3;
			}
			@Override
			public double getRateForAdditionalLines() {
				return 3;
			}
			@Override
			public double getRateForExcessMinutes(int usedMinutes) {
				return 3;
			}
		};
		assertEquals(9d, sut.getBill(account, 0), 0);
	}
}
