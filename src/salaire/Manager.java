package salaire;

public class Manager extends Employee{
	
	private int nbJour;
	private double prixJour;
	
	public Manager(String name, int nbJour, double prixJour) {
		super(name);
		this.nbJour = nbJour;
		this.prixJour = prixJour;
	}

	@Override
	public double calculSalaire() {
		return nbJour * prixJour;
	}

	@Override
	public String toString() {
		return "Manager [nbJour=" + nbJour + ", prixJour=" + prixJour + ", salaire "
				+ calculSalaire()+ "]";
	}
	
	
	

}
