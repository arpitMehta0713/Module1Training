package stringExamples;

public class DuplicateVowels {
	public static void main(String args[]) {
		DuplicateVowels project = new DuplicateVowels();
		project.run("Arpit");
	}

	public void run(String word) {
		char wordArray[] = word.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (char element : wordArray) {
			if (element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u' || element == 'A'
					|| element == 'E' || element == 'I' || element == 'O' || element == 'U') {
				builder.append(element);
			}
			builder.append(element);
		}
		String modified = builder.toString();
		System.out.println(modified);

	}
}
