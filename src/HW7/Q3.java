package HW7;

import java.io.*;
import java.io.File;

public class Q3 {
	public static void Q3 (File f1, File f2) {
		try {
			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			 int i;
			 while ((i = br.read()) != -1) {
					bw.write(i);
					bw.flush();
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("file\\f1.txt");
		File f2 = new File("file\\f2.txt");
		Q3(f1, f2);
	}

}
