package HW1;

//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5”

public class Q6 {
	public static void main(String[] args) {
		
		int r = 5; // 設置每個式子左邊的5為整數型態
		int a = 5; // 設置第一個式子右邊的5為整數型態
		char b = '5'; // 設置第二個式子右邊的'5'為字元型態
		String s = "5"; // 設置第三個式子右邊的"5"為字串
		
		System.out.println(r + a); // 答案應為10，因為其為兩個數值相加
		System.out.println(r + b); // 答案應為58，因為一個是字元字串，先去unicode可以找到5對應到unicode為35 (16進位)，其十進位為53，因此加起來=58
		System.out.println(r + s); // 答案應為55，因為其為一個數值+一個字串，只會黏在一起而已
		System.out.println(5 + '5' );
	}

}
