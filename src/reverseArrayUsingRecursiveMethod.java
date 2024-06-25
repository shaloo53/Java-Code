import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseArrayUsingRecursiveMethod {
public static void main(String[] args) {
	String s ="I love programming";
	reverse(s);
}
public static void reverse(String s) {
	if(s.length()==0) {return;}
	else {
	List<String> stringToReverse = new ArrayList<String>(Arrays.asList(s.split(" ")));
	int index = stringToReverse.size()-1;
	System.out.print(stringToReverse.get(index)+" ");
	stringToReverse.remove(index);
	StringBuilder s1 = new StringBuilder();
	for(String s2 : stringToReverse) {
	s1.append(s2).append(" ");
	}
	reverse(s1.toString());
	}
}
}
