import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int theoryVote, practiveVote, finalResult;


		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il voto della prova scritta compreso tra -8 e + 8 :");
		practiveVote = input.nextInt();

			finalResult = theoryVote + practiveVote;

			if (theoryVote <= 0 && finalResult > 18) {
				System.out.println("Lo studente è bocciato !");
			} else if (theoryVote <= 0 && practiveVote < 18) {
				System.out.println("Lo studente è bocciato !");
			} else if (theoryVote > 0 && finalResult < 18) {
				System.out.println("Lo studente è bocciato !");
			} else if (finalResult == 31 || finalResult == 32) {
				System.out.println("Congratulazione : 30 e lode !");
			} else {
				System.out.pri
		System.out.println("Inserisci il voto della prova orale compreso tra 0 e 24 :");
		theoryVote = input.nextInt();

		if(practiveVote>=-8 && practiveVote<=8 && theoryVote >=0 && theoryVote <=24) {
ntln("Lo studente è promosso ! ");
			}
		}
		else {
			System.out.println("I voti inseriti non sono corretti ");
		}
		}
	}
