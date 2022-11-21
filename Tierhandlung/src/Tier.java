
public class Tier {
// TODO art, rasse, name & satt
	
	private String art;
	private String rasse;
	private String name;
	
	// Konstruktor
	public Tier(String art, String rasse, String name) {
		super();
		this.art = art;
		this.rasse = rasse;
		this.name = name;
		
	}
	
	public String getArt() {
		return art;
	};
	
	public void setArt(String art) {
		this.art = art;
	};
	
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
	
}
