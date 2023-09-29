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
		int[][] colCash = {{25, 32, 8, 29, 27}, {2500, 800, 500, 1000, 1200}};
		Scanner sc = new Scanner(System.in);
		System.out.println("請問阿文需要借多少?");
		int needCash = sc.nextInt();
		System.out.print("有錢可借的員工編號: ");
		int count1 = 0;
		
		for (int i = 1; i < colCash.length; i++) {
			for (int m = 0; m < colCash[i].length; m++) {
				if (needCash <= colCash[1][m]) {
					System.out.print(colCash[0][m] + " ");
					count1 += 1;
				}
			}
		}
		System.out.println("總共" + count1 + "人");
		
		
	}
}
