
public class C {
	public static C obj = null;
	private C() {
		System.out.println("class C");
	}
	public static C InitClassC() {
		if(obj == null) {
			obj = new C();
		}
		return obj;
	}
}
