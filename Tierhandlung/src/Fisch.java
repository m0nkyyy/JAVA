
public class Fisch extends Tier {

	double salzgehalt;
	String gewaesser;

	public Fisch(String rasse, String name, double salzgehalt, String gewaesser) {
		super(rasse, name);

		this.salzgehalt = salzgehalt;
		this.gewaesser = gewaesser;
	}

	public double getSalzgehalt() {
		return salzgehalt;
	}

	public void setSalzgehalt(double salzgehalt) {
		this.salzgehalt = salzgehalt;
	}

	public String getGewaesser() {
		return gewaesser;
	}

	public void setGewaesser(String gewaesser) {
		this.gewaesser = gewaesser;
	}

}
