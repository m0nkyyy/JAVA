import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
	static Geldautomat aktion = new Geldautomat(100);
	static Scanner input = new Scanner(System.in);
	static boolean logged = true;

	public static void main(String[] args) {
				
		while (logged) {
			System.out.println("1. Bestand");
			System.out.println("2. Auszahlung");
			System.out.println("3. Einzahlung");
			System.out.println("0. Ausloggen");

			int eingabe = input.nextInt();

			switch (eingabe) {
			case 1:
				bestand();
				break;
			case 2:
				auszahlung(eingabe);
				break;
			case 3:
				einzahlung(eingabe);
				break;
			case 0:
				input.close();
				System.out.println("Ausgeloggt");
				System.exit(0);
			}
		}
	}

	public static void bestand() {
		aktion.getVorrat();
	}

	public static void auszahlung(int summe) {
		System.out.println("Auszahlung");
		System.out.println("Geben Sie den Betrag ein");

		int eingabe = input.nextInt();

		aktion.auszahlung(eingabe);
	}

	public static void einzahlung(int summe) {
		System.out.println("Einzahlung");
		System.out.println("Geben Sie den Betrag ein");

		int eingabe = input.nextInt();

		aktion.einzahlung(eingabe);
	}
}
