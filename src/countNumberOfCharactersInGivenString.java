import java.util.HashMap;
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
		
		
		for(Map.Entry<Character, Integer> m : countOfCharacter.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue() );
			if(m.getValue()>1) {
				System.out.println("duplicate chars are "+m.getKey());
			}
		}
		
	}
}
}
