
public class Hund extends Tier {

	private boolean entwurmt;
	// TODO add kommandos
//	private String[] kommandos;

	public Hund(String rasse, String name, boolean entwurmt) {
		super(rasse, name);

		this.entwurmt = entwurmt;
//		this.kommandos = kommandos;
	}

	public boolean isEntwurmt() {
		return entwurmt;
	}

	public void setEntwurmt(boolean entwurmt) {
		this.entwurmt = entwurmt;
	}

//	public String[] getKommandos() {
//		return kommandos;
//	}
//
//	public void setKommandos(String[] kommandos) {
//		this.kommandos = kommandos;
//	}

	public void entwurmen() {
		if (entwurmt) {
			System.out.println(this.getName() + " muss nicht entwurmt werden.");
		} else {
			System.out.println(this.getName() + "entwurmen!");

			entwurmt = true;
			// this.setEntwurmt(true);
		}

	}

	public void gassiGehen() {
		System.out.println(this.getName() + " muss Gassi.");
	}

}
