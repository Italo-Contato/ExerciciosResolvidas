/*Algoritmo que encontra a area de um triangulo apartir 
da base e da altura*/
package Questões;
public class Questão8 extends AncestralQuestões {
	double area, altura, base;

	public void executa() {
		System.out.println("Achando a área de um triangulo...");
		recebeValores();
		//fazendo o calculo 
		area = (altura*base)/2;
		//mostrando o resultado final
		System.out.println("A área desse tringulo vale " +Math.round(area*100.0)/100.0);
		
	}

	public void recebeValores() {
		// TODO Auto-generated method stub
		//recebendo valores
				System.out.println("Digite o tamanho da altura");
				altura = scanner.nextDouble();
				System.out.println("Digite o tamanho da base");
				base = scanner.nextDouble();
	}

}
