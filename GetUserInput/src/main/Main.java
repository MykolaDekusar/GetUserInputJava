package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //programmazione ad oggetti
		//Stampiamo cosa vogliamo chiedere all'utente
		System.out.println("Come ti chiami?");
		
		//assegnamo ad una variabile quello che l'utente scriverà
		String nome = scanner.nextLine();
		System.out.println("Quanti anni hai?");
		int eta = scanner.nextInt();//legge solo numeri interi altrimenti crea un Exception
		System.out.println("Che lavoro fai?");
		//dopo lo scanner.nextInt() dobbiamo resettare il nextLine perche legge il \n cioe a capo
		scanner.nextLine();
		String lavoro= scanner.nextLine();
		System.out.println("Il tuo nome e': "+nome);
		System.out.println("Hai: "+eta+" anni");
		System.out.println("Il tuo lavoro è: "+lavoro);
		
		
		scanner.close();
	}

}
 