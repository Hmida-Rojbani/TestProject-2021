package salaire;

public abstract class Employee implements Salaire, Comparable<Employee>{

	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return name.compareTo(arg0.name);
	}
	
	
}
