package Quest�es;

public class Quest�o11 extends AncestralQuest�es {
	double horasTrabalhadas, valorPorHora, percentualDeDesconto;
	double sal�rioBruto, totalDesconto, sal�rioL�quido;
	
	public void executa() {
		recebeValores();
		calculaValores();
		exibiValores();
	}
	
	public void recebeValores() {
		System.out.println(" Digite quantas horas foram ou ser�o trabalhadas no total:");
		horasTrabalhadas = scanner.nextDouble();
		System.out.println(" Digite quanto est� sendo pago por hora ");
		valorPorHora = scanner.nextDouble();
		System.out.println("Digite quanto porcento est� sendo descontado");
		percentualDeDesconto = scanner.nextDouble();
	}
	
	public void calculaValores(){
		//calcula o sal�rio bruto
		sal�rioBruto = horasTrabalhadas * valorPorHora;
		//calcula o total de desconto
		totalDesconto = (percentualDeDesconto/100)*sal�rioBruto;
		//calcula o sal�rioL�quido
		sal�rioL�quido = sal�rioBruto - totalDesconto;
	}
	public void exibiValores() {
		System.out.println("Horas trabalhadas : " + horasTrabalhadas+ " HR");
		System.out.println("sal�rio bruto: R$ " + sal�rioBruto);
		System.out.println("Desconto de sal�rio bruto: R$ " + totalDesconto);
		System.out.println("Sal�rio l�quido: R$ " + sal�rioL�quido);
	}
}
