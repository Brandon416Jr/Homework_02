package HW2;

// 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)

public class Q1 {
	public static void main(String[] args) {
		 int i =1;
		 int sum = 0;
		 for (i=1; i <= 1000; i++) {
			 if (i % 2 == 1) {
				 continue; // 若i除以2的餘數為1 (奇數)，則執行continue到迴圈，偶數則繼續往下
			 }
			 sum = sum + i;
		 }
		 System.out.println(sum);
	}

}
