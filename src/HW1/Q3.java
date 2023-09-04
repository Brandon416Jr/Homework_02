package HW1;

// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class Q3 {
	public static void main(String[] args) {
		
		int initial = 256559, day_Sec = 24 * 60 * 60, hour_Sec = 60 * 60, minute_Sec = 60; // 先將初始值以及一天、一小時、一分各有幾秒設成整數變數型態值
		int day = initial / day_Sec; // 將初始值除以一天的秒數可以得到有幾天
		int hour = (initial % day_Sec) / hour_Sec; // 將初始值除以一天的秒數的餘數 (代表不足一天多出來的秒數) 再除以一小時的秒數可以得到有幾小時
//		int minute = ((initial % day_Sec) % hour_Sec) / minute_Sec; 
		int minute = (initial %  hour_Sec) / minute_Sec; // 將初始值除以一小時的秒數的餘數除以一分鐘的秒數可以得到有幾分鐘
//		int second =((initial % day_Sec) % hour_Sec) % minute_Sec;
		int second =initial % minute_Sec; // 將初始值除以一分鐘的秒數的餘數可以得到有幾秒
		
		System.out.println("256559秒為" + day + "天" + hour + "小時" + minute + "分" + second + "秒"); // 輸出得到結果
	}

}
