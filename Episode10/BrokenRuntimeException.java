package Episode10;

public class BrokenRuntimeException {
	public static void main(String[] args) {
		String word = "range";
		char last_char = word.charAt(5);
		System.out.print(last_char);
	}
}