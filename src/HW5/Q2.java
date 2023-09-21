package HW5;

// 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：

public class Q2 {
	public static void randAvg() {
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			int j =(int) (Math.random() * 101);
			sum = sum + j;
			count += 1;
			System.out.print(j + " ");
		}
		System.out.println();
		int avg = sum / count;
		System.out.println(avg);
	}
	public static void main(String[] args) {
		System.out.println("本次亂數結果: ");
		randAvg();
	}

}
