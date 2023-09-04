package HW2;

/* 請設計一隻Java程式，輸出結果為以下：
1 4 9 16 25 36 49 64 81 100 */

public class Q4 {
	public static void main(String[] args) {
		int i = 1;
		int product = 1;
		do {
			product =(int) Math.pow(i, 2); // Math.pow只能用在double型別變數，所以要先強制轉成int
			System.out.print(product + "\t");
			i++;
		} while (i <= 10);
		
		
	}

}
