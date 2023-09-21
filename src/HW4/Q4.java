package HW4;

import java.util.Scanner;
//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下：
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」
//(提示：Scanner，二維陣列)

// 員工編號      25      32      8        29        27
// 身上現金   2500   800   500   1000   1200

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("小華欲借的金額: ");

		int[][] money = { { 25, 32, 8, 29, 27 }, { 2500, 800, 500, 1000, 1200 } };
		int count = 0;
		int x = sc.nextInt();
		System.out.print("員工編號");
		for (int i = 1; i < money.length; i++) {
			for (int j = 0; j < money[i].length; j++) {
				
				if (x <= money[1][j]) {
					
					System.out.print( money[0][j] + " ");
					
					count += 1;
				}
				
			}

		}

		System.out.print("號可以借他，總共" + count + "人");
		
		
	}
}
