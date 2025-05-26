package programs;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words = "Hello my name is ganesh";
		int count = words.split("\\s").length;
		System.out.println(count);
	}
}