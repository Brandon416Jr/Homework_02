package HW9;
//• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//競賽過程。
//• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//• 參考範例：CounterRunnable.java
//• 需留意主執行緒執行順序

public class Q1 implements Runnable {
	private int counter1 = 0;
	private int counter2 = 0;

	public Q1() {

	}

	public void run() { // 執行緒執行的地方
		while (counter1 < 11) {
			System.out.println("饅頭人吃第" + counter1 + "碗飯");
			counter1++;

			try {
				Thread.sleep((long)(Math.random() * 2500) + 500); // 暫停一秒
			} catch (Exception e) {
				System.out.println("饅頭人吃完了!");
			}
		}

		while (counter2 < 11) {
			System.out.println("詹姆士吃第" + counter2 + "碗飯");
			counter2++;

			try {
				Thread.sleep((long)(Math.random() * 2500) + 500); // 暫停一秒
			} catch (Exception e) {
				System.out.println("詹姆士吃完了!");
			}
		}
	}

	public static void main(String[] args) {
		Q1 r1 = new Q1();
		Thread t1 = new Thread(r1); 
		Q1 r2 = new Q1();
		Thread t2 = new Thread(r2);
		t1.start(); 
		t2.start();

	}

}
