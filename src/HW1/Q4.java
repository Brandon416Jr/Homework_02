package HW1;

// 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長

public class Q4 {
	public static void main(String[] args) {
		
		final double PI = 3.1415; // 先把PI設置成常數宣告final
		int r = 5; // 宣告半徑為整數變數
		double area = PI * Math.pow(r, 2); 
		double circumference = 2 * PI * r; // 宣告圓面積、圓周長為浮點數變數型別，圓周長公式為2*圓周率*半徑，圓面積公式為半徑*圓周率平方 (利用Math.pow)
		
		System.out.printf("圓面積 = %.4f%n", area);
		System.out.printf("圓周長 = %.4f%n", circumference); // 輸出結果 (利用printf功能決定小數點位數)
	}

}
