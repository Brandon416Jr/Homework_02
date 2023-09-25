package HW6;



//請設計三個類別Calculator.java，CalException.java與CalTest.java，在Calculator.java裡有個自訂
//方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。 CalTest.java執行後，使用者可
//以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
//1. x與y同時為0，(產生自訂的CalException例外物件)
//2. y為負值，而導致x的y次方結果不為整數
//3. x與y皆正確情況下，會顯示運算後結果

public class Calculator {

	private int x;
	private int y;

	public Calculator() {
		
	}
	
	public Calculator(int x, int y) throws CalException {
		if (x >= 0 && y >= 0) {
			this.x = x;
			this.y = y;
		} else {
			throw new CalException("格式不對喔!請重新輸入!");
		}
	}
	
	public int getx() {
		return x;
	}
	
	public void setx(int x) throws CalException {
		this.x = x;
	}
	
	public int gety() {
		return y;
	}
	
	public void sety (int y) throws CalException {
		if (y >= 0) {
			this.y = y;
		} else {
			throw new CalException("y值不能小於0，請重新輸入y值");
		}
	}
	
	public int powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方完全沒有意義，請重新輸入!");
		} else {
			return (int)Math.pow(x, y);
		}
	}
	
}
