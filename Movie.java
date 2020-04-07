public class Movie {
	private String title;
	private double costPerTicket;
	private String durationTime;
	private String description;
	private int numTickets;
	private String seats;
	
	public Movie(int numTickets, String seats) {
		this.numTickets = numTickets;
		this.seats = seats;
	}
	
	public Movie(String title, double costPerTicket, String durationTime, String descrption) {
		this.title = title;
		this.costPerTicket = costPerTicket;
		this.durationTime = durationTime;
		this.description = descrption;	
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
	
	public void setCostPerTicket(double costPerTicket) {
		if(this.costPerTicket > 0) {
			this.costPerTicket = costPerTicket;
		}
		else {
			System.out.println("Movies are not free silly");
		}
	}
	
	public String getDurationTime() {
		return durationTime;
	}
	
	public void setDurationTime(String durationTime) {
		this.durationTime = durationTime;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String displaySeats() {
		return "a b c d e f g h i j k l m" 
				+ "\n n o p q r s t u v w x y z" 
				+ "\n A B C D E F G H I J K L M"
				+ "\n N O P Q R S T U V W X Y Z";
	}
	
	public int getNumTickets () {
		return numTickets;
	}
	
	public void setNumTickets(int numTickets) {
		this.numTickets = numTickets;
	}
	
	public String getSeats() {
		return seats;
	}
	
	public void setSeats (String seats) {
		this.seats = seats;
	}
	
}
