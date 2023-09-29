package HW7;

import java.io.Serializable;

public class Pets implements Serializable{
	private static final long serialVersionUID = 8315449942815314809L;
	private String name;
	
	public Pets() {
	}
	
	public Pets(String name) {
		this.setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	 public void speak() {
		 	 
	 }
}
