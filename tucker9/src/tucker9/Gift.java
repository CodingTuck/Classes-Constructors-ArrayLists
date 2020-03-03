package tucker9;

public class Gift {
	//declare private attributes
	private String recipient;
	private String description;
	private double price;
	private int qty;
	//attribute to calculate number of people receiving gifts
	public static int recipients = 0;
	
	//declare parameterized constructor
	public Gift(String recipientName, String describe, double total, int amount) {
		recipient = recipientName;
		description = describe;
		price = total;
		qty = amount;
		recipients++;
		
	}
	//declare getters and setters
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String newRecipient) {
		this.recipient = newRecipient;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String newDescription) {
		this.description = newDescription;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	
	public int getQty() {
		return qty;
	}
	public void setQty(int newQty) {
		this.qty = newQty;
	}
	
	//method to calculate amount spent on each individual
	public void giftVals() {
		System.out.println("Spent on " + recipient + ": $" + price*qty);
	}
	
	//method to show the value of the objects attributes
	public String toString() {
		return recipient + ", gift " + description + ", " + price + ", quantity " + qty;
	}
}
