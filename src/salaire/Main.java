package salaire;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		
		listEmp.add(new Instractor("John", 50));
		listEmp.add(new Manager("Eric", 22, 150));
		for (Employee employee : listEmp) {
			System.out.println(employee);
		}

	}

}
