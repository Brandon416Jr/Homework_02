package HW7;

import java.io.*;
public class Q2 {
	public static void main (String[] args) {
		File f2 = new File("C:\\THA104_Workspace\\Homework_2\\file\\data.txt");
		try {
			FileWriter fw = new FileWriter(f2, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for (int i =1; i <= 10; i++) {
				int randomNum = ((int) (Math.random() * 1000) + 1);
				pw.println(randomNum);
			}
			
			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
