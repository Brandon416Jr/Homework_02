package HW2;

/* 請設計一隻Java程式，輸出結果為以下：
 1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
  */

public class Q6 {
	public static void main(String[] args) {
		int i=1;
		int j =10;
		for ( j =10; j >= 1; j --) {
			for (i =1; i <= j; i ++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

}
