package additionalQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Ex7 {
	public static void main(String args[]) {
		Ex7 project = new Ex7();
		project.run();
	}

	public void run(HashMap<Integer, Integer> map) {
		Set<Integer> keySet = map.keySet();
		Integer oddKeys[] = new Integer[map.size()];
		int count = 0;
		Integer sum = 0;
		for (Integer key : keySet) {
			if (key % 2 != 0) {
				oddKeys[count++] = map.get(key);
				sum = sum + map.get(key);
			}
		}
		
	}
}
