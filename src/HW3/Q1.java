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
				
				int [] tri = new int [3];
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入三邊長：");
				if (sc.hasNextInt()) {
					tri[0] = sc.nextInt();
					tri[1] = sc.nextInt();
					tri[2] = sc.nextInt();
				}
				
				if (tri[0] * tri[1] * tri[2] != 0) {
					
					if ( tri[0] == tri[1] && tri [1] == tri[2]) {
						System.out.println("這是正三角形");
					} else if (tri[0] == tri[1] || tri[1] == tri[2]) {
						System.out.println("這是等腰三角形");
					} else if (Math.pow(tri[0], 2) + Math.pow(tri[1], 2) == Math.pow(tri[2], 2)
							|| Math.pow(tri[1], 2) + Math.pow(tri[2], 2) == Math.pow(tri[0], 2)
							|| Math.pow(tri[0], 2) + Math.pow(tri[2], 2) == Math.pow(tri[1], 2)) {
						System.out.println("這是直角三角形");
					} else if (tri[0] + tri[1] > tri[2] && tri[1] + tri[2] > tri[0] && tri[2] + tri[0] > tri[1]) {
						System.out.println("這是一般三角形");
					} else {
						System.out.println("這不是三角形");
					}
				} else {
				  System.out.println("這不是三角形");
				}
		}
}