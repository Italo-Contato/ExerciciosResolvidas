package Quest�es;

public class Quest�o9 extends AncestralQuest�es{
	String nome, sobreNome, texto;	
	
	public void recebeValores() {
		//pede o nome e depois pede o sobre nome
		System.out.println("Digite o nome");
		nome = scanner.nextLine();	
		System.out.println("Digite o sobrenome");
		sobreNome = scanner.nextLine();
	}
	
	public void executa() {
		recebeValores();
		texto ="Nome Completo: " + nome + " " + sobreNome;
		System.out.println(texto);
	}
}
