package salaire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		
		listEmp.add(new Instractor("John", 50));
		listEmp.add(new Manager("Eric", 22, 150));
		
		Collections.sort(listEmp, Comparator.reverseOrder());
		
		System.out.println(listEmp);

	}

}
