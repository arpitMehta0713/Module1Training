package additionalQuestions;

import java.util.*;

public class Ex2 {
	public static void main(String args[]) {
		Ex2 project = new Ex2();
		HashMap<String, String> map = new HashMap<>();
		map.put("ram", "hari");
		map.put("cisco", "barfi");
		map.put("honeywell", "cs");
		map.put("cts", "hari");
		project.run(map, "hari");
	}

	public void run(HashMap<String, String> map, String toFind) {
		String[] keysArray = new String[map.size()];
		Set<String> keys = map.keySet();
		int count = 0;
		for (String key : keys) {
			if (map.get(key).equalsIgnoreCase(toFind)) {
				keysArray[count] = key;
				count++;
			}
		}
		for (int i = 0; i < keysArray.length; i++) {
			if (keysArray[i] != null) {
				System.out.println(keysArray[i]);
			}
		}
	}
}
