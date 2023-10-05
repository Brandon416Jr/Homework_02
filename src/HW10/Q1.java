package HW10;

//請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否
//為質數 (提示：Math類別)

public class Q1 {
	public static void main (String[] args) {
		int[] random = new int[5];
		start:
		for (int i = 0; i <5;i++) {
			random[i] = (int)((Math.random() * 100) + 1);
//			System.out.print(random[i]);
			for (int j = 2; j < random[i]; j++) {
				if (random[i] > 1 && random[i] % j != 0) {
//					System.out.println(random[i] + "為質數");
				} else {
					System.out.println(random[i] + "不為質數");
					continue start;
				}
			}
			System.out.println(random[i] + "為質數");
		}
		
		
	}
}
