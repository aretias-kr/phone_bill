/**
 * @author JeongInn
 */
public class PhoneBillCalculator {
	public double getBill(Account account) {
		return account.getBasicMonthlyRate() + account.getRateForAdditionalLines();
	}
}
