package HW2;
//使用for + do while loop
public class NN2 {
	public static void main(String[] args) {
		
		int i = 1;
		
		for (i = 1; i <= 9; i++) {
			int j =1;
			
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			
			System.out.println();
		}
		
	}

}
