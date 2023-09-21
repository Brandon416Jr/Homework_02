package HW5;

import java.util.Scanner;

public class Q1 {
	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int width, height;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬度：");
		width = sc.nextInt();
		System.out.println("請輸入長度：");
		height = sc.nextInt();

		System.out.println();

		starSquare(width, height);
	}

}
