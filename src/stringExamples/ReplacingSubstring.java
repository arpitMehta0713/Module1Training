package stringExamples;

public class ReplacingSubstring {
	public static void main(String args[]) {
		ReplacingSubstring project = new ReplacingSubstring();
		project.run("Arpit","pi","no");
	}

	public String run(String word, String subStringToReplace, String subStringToBeReplaced) {
		System.out.println(word.replaceAll(subStringToReplace, subStringToBeReplaced));
		return word.replaceAll(subStringToReplace, subStringToBeReplaced);
	}
}
