package Quest�esPrincipal;
import Quest�es.*;
import java.util.Scanner;

public class EscolheQuest�es {
	int numeroQuest�o;
	Scanner scanner = new Scanner(System.in);

	public void executa() {
		numeroQuest�o = 1;
		
		while(numeroQuest�o != 0) {
			recebeEscolha();
			switch(numeroQuest�o) {
		
				case 7: 
					Quest�o7 quest�o7 = new Quest�o7();
					quest�o7.executa(); break;
				case 8:
					Quest�o8 quest�o8 = new Quest�o8();
					quest�o8.executa(); break;
				case 9: 
					Quest�o9 quest�o9 = new Quest�o9();
					quest�o9.executa(); break;
				case 10: 
					Quest�o10 quest�o10 = new Quest�o10();
					quest�o10.executa();
				case 11: 
					Quest�o11 quest�o11 = new Quest�o11();
					quest�o11.executa();
				case 12:
					Quest�o12 quest�o12 = new Quest�o12();
					quest�o12.executa();
					}
				}
			}
	
	public void recebeEscolha() {
		//Pede para escolher qual quest�o vai ser executada por meio de um Scanner
		System.out.println("DIGITE O N�MERO DA QUEST�O");
		System.out.println("OU DIGITE 0 PARA SAIR");
		numeroQuest�o = scanner.nextInt();
	}
	
}

