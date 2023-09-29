package HW7;

import java.io.Serializable;

public class Cat extends Pets implements Serializable{
	private static final long serialVersionUID = 8315449942815314809L;
	private String name;
	
	public Cat(String name) {
		super(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
