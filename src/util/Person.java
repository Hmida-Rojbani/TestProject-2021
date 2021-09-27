package util;

public class Person{
	
	private String name;
	private byte age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = (byte)age;
	}
	
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		}
		else {
			this.age= (byte) age;
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	

}
