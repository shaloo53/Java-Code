
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class verifyTheArrayIsSubsetOfAnotherArray {
	public static void main(String[] adsd) {
		Integer[] a1 = { 1, 2, 3, 3, 2, 2 };
		Integer[] a2 = { 1, 2, 3 };
		Integer[] a3 = { 1, 3, 4 };

		System.out.println(verifyArray(a1, a3));
		System.out.println(verifyArray(a1, a2));
	}

	private static boolean verifyArray(Integer[] a1, Integer[] a2) {
		// TODO Auto-generated method stub
		boolean flag = false;
		List<Integer> l1 = Arrays.asList(a1);
		List<Integer> l2 = Arrays.asList(a2);
		flag = l2.stream().allMatch(e -> Collections.frequency(l1, e) >= Collections.frequency(l2, e));
		return flag;
	}

}
