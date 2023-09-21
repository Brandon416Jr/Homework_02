package HW4;

//班上有8位同學，他們進行了6次考試結果如下：

//請算出每位同學考最高分的次數
//(提示：二維陣列)
public class Q6 {
	public static void main(String[] args) {
		int[][] exam = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] count = new int[8];
		int highestScore;
		
		for (int  i = 0; i < exam.length; i++) {
			highestScore = 0;
			int stu = 0;
			for (int j = 0; j < exam[i].length; j++) {
				if(highestScore < exam[i][j]) {
					highestScore = exam[i][j];
					stu = j;
				}
			}
			count[stu] += 1;
		}
		
		System.out.println("1號同學考最高分次數="+count[0]);
		System.out.println("2號同學考最高分次數="+count[1]);
		System.out.println("3號同學考最高分次數="+count[2]);
		System.out.println("4號同學考最高分次數="+count[3]);
		System.out.println("5號同學考最高分次數="+count[4]);
		System.out.println("6號同學考最高分次數="+count[5]);
		System.out.println("7號同學考最高分次數="+count[6]);
		System.out.println("8號同學考最高分次數="+count[7]);
		
	}
}
