
/**
 * 
 */
public class reverseString {
	public static void main(String[] args) {
		String s="Java";
		StringBuffer s1 = new StringBuffer(s);
		System.out.println("Using buffer "+s1.reverse());
		
		System.out.print("Using loop : ");
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
}
