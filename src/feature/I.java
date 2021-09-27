package feature;

public interface I {
	
	void print();
	
	default void print(String s) {
		System.out.println(s);
	}
	
	static void printImpl() {
		System.out.println("Hello");
	}

}
