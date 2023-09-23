package HW6;



public class CalTest {
	public static void main(String[] args) {
		
		try {
		Calculator c1 = new Calculator();
		System.out.println(c1.powerXY(4, 2));
		
		Calculator c2 = new Calculator();
		System.out.println(c2.powerXY(0, 0));
		
		Calculator c3 = new Calculator();
		System.out.println(c3.powerXY(5, -5));
		
		} catch (CalException e) {
			e.printStackTrace();
		}
	}

}
