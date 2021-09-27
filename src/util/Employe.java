package util;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Employe extends Person implements I{
	
	private String fonction;

	public Employe(String name, int age, String fonction) {
		super(name, age);
		this.fonction=fonction;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	@Override
	public String toString() {
		return "Employe [fonction=" + fonction + ", Person =" + super.toString() + "]";
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		String s = null;
		
		s.length();

			try {
				DriverManager.getConnection("");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	

}
