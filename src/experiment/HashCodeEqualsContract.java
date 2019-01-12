package experiment;

public class HashCodeEqualsContract {
	public static void main(String[] args) {
		HashCodeEqualsContract obj1 = new HashCodeEqualsContract();
		System.out.println(obj1);
		System.out.println(obj1.hashCode());

		System.out.println("------------");
		HashCodeEqualsContract obj2 = new HashCodeEqualsContract();
		System.out.println(obj2);
		System.out.println(obj2.hashCode());

		System.out.println("------------");
		System.out.println(obj1 == obj2);

		System.out.println("------------");
		System.out.println(obj1.equals(obj2));
	}
}
