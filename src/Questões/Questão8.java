package Quest�es;
import java.util.*;
public class Quest�o8  {
	double area, altura, base;
	
	Scanner scanner = new Scanner(System.in);
	
	public void executa() {
		System.out.println("Achando a �rea de um triangulo...");
		System.out.println("Digite o tamanho da altura");
		altura = scanner.nextDouble();
		
		System.out.println("Digite o tamanho da base");
		base = scanner.nextDouble();
		
		
		area = (altura*base)/2;
		
		System.out.println(Math.round(area*100.0)/100.0);
		
	}

}
