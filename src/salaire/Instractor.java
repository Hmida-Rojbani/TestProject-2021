package salaire;

public class Instractor extends Employee{

	private int nbHeure;
	private static double prixHeure = 35.0;
	
	public Instractor(String name, int nbHeure) {
		super(name);
		this.nbHeure = nbHeure;
	}

	@Override
	public double calculSalaire() {
		return prixHeure * nbHeure;
	}

	@Override
	public String toString() {
		return "Instractor [nbHeure=" + nbHeure + ", calculSalaire()=" + calculSalaire() + "]";
	}
	
	

}
