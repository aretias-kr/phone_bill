/**
 * @author JeongInn
 */
public class Account {
	private static final int FAMILY_DISCOUNT_BOUNDARY = 2;
	
	private Plan plan;
	private int additionalLines;
	
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public void setAdditionalLines(int additionalLines) {
		this.additionalLines = additionalLines;
	}
	public double getBasicMonthlyRate() {
		return plan.getBasicMonthlyRate();
	}
	public double getRateForAdditionalLines() {
		if (additionalLines <= FAMILY_DISCOUNT_BOUNDARY) {
			return additionalLines * plan.getRatePerAdditionalLine();
		}

		return FAMILY_DISCOUNT_BOUNDARY * plan.getRatePerAdditionalLine() + (additionalLines - FAMILY_DISCOUNT_BOUNDARY) * 5;
	}
	public double getRateForExcessMinutes(int usedMinutes) {
		int excessMinutes = plan.getIncludedMinutes() - usedMinutes;
		if (excessMinutes > 0) {
			return plan.getRatePerExcessMinute() * excessMinutes;
		}
		return 0;
	}
}
