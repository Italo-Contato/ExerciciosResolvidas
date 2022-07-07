package Questões;

public class Questão11 extends AncestralQuestões {
	double horasTrabalhadas, valorPorHora, percentualDeDesconto;
	double salárioBruto, totalDesconto, salárioLíquido;
	
	public void executa() {
		recebeValores();
		calculaValores();
		exibiValores();
	}
	
	public void recebeValores() {
		System.out.println(" Digite quantas horas foram ou serão trabalhadas no total:");
		horasTrabalhadas = scanner.nextDouble();
		System.out.println(" Digite quanto está sendo pago por hora ");
		valorPorHora = scanner.nextDouble();
		System.out.println("Digite quanto porcento está sendo descontado");
		percentualDeDesconto = scanner.nextDouble();
	}
	
	public void calculaValores(){
		//calcula o salário bruto
		salárioBruto = horasTrabalhadas * valorPorHora;
		//calcula o total de desconto
		totalDesconto = (percentualDeDesconto/100)*salárioBruto;
		//calcula o salárioLíquido
		salárioLíquido = salárioBruto - totalDesconto;
	}
	public void exibiValores() {
		System.out.println("Horas trabalhadas : " + horasTrabalhadas+ " HR");
		System.out.println("salário bruto: R$ " + salárioBruto);
		System.out.println("Desconto de salário bruto: R$ " + totalDesconto);
		System.out.println("Salário líquido: R$ " + salárioLíquido);
	}
}
