package HW7;

import java.io.*;

public class Q1 {
	static void p(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
//		File f1 = new File("C:\\THA104_Workspace\\Homework_2\\Sample.txt"); // 目錄物件
//		p("File Name: " + f1.getName());
//		p(f1.exists() ? "exists" : "does not exist");
		
		int i;
		
		
		try {
			int count = 0;
			String str;
            FileReader fr = new FileReader("C:\\THA104_Workspace\\Homework_2\\Sample.txt");
            BufferedReader br = new BufferedReader(fr) ;
            while ((str = br.readLine()) != null) {
            	
            	System.out.println(str);
            	count += 1;
            	System.out.println(count);
            }
                
            
            br.close();   
            fr.close();
		} catch (IOException e) {
		}
		
		
	}
}
