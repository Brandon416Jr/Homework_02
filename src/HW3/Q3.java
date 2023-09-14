package HW3;
import java.util.Scanner;

//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖

public class Q3 {
	public static void main(String[] args) {
		System.out.println("請您設計一隻程式，讓阿文 可以輸入他不想要的數字，畫面會顯示他可以選擇的號碼與總數");
		int n=0;
		int n10, n1;
		int amount =0;

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？");
		n =sc.nextInt();
		for (n10=0; n10<=4; n10++) {
			if (n10 == n) {
				continue;
			}
			for (n1=0; n1<=9; n1++) {
					if (n1 == n) {
						continue;					
					}
					if (n1 != 0 && n10 == 0) {
						System.out.print(n1 + " ");
						amount = amount+1;
					}
					else if (n10 >0) {
						System.out.print(n10 +""+n1 + " ");
						amount = amount+1;
					}
			}
		}
								
		System.out.println();
		System.out.println("總共個數："+ amount);
		
//進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重覆
		int r;
		String[] all = new String[amount];
		int i=0;
		for (n10=0; n10<=4; n10++) {
			if (n10 == n) {
				continue;
			}
			for (n1=0; n1<=9; n1++) {
					if (n1 == n) {
						continue;					
					}
					if (n1 != 0 && n10 == 0) {
						all[i]=n1+"";
						i = i+1;
					}
					else if (n10 >0) {
						all[i]=n10+""+n1;
						i = i+1;
					}
			}
		}
		System.out.println("亂數印出6個不重覆號碼給阿文：");
		for(int j=0;j<6;j++) {
		r=(int)(Math.random()*35);
			if(all[r]!="0") {
				System.out.print(all[r]+" ");
				all[r]="0";
				}
		}
		
	}
}
