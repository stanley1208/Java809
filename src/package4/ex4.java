package package4;

public class ex4 {

	public static void main(String[] args) {
		
	}

}

interface abc{
	String x="aa";
	
	void aaa();
	
	default void bbb(int x) {
		
	}
	
	static void ccc() {
		
	}
}

/*
Which two reasons should you use interfaces instead of abstract classes?

A. You expect that classes that implement your interfaces have many common methods or fields, or require access modifiers other than public.
B. You expect that unrelated classes would implement your interfaces.
C. You want to share code among several closely related classes.
D. You want to declare non-static on non-final fields.
E. You want to take advantage of multiple inheritance of type.


*/

