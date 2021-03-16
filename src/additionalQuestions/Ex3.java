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
		Integer array[] = project.run(list1, list2);
		for(Integer element : array){
			System.out.println(element);
		}
	}

	public Integer[] run(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list1Unique = new ArrayList<>(list1);
		list1Unique.removeAll(list2);
		ArrayList<Integer> list2Unique = new ArrayList<>(list2);
		list2Unique.removeAll(list1);
		ArrayList<Integer> uniqueItems = new ArrayList<>();
		uniqueItems.addAll(list1Unique);
		uniqueItems.addAll(list2Unique);
		Integer[] array = uniqueItems.toArray(new Integer[0]);

		return array;
	}
}
