package HW3;
import java.util.Scanner;

//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖

public class Q3 {
	public static void main(String[] args) {
		Scanner sc3 = new Scanner(System.in);
		System.out.println("阿文...你討厭甚麼數字");
		int lotteryNum = sc3.nextInt();

		while (lotteryNum == 0 || lotteryNum > 9) {
			System.out.println("亂寫!給我再說一個1~9的數字!");
			lotteryNum = sc3.nextInt();
		}
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != lotteryNum && i / 10 != lotteryNum) {
				count += 1;
				System.out.print(i + "\t");
				if (count % 7 == 0) {
					System.out.println("");
				}
			}
		}
		System.out.println("總共" + count + "個數字可以選擇");
		
		System.out.println("=====================================\n");
		
		System.out.println("進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重覆");
		int[] finalLottery = new int[6];
		System.out.print("電腦選號為: ");
		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 48 + 1);
			if (num % 10 != lotteryNum && num / 10 != lotteryNum) {
				finalLottery[i] = num;
				System.out.print(finalLottery[i] + "\t");
			} else {
				i--;
			}
			
		}
		
	}
}
