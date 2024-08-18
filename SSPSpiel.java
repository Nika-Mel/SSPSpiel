package SSPSpiel;

import java.util.Scanner;
import java.util.Random;

public class SSPSpiel {
	public static void main(String args[])
	{
		int zaehlerspieler = 0;
		int zaehlercomputer = 0;
		Scanner scanner = new Scanner(System.in);
	System.out.println("Schere-Stein-Papier-Spiel");
	System.out.println("*************************");
	System.out.println("Wie viele Runden soll das Spiel haben?");
	System.out.println("Gebe Rundenanzahl an:");
	int runde = scanner.nextInt();
	while (runde<=0){
		System.out.println("Falsche Eingabe!");
		System.out.println("Rundenanzahl muss größer 0 sein.");
		System.out.println("Gebe Rundenanzahl an:");
		runde = scanner.nextInt();
	}
	for(int i = 1; i <= runde; ++i) {
	System.out.println("*************************");
	System.out.println("Runde: "+i);
	System.out.println("*************************");
	System.out.println("Wähle aus den folgenden 3 Optionen aus:");
	System.out.println("[1]Schere");
	System.out.println("[2]Stein");
	System.out.println("[3]Papier");
	System.out.println("Gebe eine Zahl von 1 bis 3 ein.");
	int spieler = scanner.nextInt();
	while(spieler>3 || spieler<1) {
		System.out.println("Falsche Eingabe!");
		System.out.println("Gebe eine Zahl von 1 bis 3 ein.");
		spieler = scanner.nextInt();
	}
	
	Random rand = new Random();
	int computer = rand.nextInt(3);
	computer = computer+1;
	
	if (spieler == 1 && computer == 1) {
		System.out.println("Spieler und Computer haben Schere gewählt.");
		System.out.println("Unentschieden");
	}
	if (spieler == 1 && computer == 2) {
		System.out.println("Spieler hat Schere gewählt.");
		System.out.println("Computer hat Stein gewählt.");
		System.out.println("Spieler verliert.");
		zaehlercomputer = zaehlercomputer+1;
	}
	if (spieler == 1 && computer == 3) {
		System.out.println("Spieler hat Schere gewählt.");
		System.out.println("Computer hat Papier gewählt.");
		System.out.println("Spieler gewinnt.");
		zaehlerspieler = zaehlerspieler+1;
	}
	if (spieler == 2 && computer == 1) {
		System.out.println("Spieler hat Stein gewählt.");
		System.out.println("Computer hat Schere gewählt.");
		System.out.println("Spieler gewinnt.");
		zaehlerspieler = zaehlerspieler+1;
	}
	if (spieler == 2 && computer == 2) {
		System.out.println("Spieler und Computer haben Stein gewählt.");
		System.out.println("Unentschieden");
	}
	if (spieler == 2 && computer == 3) {
		System.out.println("Spieler hat Stein gewählt.");
		System.out.println("Computer hat Papier gewählt.");
		System.out.println("Spieler verliert.");
		zaehlercomputer = zaehlercomputer+1;
	}
	if (spieler == 3 && computer == 1) {
		System.out.println("Spieler hat Papier gewählt.");
		System.out.println("Computer hat Schere gewählt.");
		System.out.println("Spieler verliert.");
		zaehlercomputer = zaehlercomputer+1;
	}
	if (spieler == 3 && computer == 2) {
		System.out.println("Spieler hat Papier gewählt.");
		System.out.println("Computer hat Stein gewählt.");
		System.out.println("Spieler gewinnt.");
		zaehlerspieler = zaehlerspieler+1;
	}
	if (spieler == 3 && computer == 3) {
		System.out.println("Spieler und Computer haben Papier gewählt.");
		System.out.println("Unentschieden");
	}
	}
	System.out.println("*************************");
	System.out.println("*************************");
	System.out.println("ENDSTAND");
	System.out.println("Spieler vs. Computer: "+zaehlerspieler+" vs. "+zaehlercomputer);
	System.out.println("*************************");
	System.out.println("*************************");
	scanner.close();
	}
}
