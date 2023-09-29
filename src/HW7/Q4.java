package HW7;

import java.io.*;

public class Q4 {
	public static void main(String[] args) throws Exception {
		Pets[] pets = new Pets[4];
		pets[0] = new Dog("Ronald Acuna Jr.");
		pets[1] = new Dog("Mookie Betts");
		pets[2] = new Cat("Julios Rodriguez");
		pets[3] = new Cat("Freddie Freeman");

		// 建立資料夾&檔案
		File folder = new File("C:\\data");
		 if (!folder.exists()) {
	            folder.mkdir();
	        }
		File file = new File("C:\\data\\Object.ser");
		file.createNewFile();

		// 輸出
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (int i = 0; i < pets.length; i++) {
				oos.writeObject(pets[i]);
			}

			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 輸入
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				((Pets) ois.readObject()).speak();
				System.out.println("-----------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
	}
}
