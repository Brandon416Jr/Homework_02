package HW10;

import java.util.Scanner;

//• 請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成(1)
//年/月/日(2)月/日/年(3)日/月/年三選一，而輸入非指定日期數字格式會顯示出提示訊息如圖
//(提示：TestFormatter.java, Java API文件，判斷格式可用正規表示法)

public class Q3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入日期：");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int date = sc.nextInt();
		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			while (true) {
				if (month > 12 || month < 1 || month == 2 && date > 29
						|| (month == 4 || month == 6 || month == 9 || month == 11) && date > 30
						|| (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
								|| month == 12) && date > 31) {
					System.out.println("請重新輸入日期: ");
					year = sc.nextInt();
					month = sc.nextInt();
					date = sc.nextInt();
				} else {
					break;
				}
			}

		} else if (!(year % 4 == 0 && year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0)) {
			while (true) {
				if (month > 12 || month < 1 || month == 2 && date > 28
						|| (month == 4 || month == 6 || month == 9 || month == 11) && date > 30
						|| (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
								|| month == 12) && date > 31) {
					System.out.println("請重新輸入日期");
					year = sc.nextInt();
					month = sc.nextInt();
					date = sc.nextInt();
				} else {
					break;
				}
			}

		}

		System.out.println("請輸入選擇的格式，(1)年/月/日(2)月/日/年(3)日/月/年：");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println(year + "年" + month + "月" + date + "日");
		} else if (num == 2) {
			System.out.println(month + "月" + date + "日" + year + "年");
		} else if (num == 3) {
			System.out.println(date + "日" + month + "月" + year + "年");
		} else {
			System.out.println("請重新輸入");
			num = sc.nextInt();
		}

	}
}
