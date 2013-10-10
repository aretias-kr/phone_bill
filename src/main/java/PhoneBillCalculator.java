/**
 * @author JeongInn
 */
public class PhoneBillCalculator {
	public double getBill(Account account, int usedMinutes) {
		return account.getBasicMonthlyRate() + account.getRateForAdditionalLines() + account.getRateForExcessMinutes(usedMinutes);
	}
}
