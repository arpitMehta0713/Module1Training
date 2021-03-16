package stringExamples;

public class ToIntConversion {
	public static void main(String args[]) {
		ToIntConversion project=new ToIntConversion();
		project.run("2");
	}
	public int run(String number) {
		int converted=Integer.parseInt(number);
		System.out.println(converted);
		return converted;
	}
}
