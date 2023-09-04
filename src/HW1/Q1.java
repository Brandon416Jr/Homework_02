package HW1;

// 請設計一隻Java程式，計算12，6這兩個數值的和與積

public class Q1 {
	public static void main(String[] args) {
		
		int a = 12, b = 6; //先設置整數變數代表6及12
		int sum = a + b; 
		int product = a * b; // 再分別設置兩個整數變數sum、product代表兩個數字的和以及積
		
		System.out.println("兩個數值之和為" + sum);
		System.out.println("兩個數值之積為" + product); // 最後再輸出
	}
}
