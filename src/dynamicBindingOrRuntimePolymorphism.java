import java.util.Arrays;
import java.util.List;

public class dynamicBindingOrRuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj = new B(); //upcasting
System.out.println(obj.a); //data members cant override
obj.ab();//methods can be override this is an example of runtime polymorphism or dynamic bonding
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
                 .filter(n -> n % 2 == 0)
                 .mapToInt(n -> n * 2)
                 .sum();
System.out.println("Sum of even numbers doubled: " + sum);
	}

}
