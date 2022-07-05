package Questões;
import java.util.*;
public class Questão7 {
	double area, raio, pi;
	Scanner scanner = new Scanner(System.in);
	
		
	
	
	public void executa() {
		pi =  3.14159;
		
		System.out.println("DESCOBRINDO A ÁREA DA CIRCUNFERÊNCIA");
		
		System.out.println("digite seu raio: ");
		raio = scanner.nextDouble();
		
		area = pi * (raio*raio);
		System.out.println(Math.round(area*100.0)/100.0);
	}
}
