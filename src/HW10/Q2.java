package HW10;

import static java.lang.System.out;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

//請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示(1)千分位
//(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖 (提示： TestFormatter.java, Java API
//文件, 判斷數字可用正規表示法)
//• 補充 (依此類推)：
//輸入12345，千分位為12,345，輸入123，千分位為123
//輸入0.75，百分比為75%，輸入1，結果為100%

public class Q2 {
	public static void main (String[] args) {
		String num = "^[1-9]{1,}[0-9]{0,}$";
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個任意數字:");
		String x = sc.next();
		
		while (true) {
			if (x.matches(num)) {
				break;
			} else {
				System.out.println("請重新輸入任意數:");
				x = sc.next();
			}
		}
	
		System.out.println("請輸入要以甚麼形式顯示數字: (1)千分位\r\n"
				+ "//(2)百分比(3)科學記號");
		int option = sc.nextInt();
		int x1 = Integer.parseInt(x);
		while (true) {
			if (option == 1) {
				Format dfm1 = new DecimalFormat("#,###");
				out.println(dfm1.format(x1));
				break;
			} else if (option == 2) {
				System.out.println(((double)x1) / 100 + "%" );
				break;
			} else if (option == 3) {
				System.out.println(String.format("%1.2e", (double)x1));
				break;
			} else {
				System.out.println("請重新輸入選項");
				option = sc.nextInt();
			}
			
		}
		
	}
}
