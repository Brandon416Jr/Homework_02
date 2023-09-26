package HW3;
import java.util.Scanner;

// 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
// 三角形、其它三角形或不是三角形，如圖示結果：
// 正三角形: a = b = c
// 等腰三角形: a = b || b = c || a = c
// 直角三角形: a^2 + b^2 = c^2 (以此類推)
// 其他三角形: a + b > c (以此類推)

public class Q1 {
		public static void main(String[] args) {
				System.out.println("請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入三個整數");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				
				if (a == b && b == c) {
					System.out.println("正三角形");
				} else if (a == b || a == c || b == c) {
					System.out.println("等腰三角形");
				} else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (c * c + b * b == a * a)) {
					System.out.println("直角三角形");
				} else if ((a + b <= c) || (a + c <= b) || (c + b <= a)) {
					System.out.println("不是三角形");
				} else {
					System.out.println("其他三角形");
				}
		}
}