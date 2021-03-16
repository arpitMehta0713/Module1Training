package additionalQuestions;

import java.util.*;

public class Ex6 {
	public static void main(String args[]) {
		Ex6 project = new Ex6();
		HashMap<String, Integer> finalMap = new HashMap<>();
		finalMap.put("abc", 50);
		finalMap.put("efg", 70);
		project.run(finalMap);
	}

	public void run(HashMap<String, Integer> map) {
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		HashMap<String, String> finalMap = new HashMap<>();
		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer marks = entry.getValue();
			if (marks < 60) {
				finalMap.put(key, "fail");
			} else {
				finalMap.put(key, "pass");
			}
		}
		System.out.println(finalMap);
	}
}
