package additionalQuestions;

import java.util.Arrays;

public class Ex9 {
	public static void main(String args[]) {
		Ex9 project = new Ex9();
		String arr[]={"red","green","blue","ivory"};
		project.run(arr,0);
	}

	public void run(String arr[], int place) {
		Arrays.sort(arr);
		System.out.println(arr[place]);
	}
}
