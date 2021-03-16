package stringExamples;

public class VowelsCount {
	public static void main(String args[]) {
		VowelsCount project = new VowelsCount();
		project.run("Arpit");
	}

	public int run(String word) {
		char wordArray[] = word.toCharArray();
		int vowelCount = 0;
		for (char element : wordArray) {
			if (element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u' || element == 'A'
					|| element == 'E' || element == 'I' || element == 'O' || element == 'U') {
				vowelCount++;
			}
		}
		System.out.println(vowelCount);
		return vowelCount;
	}
}
