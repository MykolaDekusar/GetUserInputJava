package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //programmazione ad oggetti
		//Stampiamo cosa vogliamo chiedere all'utente
		System.out.println("Come ti chiami?");
		//assegnamo ad una variabile quello che l'utente scriverà
		String nome = scanner.nextLine();
		System.out.println("Il tuo nome e': "+nome);
		scanner.close();
	}

}
 