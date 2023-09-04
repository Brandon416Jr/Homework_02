package HW1;

// 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)

public class Q2 {
	public static void main(String[] args) {
		
		int total = 200, dozen = total / 12, amount = total % 12; // 先設置總數為整數變數total，再分別設置兩個整數變數: dozen代表有幾打 (200 /12)、amount代表幾顆(200除以12的餘數)
		
		System.out.println("200顆蛋共是" + dozen + "打" + amount + "顆"); // 最後輸出結果
	}

}
