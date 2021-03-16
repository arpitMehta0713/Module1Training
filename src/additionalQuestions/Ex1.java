package additionalQuestions;

import java.util.*;

public class Ex1 {
	public static void main(String args[]) {
		Ex1 project = new Ex1();
		String arr[]={"goa", "kerala","gujarat"};
		project.run(arr);
	}

	public void run(String arr[]) {
		HashMap<String, String> map = new HashMap<>();
		int arrLen= arr.length;
		String keys[]=new String[arrLen]; 
		for(int i=0;i<arrLen;i++) {
			keys[i]=arr[i].substring(0, 3).toUpperCase();
			map.put(keys[i], arr[i]);
		}
		System.out.println(map);
	}
}
