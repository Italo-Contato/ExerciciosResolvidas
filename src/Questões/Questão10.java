package Quest�es;
public class Quest�o10 extends AncestralQuest�es{
	int numero1, numero2, resultado;
		
		public void recebeValores() {
			System.out.println("Digite o primeiro n�mero");
			numero1 = scanner.nextInt();
			System.out.println("Digite o segundo n�mero");
			numero2 = scanner.nextInt();
		}
	
		public void executa() {
			recebeValores();
			resultado = numero1 + numero2;
			System.out.println("A soma de " + numero1 + " + "+ numero2 + " � igual a " + resultado);
		}
}
