package HW5;

//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//與數字的亂數組合，如圖
// 65 - 90 是代表大寫字母 (A - Z)，97 - 122 是代表小寫字母 ( a - z )，數字: 48 - 57
public class Q5 {
	public void getAuthCode() {
		int[] code = new int[8];
		int ver;

		for (int i = 0; i < code.length; i++) {
			ver = (int) (Math.random() * 75) + 48;

			if ((ver >= 48 && ver <= 57) || (ver >= 65 && ver <= 90) || (ver >= 97 && ver <= 122)) {
				code[i] = ver;
				System.out.print((char) code[i]);
			} else {
				i--;
			}
		}

	}

	public static void main(String[] args) {
		System.out.print("此驗證碼內容: ");
		Q5 code = new Q5();
		code.getAuthCode();

	}

}
