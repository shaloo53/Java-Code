
public class PermutationOfString {
	public static void main(String[] args) {
		String s = "abcd";
		System.out.println("s.substring(0, 0) "+s.substring(0, 0));
		System.out.println("s.substring(1) "+s.substring(1));
		
		print(s, "");
	}

	private static void print(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans + "");
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			// Rest of the string after excluding the ith character
			String ros = s.substring(0, i) + s.substring(i + 1); 
			print(ros, ans + ch);
		}

	}
}



