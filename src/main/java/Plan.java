/**
 * @author JeongInn
 */
public enum Plan {
	Gold(49.95, 14.50), Silver(29.95, 21.50);

	private final double basicMonthlyRate;
	private final double ratePerAdditionalLine;

	Plan(double basicMonthlyRate, double ratePerAdditionalLine) {
		this.basicMonthlyRate = basicMonthlyRate;
		this.ratePerAdditionalLine = ratePerAdditionalLine;
	}

	public double getBasicMonthlyRate() {
		return basicMonthlyRate;
	}

	public double getRatePerAdditionalLine() {
		return ratePerAdditionalLine;
	}
}
