package stringExamples;

public class VowelsToUpperCase {
	public static void main(String args[]) {
		VowelsToUpperCase project = new VowelsToUpperCase();
		project.run("Naman");
	}

	public void run(String word) {
		char c;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				c = Character.toUpperCase(word.charAt(i));
				word = word.replace(word.charAt(i), c);
			}
		}
		System.out.println(word);
	}
}
