package QuestõesPrincipal;
import Questões.*;
import java.util.Scanner;

public class EscolheQuestões {
	int numeroQuestão;
	Scanner scanner = new Scanner(System.in);

	public void executa() {
		numeroQuestão = 1;
		
		while(numeroQuestão != 0) {
			recebeEscolha();
			switch(numeroQuestão) {
		
				case 7: 
					Questão7 questão7 = new Questão7();
					questão7.executa(); break;
				case 8:
					Questão8 questão8 = new Questão8();
					questão8.executa(); break;
				case 9: 
					Questão9 questão9 = new Questão9();
					questão9.executa(); break;
				case 10: 
					Questão10 questão10 = new Questão10();
					questão10.executa();
				case 11: 
					Questão11 questão11 = new Questão11();
					questão11.executa();
				case 12:
					Questão12 questão12 = new Questão12();
					questão12.executa();
					}
				}
			}
	
	public void recebeEscolha() {
		//Pede para escolher qual questão vai ser executada por meio de um Scanner
		System.out.println("DIGITE O NÚMERO DA QUESTÃO");
		System.out.println("OU DIGITE 0 PARA SAIR");
		numeroQuestão = scanner.nextInt();
	}
	
}

