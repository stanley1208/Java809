package package3;




public class ex6<T> {
	
	
	public static void main(String[] args) {
		Foo<String,Integer>mark=new Foo<String,Integer>("steve",100);
		Foo<String,String>pair=Foo.<String>twice("Hello World");
		Foo<?,?>percentage=new Foo<Integer,Integer>(97,32);
		Foo<String,String>grade=new Foo<>("John","A");
	}
	
}

class Foo<K,V>{
	
	private K key;
	private V value;
	
	public Foo(K key,V value) {
		this.key=key;
		this.value=value;
	}
	
	public static <T> Foo<T,T> twice(T value){
		return new Foo<T,T>(value,value);
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}


