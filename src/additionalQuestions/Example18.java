
import java.util.*;

class Example18 {
	public static void main(String args[]) {
		Example18 project = new Example18();
		Integer arr[] = { 10, 10, 20, 30, 76 };
		Integer result[] = project.toRemove(arr, 10);
		for (Integer element : result) {
			System.out.println(element);
		}
	}

	public Integer[] toRemove(Integer arr[], Integer element) {
		List<Integer> list = Arrays.asList(arr);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer elementToCheck = (Integer) iterator.next();
			if (elementToCheck == element) {
				iterator.remove();
			}
		}
		Integer result[] = list.toArray(new Integer[0]);
		return result;
	}
}