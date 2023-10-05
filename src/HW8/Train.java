package HW8;

public class Train {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
//	public Train(int number, String type String start, String dest, double price) {
//		// TODO Auto-generated constructor stub
//	}

	public void Train() {
		
	}
	
	public void Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setStart(String start) {
		this.start = start;
	}
	
	public String getStart() {
		return start;
	}
	
	public void setDest(String dest) {
		this.dest = dest;
	}
	
	public String getDest() {
		return dest;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}
