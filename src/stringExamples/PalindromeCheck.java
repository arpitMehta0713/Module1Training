package stringExamples;

public class PalindromeCheck {
	public static void main(String args[]) {
		PalindromeCheck project = new PalindromeCheck();
		project.run("Naman");
	}
	public void run(String StringToCheck) {
		char array[]=StringToCheck.toCharArray();
		StringBuilder reversedBuilder= new StringBuilder();
		for(int i=array.length-1;i>=0;i--) {
			reversedBuilder=reversedBuilder.append(array[i]);
		}
		String reversed=reversedBuilder.toString();
		if(reversed.equalsIgnoreCase(StringToCheck)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
