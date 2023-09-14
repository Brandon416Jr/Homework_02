package HW3;
import java.util.Scanner;

// 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
// 對則顯示正確訊息，如圖示結果：


public class Q2 {
	public static void main(String[] args) {
		
		System.out.println("請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息");
		
		int ans;
	    ans = (int) (Math.random() *10);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入你猜的數字 (範圍0~9): ");
		
		for (int x=0; x != ans;) {
			if (sc.hasNextInt()) {
				x = sc.nextInt();	
				} else {
					System.out.println("請輸入整數！");
				break;
				}
				if (x == ans) {
				System.out.println("答對了！答案就是"+ans);
				break;
				} else if (x < ans) {
					System.out.println("猜錯囉！請猜大一點!");
					}	else if (x > ans) {
						System.out.println("猜錯囉！請猜小一點!");
					}
		}
	}

}
