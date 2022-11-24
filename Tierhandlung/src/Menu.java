import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// TODO Add Kommandos to Hunde
// TODO Add class Fisch to create()
// TODO Change delete Function
// TODO Refactor create(), Arrays, tierListen and delete

public class Menu {

	static Tier[] tierListe = new Tier[50];
	static String tier;
	static boolean entwurmt = false;
	static boolean hauskatze = false;

	public static void main(String[] args) {

		boolean test = false;

		do {

			System.out.println("1. Tier eintragen");
			System.out.println("2. Tiere anzeigen");
			System.out.println("3. Tier löschen");
			System.out.println("0. Ausloggen");

			Scanner eingabe = new Scanner(System.in);

			int zahl = eingabe.nextInt();

			switch (zahl) {
			case 1:
				System.out.println("Bitte wähle eine Aktion aus. (Es werden nur Zahlen als Eingabe gewertet!)");
				System.out.println("1. Hund");
				System.out.println("2. Katze");
				System.out.println("3. Fisch");

				zahl = eingabe.nextInt();

				switch (zahl) {
				case 1:
					tier = "hund";
					System.out.println("Hund");
					create();
					break;
				case 2:
					tier = "katze";
					System.out.println("Katze");
					create();
					break;
				case 3:
					tier = "fisch";
					System.out.println("Fisch");
					create();
					break;
				}
				break;
			case 2:
				System.out.println("1. Alle Tiere");
				System.out.println("2. Hunde");
				System.out.println("3. Katzen");
				System.out.println("4. Fische");
				zahl = eingabe.nextInt();

				switch (zahl) {
				case 1:
					tier = "all";
					show();
					break;
				case 2:
					tier = "hund";
					show();
					break;
				case 3:
					tier = "katze";
					show();
					break;
				case 4:
					tier = "fisch";
					show();
					break;
				}
				break;
			case 3:
				delete();
				break;
			case 0:
				eingabe.close();
				System.out.println("Ausgeloggt.");
				System.exit(0);
			}
			;
		} while (test != true);
	}

	public static void create() {
		boolean eintrag = false;
		Scanner eingabe = new Scanner(System.in);

		do {
			if (tier.equals("hund")) {
				eingabe = new Scanner(System.in);
				System.out.println("Rasse?");
				String rasse = eingabe.nextLine();
				eingabe = new Scanner(System.in);
				System.out.println("Name?");
				String name = eingabe.nextLine();
				eingabe = new Scanner(System.in);
				System.out.println("Entwurmt?");
				System.out.println("1. Ja");
				System.out.println("2. Nein");
				int wurm = eingabe.nextInt();

				// TODO add kommandos

				if (wurm == 1) {
					entwurmt = true;
				} else if (wurm == 2) {
					entwurmt = false;
				}

				Hund neuerHund = new Hund(rasse, name, entwurmt);

				for (int i = 0; i < tierListe.length; i++) {
					if (tierListe[i] == null) {
						tierListe[i] = neuerHund;
						eintrag = true;
						break;
					}
				}
			} else if (tier.equals("katze")) {

				eingabe = new Scanner(System.in);
				System.out.println("Rasse?");
				String rasse = eingabe.nextLine();
				eingabe = new Scanner(System.in);
				System.out.println("Name?");
				String name = eingabe.nextLine();
				eingabe = new Scanner(System.in);
				System.out.println("Entwurmt?");
				System.out.println("1. Ja");
				System.out.println("2. Nein");
				int wurm = eingabe.nextInt();
				System.out.println("Hauskatze?");
				System.out.println("1. Ja");
				System.out.println("2. Nein");
				int haus = eingabe.nextInt();

				// Wurm
				if (wurm == 1) {
					entwurmt = true;
				} else if (wurm == 2) {
					entwurmt = false;
				}
				// Hauskatze
				if (haus == 1) {
					hauskatze = true;
				} else if (haus == 2) {
					hauskatze = false;
				}

				Katze neueKatze = new Katze(rasse, name, entwurmt, hauskatze);

				for (int i = 0; i < tierListe.length; i++) {
					if (tierListe[i] == null) {
						tierListe[i] = neueKatze;
						eintrag = true;
						break;
					}
				}
			} else if (tier.equals("fisch")) {
				eingabe = new Scanner(System.in);
				System.out.println("Rasse?");
				String rasse = eingabe.nextLine();
				eingabe = new Scanner(System.in);
				System.out.println("Name?");
				String name = eingabe.nextLine();
				eingabe = new Scanner(System.in);
				System.out.println("Salzgehalt?");
				double salzgehalt = eingabe.nextDouble();
				System.out.println("Gewaesser?");
				String gewaesser = eingabe.next();

				Fisch neuerFisch = new Fisch(rasse, name, salzgehalt, gewaesser);

				// TODO Logik in eine Function auslagern

				for (int i = 0; i < tierListe.length; i++) {
					if (tierListe[i] == null) {
						tierListe[i] = neuerFisch;
						eintrag = true;
						break;
					} else {
//						System.out.println("Fehler");
					}
				}
			}

		} while (eintrag != true);
	}

	/// Checks for empty Array

	public static boolean isArrayEmpty(Tier[] tierListe) {
		if (tierListe == null) {
			return true;
		} else if (tierListe.length == 0) {
			return true;
		} else {
			for (Tier str : tierListe) {
				if (str != null) {
					return false;
				}
			}
			return true;
		}
	}

	public static void show() {

		System.out.println("------------------------------");

		if (isArrayEmpty(tierListe)) {
			System.out.println("Es wurden keine Tiere eingetragen.");
		} else {
		if (tier.equals("all")) {
				for (int i = 0; i < tierListe.length; i++) {
					if (tierListe[i] != null) {
						if (tierListe[i] instanceof Hund) {
							dog(i);
						}
						if (tierListe[i] instanceof Katze) {
							cat(i);
						}
						if (tierListe[i] instanceof Fisch) {
							fish(i);
						}
					}

				}
			}

		 else if (tier.equals("hund")) {
			for (int i = 0; i < tierListe.length; i++) {
				if (tierListe[i] != null) {
					if (tierListe[i] instanceof Hund) {
						dog(i);
					}
				}
			}
		} else if (tier.equals("katze")) {
			for (int i = 0; i < tierListe.length; i++) {
				if (tierListe[i] != null) {
					if (tierListe[i] instanceof Katze) {
						cat(i);
					}
				}
			}
		} else if (tier.equals("fisch")) {
			for (int i = 0; i < tierListe.length; i++) {
				if (tierListe[i] != null) {
					if (tierListe[i] instanceof Fisch) {
						fish(i);
					}
				}
			}
		}}
		System.out.println("------------------------------");
	}

	public static void delete() {
		System.out.println("------------------------------");
		if (isArrayEmpty(tierListe)) {
			System.out.println("Es wurden keine Tiere eingetragen.");
		} else {
			System.out.println("------------------------------");
			System.out.println("Original Array : " + Arrays.toString(tierListe));
			for (int i = 0; i < tierListe.length; i++) {
				if (tierListe[i] != null) {
					System.out.print(i + 1 + ": ");
					dog(i);
					cat(i);
					fish(i);
				}
			}
			System.out.println("------------------------------");

			Scanner eingabe = new Scanner(System.in);

			int zahl = eingabe.nextInt();
			int index = zahl - 1;
			for (int i = 0; i < tierListe.length; i++) {
				if (i == index) {
					System.out.print("Entferne: ");
					dog(i);
					cat(i);
					fish(i);
					tierListe[i] = null;
					System.out.println("...");
					System.out.println("Entfernt");
					System.out.println("------------------------------");
				}
			}
			for (int x = 0; x < tierListe.length; x++) {
				Arrays.sort(tierListe, Comparator.nullsLast(null));
			}
		}
		System.out.println("------------------------------");
	}

	public static String entwurmt() {
		String wurmed = "";
		if (entwurmt) {
			wurmed = "Ja";
		} else {
			wurmed = "Nein";
		}
		return wurmed;
	}

	public static String hausKatze() {
		String haus = "";
		if (hauskatze) {
			haus = "Ja";
		} else {
			haus = "Nein";
		}
		return haus;
	}

	public static void dog(int i) {
		if (tierListe[i] instanceof Hund) {
			///////////////
			///////////////
			System.out.println("Tier: Hund - Name: " + tierListe[i].getName() + " - Rasse: " + tierListe[i].getRasse()
					+ " - Entwurmt: " + entwurmt());
		}
	}

	public static void cat(int i) {
		if (tierListe[i] instanceof Katze) {
			///////////////
			///////////////
			System.out.println("Tier: Katze - Name: " + tierListe[i].getName() + " - Rasse: " + tierListe[i].getRasse()
					+ " - Entwurmt: " + entwurmt() + " - Hauskatze: " + hausKatze());
		}
	}

	private static void fish(int i) {
		if (tierListe[i] instanceof Fisch) {
			///////////////
			///////////////
			System.out.println("Tier: Fisch - Name: " + tierListe[i].getName() + " - Rasse: " + tierListe[i].getRasse()
					+ " - Salzgehalt: " + ((Fisch) tierListe[i]).getSalzgehalt() + " - Gewässer: "
					+ ((Fisch) tierListe[i]).getGewaesser());
		}

	}
};
