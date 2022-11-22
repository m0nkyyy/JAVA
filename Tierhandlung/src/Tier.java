
public class Tier {
// art, rasse, name & satt

	private String rasse;
	private String name;
	private boolean satt = false;

	// Konstruktor
	public Tier(String rasse, String name) {
		super();
		this.rasse = rasse;
		this.name = name;
	}

	public String getRasse() {
		return rasse;
	};

	public void setRasse(String rasse) {
		this.rasse = rasse;
	};

	public String getName() {
		return name;
	};

	public void setName(String name) {
		this.name = name;
	};

	public void fuettern() {
		if (satt) {
			System.out.println(this.getName() + " ist Satt");
		} else {
			System.out.println(this.getName() + " muss gefuettert werden.");
		}
	}


}
