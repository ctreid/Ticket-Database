
public class Play {
	private String title; 
	private double costPerTicket;
	private String description;
	private String showTimes;
	
	public Play(String title, double costPerTicket, String description, String showTimes) {
		this.title = title;
		this.costPerTicket = costPerTicket;
		this.description = description;
		this.showTimes = showTimes;
	}
	
	public Play() {
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String userTitle) {
		this.title = userTitle;
	}
	
	public double getCostPerTicket() {
		return costPerTicket;
	}
	
	public void setCostPerTicket(double costperTicket) {
		if(this.costPerTicket > 0) {
			this.costPerTicket = costperTicket;
		}
		else {
			System.out.println("Movies are not free silly");
		}
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getShowTimes() {
		return showTimes;
	}
	
	public void setShowTimes(String showTimes) {
		this.showTimes = showTimes;
	}
	
	
}
