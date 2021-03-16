package stringExamples;

public class VowelCharCode {
	public static void main(String args[]) {
		VowelCharCode project = new VowelCharCode();
		project.run("Arpit");
	}

	public void run(String word) {
		for (int i = 0; i < word.length(); i++) {
			char character = word.charAt(i);
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u' || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I'
					|| word.charAt(i) == 'O' || word.charAt(i) == 'U') {
				System.out.println(character + "=" + (int) character);
			}
		}
	}
}
