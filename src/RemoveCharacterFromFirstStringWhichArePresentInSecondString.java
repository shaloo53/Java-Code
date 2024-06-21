import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveCharacterFromFirstStringWhichArePresentInSecondString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "India is great";
String s2 = "in";

char[] ch1 = s1.toCharArray();
Set<Character> characterToRemove = new HashSet<Character>();
for(char c : s2.toCharArray()) {
	characterToRemove.add(c);
}

for(char c1 : ch1) {
	if(!characterToRemove.contains(Character.toLowerCase(c1))) {
		System.out.print(c1);
	}
	
}
	}

}
