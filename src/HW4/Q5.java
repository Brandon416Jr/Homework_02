package HW4;

import java.util.Scanner;
//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//(提示1：Scanner，陣列)
//(提示2：需將閏年條件加入)
//(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

//如果年份被 4 整除，則移至步驟 2。 否則，請跳至步驟 5。
//如果年份被 100 整除，則移至步驟 3。 否則，請跳至步驟 4。
//如果年份被 400 整除，則移至步驟 4。 否則，請跳至步驟 5。
//該年份為閏年 (有 366 天)。
//該年分不是閏年 (有 365 天)。

public class Q5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入年月日：");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int date = sc.nextInt();
		int[] normalYear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] leapYear = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int day = 0;

		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			// 閏年
			if (month > 12 || month == 2 && date > 29
					|| (month == 4 || month == 6 || month == 9 || month == 11) && date > 30 || (month == 1 || month == 3
							|| month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && date > 31) {
				System.out.println("請重新輸入日期");
				year = sc.nextInt();
				month = sc.nextInt();
				day = sc.nextInt();
			} else {
				for (int i = 1; i < month; i++) {
					day += 1 * leapYear[i - 1];
				}
			}
			System.out.println("輸入的日期為" + year + "年的第" + (day + date) + "天");
		} else {
			// 平年
			if (month > 12 || month == 2 && date > 28
					|| (month == 4 || month == 6 || month == 9 || month == 11) && date > 30 || (month == 1 || month == 3
							|| month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && date > 31) {
				System.out.println("請重新輸入日期");
				year = sc.nextInt();
				month = sc.nextInt();
				day = sc.nextInt(); // 想一下怎麼跳出來
			} else {
				for (int i = 1; i < month; i++) {
					day += 1 * normalYear[i - 1];
				}
				System.out.println("輸入的日期為" + year + "年的第" + (day + date) + "天");
			}
		}

	}
}