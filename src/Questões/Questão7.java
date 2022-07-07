//algoritmo que descobre a área de uma circunferência
package Questões;

public class Questão7 extends AncestralQuestões{
	double area, raio, pi;
	
	public void executa() {
		pi =  3.14159;
		System.out.println("DESCOBRINDO A ÁREA DA CIRCUNFERÊNCIA");
		System.out.println("digite seu raio: ");
		raio = scanner.nextDouble();
		//proxima linha faz o calculo
		area = pi * (raio*raio);
		System.out.println(Math.round(area*100.0)/100.0);
	}


	public void recebeValores() {
		
		
	}
}
