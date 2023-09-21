package HW4;

//請建立一個字串，經過程式執行後，輸入結果是反過來的
//例如String s = “Hello World”，執行結果即為dlroW olleH
//(提示：String方法，陣列)
public class Q2 {
	public static void main(String[] args) {
		String s =new String("Hello World");
		String[] ss = s.split("");
		for (int i = ss.length - 1; i >= 0; i--) {
			System.out.print(ss[i]);
		}
        
//		String s1 =new String("Hello World");
//		String[] ss1 = new String[] {s1};
//		for (int i = 0; i < ss1.length; i++) {
//			System.out.print(ss1[(ss1.length - i)]);
//		}
	}
}
