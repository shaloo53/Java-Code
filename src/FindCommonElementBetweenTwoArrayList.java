import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonElementBetweenTwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> str1 = Arrays.asList("shaloo","amit","banty","bhaiya");

List<String> str2 = Arrays.asList("shaloo","amit","sumit","putul");
	for(String s : str1) {
		if(str2.contains(s)) {
			System.out.println(s);
		}
	}
	
	List<String> common = new ArrayList<String>(str1);
	common.retainAll(str2);
	System.out.println("2nd way is "+common);
	
	List<String> thiredWay = str1.stream().filter(str2::contains).toList();
	System.out.println(thiredWay);
	}

}
