//algoritmo que descobre a �rea de uma circunfer�ncia
package Quest�es;

public class Quest�o7 extends AncestralQuest�es{
	double area, raio, pi;
	
	public void executa() {
		pi =  3.14159;
		System.out.println("DESCOBRINDO A �REA DA CIRCUNFER�NCIA");
		System.out.println("digite seu raio: ");
		raio = scanner.nextDouble();
		//proxima linha faz o calculo
		area = pi * (raio*raio);
		System.out.println(Math.round(area*100.0)/100.0);
	}


	public void recebeValores() {
		
		
	}
}
