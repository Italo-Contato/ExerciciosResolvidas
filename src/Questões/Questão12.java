package Quest�es;

public class Quest�o12 extends AncestralQuest�es {
// converte de Celsius para Fahrenheit
	double celsius, fahrenheit;
	
	public void recebeValores() {
		System.out.println("Digite a temperatura em graus celsius: ");
		celsius = scanner.nextDouble();
	}


	public void executa() {
		recebeValores();
		fahrenheit = (celsius * 9/5) + 32;
		System.out.println(celsius + " graus celsius em fahrenheit � igual a " + fahrenheit);
		
	}
}
