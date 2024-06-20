
import java.util.ArrayList;
import java.util.List;

public class leftSubArraySumGreaterThanRightSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(10);
		arr.add(-5);
		arr.add(6); 
		System.out.println("Main array is " + arr);

		System.out.println("Total possible way is " + totalNoOfway(arr));
	}

	private static int totalNoOfway(List<Integer> arr) {
		// TODO Auto-generated method stub
		int totalNoOfWay = 0;
		List<Integer> leftSubArray = new ArrayList<Integer>();
		List<Integer> rightSubArray = new ArrayList<Integer>();

		for (int i = 1; i < arr.size(); i++) {
			for (int j = 0; j < i; j++) {
				rightSubArray.add(arr.get(j));
			}
			for (int l = i; l < arr.size(); l++) {
				leftSubArray.add(arr.get(l));
			}
			System.out.println(leftSubArray);
			System.out.println(rightSubArray);
			System.out.println("------");
			
			int sumOfa1 = 0;
			int sumOfa2 = 0;
			for (int s1 : leftSubArray) {
				sumOfa1 = sumOfa1 + s1;
			}
			for (int s2 : rightSubArray) {
				sumOfa2 = sumOfa2 + s2;
			}
			if (sumOfa1 > sumOfa2) {
				totalNoOfWay++;
			}
			
			leftSubArray.clear();
			rightSubArray.clear();

		}

		

		return totalNoOfWay;
	}

}
