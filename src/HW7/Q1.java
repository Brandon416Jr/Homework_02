package HW7;

import java.io.*;

public class Q1 {
	public static void main(String[] args) {
		File f1 = new File("C:\\THA104_Workspace\\Homework_2\\file\\Sample.txt"); // 目錄物件

		try {
			// 有幾行
			int count = 0;
			String str;
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			while ((str = br.readLine()) != null) {
				count += 1;
			}

			br.close();
			fr.close();
			// 有幾個字
			int count1 = 0;
			FileReader fr1 = new FileReader(f1);
			BufferedReader br1 = new BufferedReader(fr1);
			int i;
			while ((i = br1.read()) != -1) {
				count1 += 1;
			}
//			System.out.println(count + ", " + count1);

			br1.close();
			fr1.close();

			System.out.println("sample.txt共有" + f1.length() + "個位元組、" + count + "列資料、" + count1 + "個字元");
//		} catch (FileNotFoundException f) {
//			f.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
