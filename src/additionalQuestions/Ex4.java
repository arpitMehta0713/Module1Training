package additionalQuestions;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex4 {
	public static void main(String args[]) {
		Ex4 project = new Ex4();
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("apple");
		list1.add("orange");
		list1.add("grapes");
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("apple");
		list2.add("melon");
		list2.add("mango");
		project.run(list1, list2);
	}

	public void run(ArrayList<String> list1, ArrayList<String> list2) {
		Iterator<String> iterator1 = list1.iterator();
		Iterator<String> iterator2 = list2.iterator();
		String arr[] = new String[list1.size() + list2.size()];
		int count = 0;
		while (iterator1.hasNext()) {
			String element = iterator1.next();
			if (element.startsWith("a") || element.startsWith("g")) {
				iterator1.remove();
				continue;
			}
			arr[count++] = element;
		}
		while (iterator2.hasNext()) {
			String element = iterator2.next();
			if (element.endsWith("n") || element.endsWith("e")) {
				iterator2.remove();
				continue;
			}
			arr[count++] = element;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
	}
}
