
public class Katze extends Tier {

	private boolean entwurmt;
	private boolean hauskatze;

	public Katze(String rasse, String name, boolean entwurmt, boolean hauskatze) {
		super(rasse, name);
		this.entwurmt = entwurmt;
		this.hauskatze = hauskatze;
	}

	public boolean isEntwurmt() {
		return entwurmt;
	}

	public void setEntwurmt(boolean entwurmt) {
		this.entwurmt = entwurmt;
	}

	public boolean isHauskatze() {
		return hauskatze;
	}

	public void setHauskatze(boolean hauskatze) {
		this.hauskatze = hauskatze;
	}

	public void entwurmen() {
		if (entwurmt) {
			System.out.println(this.getName() + " muss nicht entwurmt werden.");
		} else {
			System.out.println(this.getName() + "entwurmen!");

			entwurmt = true;
			// this.setEntwurmt(true);
		}

	}

}
