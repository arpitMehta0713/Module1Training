package additionalQuestions;

import java.util.*;

public class Ex3 {
	public static void main(String args[]) {
		Ex3 project = new Ex3();
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(5);
		project.run(list1, list2);
	}

	public void run(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> commonItems = new ArrayList<>();
		list1.removeAll(list2)
	}
}
