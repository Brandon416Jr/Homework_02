package HW1;

// 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//金加利息共有多少錢 (用複利計算，公式請自行google)

// 複利公式: FV = PV * (1 + r)^n

public class Q5 {
	public static void main(String[] args) {
		
		int initial = 1500000, year = 10; // 先設置本金、存錢年數為整數變數型態
		double rate = 0.02; // 設置利率為浮點數變數型態
		double finalMoney = initial * Math.pow(1 + rate, year); // 將最終會有的錢利用複利公式設置為浮點數變數型態
		
//		System.out.println(year + "年後，本金加利息共有" + finalMoney + "元");  
//		
//		System.out.println(year + "年後，本金加利息共有" + (int)finalMoney + "元");
//		
//		System.out.printf("10年後，本金加利息共有%.0f元%n", finalMoney);
		
		System.out.printf("%d年後，本金加利息共有%.0f元", year, finalMoney); // 輸出結果，%d為整數，只要用一對""標起來就好，""裡面順序跟外面變數放置順序一樣
	}

}
