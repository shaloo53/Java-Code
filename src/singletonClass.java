
public class singletonClass {
	public static void main(String[] args) {
		//Since we make Class c construtor as private we cant create the object and this is how we create a singleton class.
		//C c = new C();
		//C c1 = new C();	
		//Now the question is how we can call the class C by making a public static method and public static object inside class C.
		System.out.println(C.InitClassC().hashCode());
		System.out.println(C.InitClassC().hashCode());
		
		//here if you will see hashcode print the same address
		
	}
	
	
}
