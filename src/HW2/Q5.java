package HW2;

/* 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
輸出結果為阿文可以選擇的數字有哪些？總共有幾個？ */

public class Q5 {
	public static void main(String[] args) {
		
		int i = 1;
		int j = 0;
		for (i = 1; i <= 49; i ++) {
			
			if (i >= 40 && i <= 49) {
				continue;
			} else if ((i - 4) % 10 == 0) {
				continue;
			} else {
			System.out.print(i + "\t");			
			j +=1;
			}
			
		}
		System.out.println("");
		System.out.println("總共有" + j + "個數字");
	}

}
