import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Menu {

	static Tier[] tierListe = new Tier[10];

	public static void main(String[] args) {

		boolean test = false;

		do {
			System.out.println("Bitte wähle eine Aktion aus. (Es werden nur Zahlen als Eingabe gewertet!)");
			System.out.println("1. Neues Tier");
			System.out.println("2. Zeige alle Tiere");
			System.out.println("3. Löschen");
			System.out.println("0. Ausloggen");

			Scanner eingabe = new Scanner(System.in);

			int zahl = eingabe.nextInt();

			switch (zahl) {
			case 1:
				create();
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

		do {
			System.out.println("Fügen Sie ein Tier hinzu:");

			System.out.println("Welche Art Tier ist es?");
			Scanner eingabe = new Scanner(System.in);
			String art = eingabe.next();
			System.out.println("Welcher Rasse?");
			String rasse = eingabe.next();
			System.out.println("Wie heißt das Tier?");
			String name = eingabe.next();

			Tier neuesTier = new Tier(art, rasse, name);

			for (int i = 0; i < tierListe.length; i++) {
				if (tierListe[i] == null) {
					tierListe[i] = neuesTier;
					System.out.println("Tier hinzugefügt");
					System.out.println(("Art: " + tierListe[i].getArt()) + " - " + "Rasse: " + tierListe[i].getRasse()
							+ " - " + "Name: " + tierListe[i].getName());
					break;
				}
			}
			eintrag = true;
		} while (eintrag != true);

	}

	public static void show() {
		System.out.println("-----");

		System.out.println("-----");
		for (int i = 0; i < tierListe.length; i++) {
			if (tierListe[i] != null) {

				System.out.println(i + 1 + ". Tier: " + "Art: " + tierListe[i].getArt() + " - " + "Rasse: "
						+ tierListe[i].getRasse() + " - " + "Name: " + tierListe[i].getName());
			}
		}
		System.out.println("Tierliste: " + Arrays.toString(tierListe));
		System.out.println("-----");

	}

	public static void delete() {

		System.out.println("-----");
		System.out.println("Original Array : " + Arrays.toString(tierListe));
		System.out.println("-----");
		for (int i = 0; i < tierListe.length; i++) {
			if (tierListe[i] != null) {
				System.out.println(i + 1 + ". Tier: " + "Art: " + tierListe[i].getArt() + " - " + "Rasse: "
						+ tierListe[i].getRasse() + " - " + "Name: " + tierListe[i].getName());
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
