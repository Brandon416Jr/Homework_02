package HW4;
//有個字串陣列如下 (八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//(提示：字元比對，String方法)

public class Q3 {
	public static void main(String[] args) {
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		for (int i = 0; i < planet.length; i++) {
			for (int k = 0; k < planet[i].length(); k++) { // 此length()是代表字串的長度
				if (planet[i].charAt(k) == 'a' || planet[i].charAt(k) == 'e' || planet[i].charAt(k) == 'i' || planet[i].charAt(k) == 'o' || planet[i].charAt(k) == 'u') {
					count += 1;
				}
			}
		}
		System.out.println("八大行星字串陣列共有"+count+"個母音(a,e,i,o,u)");
	
	}
}
