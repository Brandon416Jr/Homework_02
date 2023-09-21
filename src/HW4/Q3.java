package HW4;
//有個字串陣列如下 (八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//(提示：字元比對，String方法)

public class Q3 {
	public static void main(String[] args) {
		String[] planetSystem = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int vowel = 0;
		for(int i = 0; i < planetSystem.length; i++) {
			for(int j = 0; j < planetSystem[i].length(); j++) {
//				switch (planetSystem[i].charAt(j)) {
//				case 'a':
//				vowel += 1;
//				break;
//				case 'e':
//				vowel += 1;
//				break;
//				case 'i':
//				vowel += 1;
//				break;
//				case 'o':
//				vowel += 1;
//				break;
//				case 'u':
//				vowel += 1;
//				break;
//				}
				if (planetSystem[i].charAt(j) == 'a') {
					vowel += 1;
				} else if (planetSystem[i].charAt(j) == 'e') {
					vowel += 1;
				} else if (planetSystem[i].charAt(j) == 'i') {
					vowel += 1;
				} else if (planetSystem[i].charAt(j) == 'o') {
					vowel += 1;
				} else if (planetSystem[i].charAt(j) == 'u') {
					vowel += 1;
				}
			}
		}
		
		System.out.println("八大行星字串陣列共有"+vowel+"個母音(a,e,i,o,u)");	
	}
	

}
