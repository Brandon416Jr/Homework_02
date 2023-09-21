package HW4;
//有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示：陣列，length屬性)
public class Q1 {
	public static void main (String[] args) {
		int [] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			count += 1;
		}
		double avg = sum / count;
		
		System.out.println(avg);
		
		System.out.print("{");
		for (int j = 0; j < arr.length; j++) {
			avg = sum / arr.length;
			if (arr[j] > avg) {
				System.out.print(arr[j] + " ");
			}
			
		}
		System.out.print("}");
	}

}
