package Questões;
public class Questão10 extends AncestralQuestões{
	int numero1, numero2, resultado;
		
		public void recebeValores() {
			System.out.println("Digite o primeiro número");
			numero1 = scanner.nextInt();
			System.out.println("Digite o segundo número");
			numero2 = scanner.nextInt();
		}
	
		public void executa() {
			recebeValores();
			resultado = numero1 + numero2;
			System.out.println("A soma de " + numero1 + " + "+ numero2 + " é igual a " + resultado);
		}
}
