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
			System.out.println("Bitte wähle eine Aktion aus. (Es werden nur Zahlen als Eingabe gewertet!)");
			System.out.println("1. Tier erstellen");
			System.out.println("2. Tiere Zeigen");
			System.out.println("3. Tier Löschen");
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
				show();
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

				// TODO Logik in eine Function auslagern

				for (int i = 0; i < tierListe.length; i++) {
					if (tierListe[i] == null) {
						tierListe[i] = neuerHund;
						eintrag = true;
						break;
					} else {
//						System.out.println("Fehler");
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
					} else {
//							System.out.println("Fehler");
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

	public static void show() {
		
		
		System.out.println("-----");
		System.out.println("Tier: ");
		for (int i = 0; i < tierListe.length; i++) {
			if (tierListe[i] != null && tierListe[i] instanceof Hund) {

				System.out.println(i + 1 + ". Rasse: " + tierListe[i].getRasse() + " - Name: " + tierListe[i].getName()
						+ " - Entwurmt: " + ((Hund) tierListe[i]).isEntwurmt()
						);
			}
		}
//		System.out.println("Katzen: ");
//		for (int i = 0; i < tierListe.length; i++) {
//			if (tierListe[i] != null) {
//
//				System.out.println(i + 1 + ". Rasse: " + tierListe[i].getRasse() + " - Name: "
//						+ tierListe[i].getName() + " - Entwurmt: " + ( tierListe[i]).isEntwurmt());
//			}
//		}
		System.out.println("Tierliste: " + Arrays.toString(tierListe));
		System.out.println("-----");

	}

	public static void delete() {

		System.out.println("-----");
		System.out.println("Original Array : " + Arrays.toString(tierListe));
		System.out.println("-----");
		for (int i = 0; i < tierListe.length; i++) {
			if (tierListe[i] != null) {
				System.out.println(i + 1 + ". Tier: " + " - " + "Rasse: " + tierListe[i].getRasse() + " - " + "Name: "
						+ tierListe[i].getName());
			}
		}
		System.out.println("-----");

		Scanner eingabe = new Scanner(System.in);

		int zahl = eingabe.nextInt();
		int index = zahl - 1;
		System.out.println("Der Array Index: " + index + " wurde ausgewählt");
		for (int i = 0; i < tierListe.length; i++) {
			if (i == index) {
				tierListe[i] = null;
			}
		}
		for (int x = 0; x < tierListe.length; x++) {
			Arrays.sort(tierListe, Comparator.nullsLast(null));
		}
		System.out.println(Arrays.toString(tierListe));
	}
};
