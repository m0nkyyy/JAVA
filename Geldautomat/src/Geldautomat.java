
public class Geldautomat {
	private int bestandSchein10;
	private int wert = 10;

	public Geldautomat() {
		super();
		this.bestandSchein10 = bestandSchein10;
	}

	public Geldautomat(int bestandSchein10) {
		super();
		this.bestandSchein10 = bestandSchein10;
	}

	public int getVorrat() {
		int bestandEuro = this.bestandSchein10 * this.wert;
		System.out.println("---------------------------");
		System.out.println("Vorrat: " + bestandEuro + "Euro");
		System.out.println("---------------------------");
		return bestandSchein10;
	}

	public void setVorrat(int bestandSchein10) {
		this.bestandSchein10 = bestandSchein10;
	}

	public int getWert() {
		int wert = this.bestandSchein10 * this.wert;
		return wert;
	}

	public int auszahlung(int betrag) {
		System.out.println("---------------------------");
		if (betrag > 0 && betrag <= this.getWert() && betrag % 10 == 0) {
			int ausgabe = betrag / this.wert;
			this.setVorrat(this.bestandSchein10 - ausgabe);
			System.out.println("Auszahlung: " + betrag + "Euro");
		} else {
			System.out.println("Fehler");
		}
		System.out.println("---------------------------");
		return betrag;
	}

	public int einzahlung(int betrag) {
		System.out.println("---------------------------");
		if (betrag > 0 && betrag % 10 == 0) {
			int eingabe = betrag / this.wert;
			this.setVorrat(this.bestandSchein10 + eingabe);
			System.out.println("Einzahlung: " + betrag + "Euro");
		} else {
			System.out.println("Fehler");
		}
		System.out.println("---------------------------");
		return betrag;
	}
}
