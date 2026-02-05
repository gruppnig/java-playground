// ************************************************************
// IMPORTS
// ************************************************************
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Variables and Objects
		Random rnd = new Random();
		int zahl1 = rnd.nextInt(99) +1;
		int zahl2 =  rnd.nextInt(99) + 1;
		int ergebnis = zahl1 + zahl2;
		boolean testFlag = rnd.nextBoolean();
		
		// Some Nonsense
		System.out.println("Hulehule Bambule!!!");
		System.out.print("Schnapp!");
		System.out.append(" AAAAAAH!!!!\n");
		Gap(1);
		System.out.println("WTF Happened here?");
		Gap();
		Gap(1,'-', 20);
		
		// control structures
		if (ergebnis < 50) {
			System.out.println("Minifuzzi! " + ergebnis);
		}else {
			System.out.println("Maxifuzzi! " + ergebnis);
		}
		Gap(1,'-', 20);
		Gap();
		
		
		// ************************************************************
		// Strings
		// ************************************************************
		String strName = "Gerald";
		strName += " Ruppnig";
		Gap(2);
		System.out.println("Name: " + strName);
		strName = strName.toLowerCase();
		System.out.println("...pssst! wie? " + strName);
		strName = strName.toUpperCase();
		Gap(5, '#', 50);
		System.out.println("WAAS? " + strName + "!");
		
		// ************************************************************
		// logical conditions
		// ************************************************************
		Gap();
		if (zahl1 < 50 && zahl2 > 50) {
			System.out.println("Zahl1 kleiner 50 und Zahl2 grösser 50: " + zahl1 + ", " + zahl2);
		}
		if (zahl1 < 50 || ergebnis > 100) {
			System.out.println("Zahl1 kleiner 50 oder Ergebnis > 100: "  + zahl1 + ", " + zahl2 );
		}
		if (!testFlag) {
			System.out.println("testFlag ist FALSE" );
		}else {
			System.out.println("testFlag ist TRUE");
		}
		
		// verify input
		Gap();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gib eine Zahl zwischen 1 und 10 ein");
		String input = scanner.nextLine();
		int nrInput = -1;
		
		try {
			nrInput = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("Ungültige Zahl eingegeben");
		}
		
		// 1st method
		if (nrInput <= 5) {
			System.out.println("Zahl zwischen 1 und 5");
		} else {
			System.out.println("Zahl zwischen 6 und 10");
		}
		
		// 2nd method
		String result = "";
		result = nrInput <=5 
				? "V2: Zahl zwischen 1 und 5" 
				: "V2: Zahl zwischen 6 und 10";
		System.out.println(result);
		
	}
	
	
	
	// ************************************************************
	// Methods
	// ************************************************************
	public static void Gap() {
		System.out.println();
	}
	
	public static void Gap(int rows ) {
		for(int i=0; i<rows; i++) {
			System.out.println();
		}
	}
	
	public static void Gap(int rows, char character, int width ) {
		String  charRow = String.valueOf(character).repeat(width);
		for(int i=0; i<rows; i++) {
			System.out.println(charRow);
		}
	}

}
