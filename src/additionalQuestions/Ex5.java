package additionalQuestions;

public class Ex5 {
	public static void main(String args[]) {
		Ex5 project = new Ex5();
		project.run("WorldWorld");
		System.out.println(run("WorldWorld"));
	}

	public static boolean run(String string) {
		char charArray[] = string.toCharArray();
		int count = 0;
		for (char element : charArray) {
			if (element == '*') {
				count++;
			}
		}
		if (count > 0) {
			String arr[] = string.split("\\*");
			if (arr[0].equalsIgnoreCase(arr[1])) {
				return true;
			}
		}
		return false;
	}
}
