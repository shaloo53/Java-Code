import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class countNumberOfCharactersInGivenString {
public static void main(String[] args) {
	System.out.println("Enter string : ");
	try (Scanner sc = new Scanner(System.in)) {
		String s=sc.nextLine();
		HashMap<Character, Integer> countOfCharacter = new HashMap<Character, Integer>();
		char[] c= s.toCharArray();
		for(char eachCharacter : c ) {
			if(!countOfCharacter.containsKey(eachCharacter)) {
				countOfCharacter.put(eachCharacter,1);
			}
			else countOfCharacter.put(eachCharacter,countOfCharacter.get(eachCharacter)+1);
		}
		
		int max = 0;
		List<Character> ch = new ArrayList<Character>();
		Character charRepeatingMaximumTimes = null;
		for(Map.Entry<Character, Integer> m : countOfCharacter.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue() );
			if(m.getValue()>max) {
				max = m.getValue();
				charRepeatingMaximumTimes =m.getKey(); 
			}
			if(m.getValue()>1) {
				ch.add(m.getKey());
			}
		}
		System.out.println("Character more than 1 are "+ch);
		System.out.println("Maximum number of character repeated is "+charRepeatingMaximumTimes +" "+max);
		System.out.println("Removed Duplicate character " +countOfCharacter.keySet());
	}
}
}
