package package2;

public class test {

	public static void main(String[] args) {
		bookTest b=(String name)->"bookname="+name;
		bookTest b2=bookStyle::bn1;
		
		
		System.out.println(b.bookName("java"));
		System.out.println(b2.bookName("java"));
	}

}
