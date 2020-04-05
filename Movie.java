public class Movie {
	private String title;
	private int costperTicket;
	private int durationTime;
	private String description;
	
	public Movie(String title,int costperTicket, int durationTime, String descrption) {
		this.title = title;
		this.costperTicket = costperTicket;
		this.durationTime = durationTime;
		this.description = descrption;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String userTitle) {
		this.title = userTitle;
	}
	
	public int getCostperTicket() {
		return costperTicket;
	}
	public void setCostperTicket(int costperTicket) {
		if(this.costperTicket > 0) {
			this.costperTicket = costperTicket;
		}
		else {
			System.out.println("Movies are not free silly");
		}
	}
	public int getDurationTime() {
		return durationTime;
	}
	public void setDurationTime(int durationTime) {
		this.durationTime = durationTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}