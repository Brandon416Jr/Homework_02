package HW6;

import java.util.*;

public class CalTest {
	public static void main(String[] args) {

		try {
			Calculator c1 = new Calculator(3, 2);
			System.out.println(c1.powerXY(c1.getx(), c1.gety()));
			
			Calculator c2 = new Calculator(0, 0);
			System.out.println(c2.powerXY(c2.getx(), c2.gety()));
			
			Calculator c3 = new Calculator(7, -3);
			System.out.println(c3.powerXY(c3.getx(), c3.gety()));
			
		} catch (CalException e) {
			System.out.println(e.getMessage());
		}
	}

}


