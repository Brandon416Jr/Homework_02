package HW8;

import java.util.HashSet;
import java.util.Set;

public class TrainTest {
	public static void main(String[] args) {
		Set<Train> trains = new HashSet<Train>();
		trains.add(new Train(202,"普悠瑪", "樹林", "花蓮", 400));
		trains.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trains.add(new Train(118, "自強", "高雄", "台北", 500));
		trains.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trains.add(new Train(122, "自強", "台中", "花蓮", 600));;
		trains.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trains.add(new Train(1254, "區間", "屏東", "基隆", 700));

	}
}
