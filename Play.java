
public class Play {
	private String title; 
	private int costPerTicket;
	private String description;
	
	public Play(String title, int costPerTicket, String description) {
		this.title = title;
		this.costPerTicket = costPerTicket;
		this.description = description;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String userTitle) {
		this.title = userTitle;
	}
	
	public int getCostPerTicket() {
		return costPerTicket;
	}
	
	public void setCostPerTicket(int costperTicket) {
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
	
	
}
