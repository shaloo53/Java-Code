import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighestAndSeconHighestIntegerInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {2,5,6,7,8,9};
		List<Integer> listArr = Arrays.asList(arr);
		Collections.sort(listArr);
		System.out.println("highest integer is "+listArr.get(listArr.size()-1));

		System.out.println("second integer is "+listArr.get(listArr.size()-2));
	}

}
