package Questões;
import java.util.*;
public class Questão9 {
	String nome, sobreNome, texto;
	
	Scanner leia = new Scanner(System.in);
	
	public void recebe() {
		System.out.println("Digite o nome");
		nome = leia.nextLine();
		
		System.out.println("Digite o sobrenome");
		sobreNome = leia.nextLine();
	}
	
	public void executa() {
		recebe();
		
		texto ="Nome Completo: " + nome + " " + sobreNome;
		System.out.println(texto);
	}
}
