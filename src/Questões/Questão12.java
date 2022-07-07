package Questões;

public class Questão12 extends AncestralQuestões {
// converte de Celsius para Fahrenheit
	double celsius, fahrenheit;
	
	public void recebeValores() {
		System.out.println("Digite a temperatura em graus celsius: ");
		celsius = scanner.nextDouble();
	}


	public void executa() {
		recebeValores();
		fahrenheit = (celsius * 9/5) + 32;
		System.out.println(celsius + " graus celsius em fahrenheit é igual a " + fahrenheit);
		
	}
}
