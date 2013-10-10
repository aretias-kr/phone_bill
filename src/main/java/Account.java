/**
 * @author JeongInn
 */
public class Account {
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
		return additionalLines * plan.getRatePerAdditionalLine();
	}
}
