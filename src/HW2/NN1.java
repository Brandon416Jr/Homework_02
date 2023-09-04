package HW2;
// 使用for + while loop
public class NN1 {
	public static void main(String[] args) {
		
		int i = 1;
		
		for (i = 1; i <= 9; i++) {
			int j = 1; // attention! 如果放在一開始宣告，第一行跑完j不會回到初始值
			
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			
			System.out.println("");
		}
		
	}

}
