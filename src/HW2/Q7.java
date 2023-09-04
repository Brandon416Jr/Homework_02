package HW2;

/* 請設計一隻Java程式，輸出結果為以下：
A             // 41~ 46 (unicode - HEX) 66 ~ 70 (十進位)
BB
CCC
DDDD
EEEEE
FFFFFF
 */

public class Q7 {
	public static void main(String[ ] args) {
		
//		char A = 'A', B = 'B', C = 'C', D = 'D', E = 'E', F = 'F';
//		System.out.println("A的unicode為" + (int)A);
//		System.out.println("B的unicode為" + (int)B);
//		System.out.println("C的unicode為" + (int)C);
//		System.out.println("D的unicode為" + (int)D);
//		System.out.println("E的unicode為" + (int)E);
//		System.out.println("F的unicode為" + (int)F);
		
		int i = 65 ;
		int j = 65;
		for (i = 65; i <= 70; i++) {
			
			for (j = 65; j <= i; j++) {
				System.out.print((char)i);	
			}
			
			System.out.println("");			
		}
		
	}

}
