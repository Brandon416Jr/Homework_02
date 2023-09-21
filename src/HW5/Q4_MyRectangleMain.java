package HW5;

//請另外建立一個MyRectangleMain類別，此類別只有main方法

//(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
//(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果

public class Q4_MyRectangleMain {
	public static void main(String[] args) {
		System.out.println("使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果");
		
		Q4_MyRectangle rec1 = new Q4_MyRectangle();
		rec1.setWidth(10);
		rec1.setDepth(20);
		
		System.out.println(rec1.getArea());
		System.out.println("==================================");
		
		System.out.println("使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果");
		
		Q4_MyRectangle rec2 = new Q4_MyRectangle(10, 20);
		System.out.println(rec2.getArea());
	}

}
