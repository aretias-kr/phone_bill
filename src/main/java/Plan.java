/**
 * @author JeongInn
 */
public enum Plan {
	Gold(49.95, 14.50, 1000, 0.45), Silver(29.95, 21.50, 500, 0.54);

	private final double basicMonthlyRate;
	private final double ratePerAdditionalLine;
	private final int includedMinutes;
	private final double ratePerExcessMinute;

	private Plan(double basicMonthlyRate, double ratePerAdditionalLine, int includedMinutes, double ratePerExcessMinute) {
		this.basicMonthlyRate = basicMonthlyRate;
		this.ratePerAdditionalLine = ratePerAdditionalLine;
		this.includedMinutes = includedMinutes;
		this.ratePerExcessMinute = ratePerExcessMinute;
	}

	public double getBasicMonthlyRate() {
		return basicMonthlyRate;
	}

	public double getRatePerAdditionalLine() {
		return ratePerAdditionalLine;
	}

	public int getIncludedMinutes() {
		return includedMinutes;
	}

	public double getRatePerExcessMinute() {
		return ratePerExcessMinute;
	}
}
