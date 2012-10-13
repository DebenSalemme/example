// elenco librerie

import java.util.Scanner;

/* this class MetroCity
 * define if a city is a Metropoli or not.
 * if is a capital and it has more than 100000 abitants
 * or
 * more than 200000 and more than 720 000 000 tax per year.
 * 
 * It read the data from the user
 * and gives back the valutation.
 * 
 * Enjoy!
 */

public class MetroCity {
	
	// class used for input readings;
	public static Scanner scanner = new Scanner (System.in);
	
	public static void main (String[] argv){
	
		// variable definition
		boolean isCapital = true;
		int numberOfCitizens = 200000;
		double taxPerCitizens = 7000;
		double taxYear;
		
		// reading the input
		System.out.println("Type if capital, number of citizens and tax per citizens per month plz.");
		isCapital = Boolean.parseBoolean(scanner.nextLine());
		numberOfCitizens = Integer.parseInt(scanner.nextLine());
		taxPerCitizens = Double.parseDouble(scanner.nextLine());
		
		// output of the data for control
		System.out.println("I dati ricevuti in input sono:"
				+ "capitale :" + isCapital
				+ " cittadini : " + numberOfCitizens 
				+ " taxpercitizens : " + taxPerCitizens +".");
		
		taxYear = numberOfCitizens*12*taxPerCitizens;
		
		// core of the class, for the valuation with simple if, else modality
		if ( (isCapital && numberOfCitizens > 100000)
				|| (numberOfCitizens > 200000 && taxPerCitizens*numberOfCitizens*12 > 720000000)){
			System.out.println("Questa' citta' e' una metropoli! Ha "+ numberOfCitizens
					+"cittadini e un totale di "+taxYear+"tasse annue.");
		}
		else 
			System.out.println("Questa citta' non e' una metropoli!");
		
	}
}
