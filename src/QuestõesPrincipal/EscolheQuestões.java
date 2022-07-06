package QuestõesPrincipal;
import Questões.*;
import java.util.Scanner;

public class EscolheQuestoes {

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
				}
			}
		}
	
	public void recebeEscolha() {
		System.out.println("DIGITE O NÚMERO DA QUESTÃO");
		System.out.println("OU DIGITE 0 PARA SAIR");
		
		numeroQuestão = scanner.nextInt();
	}
	
}

