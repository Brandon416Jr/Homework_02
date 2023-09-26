package HW3;
import java.util.Scanner;

// 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
// 對則顯示正確訊息，如圖示結果：


public class Q2 {
	public static void main(String[] args) {
		
		int r = (int)(Math.random() *10);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("請輸入你猜的數字");
		int guess = sc1.nextInt();
		for (int i = 1;;) {
			if (guess == r) {
				System.out.println("答對了!答案就是" + r);
				break;
			} else {
				System.out.println("答錯了!");
				guess = sc1.nextInt();
			}
		}
		
		System.out.println("=====================================\n");
		
		System.out.println("2. 產生0～100亂數，每次猜就會提示你是大於還是小於正確答案");
		
		int k = (int)(Math.random() *101);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("請輸入你猜的數字");
		int guess1 = sc2.nextInt();
		for (int i = 0;;) {
			if (guess1 == k) {
				System.out.println("答對了!答案就是" + k);
				break;
			} else if (guess1 >= k) {
				System.out.println("輸入的數字太大，請再輸入一個小於" + guess1 + "的數字");
				guess1 = sc2.nextInt();
			} else if (guess1 <= k) {
				System.out.println("輸入的數字太小，請再輸入一個大於" + guess1 + "的數字");
				guess1 = sc2.nextInt();
			}
		}
	}

}
