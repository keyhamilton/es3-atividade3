package questao3;

public class RelatorioImpostoRenda {

    public void gerarRelatorio(ImpostoDeRenda impostoDeRenda, double impostoDevido) {
        CalculadoraImpostoDeRenda calc = new CalculadoraImpostoDeRenda();
        System.out.println("CPF: " + impostoDeRenda.getCpfContribuinte());
        System.out.println("Rendimentos: " + impostoDeRenda.getRendimentos());
        System.out.println("Despesas: " + impostoDeRenda.getDespesas());
        System.out.println("Imposto Devido: " + calc.calcularImposto(impostoDeRenda.getRendimentos(), 
        impostoDeRenda.getDespesas()));

    }

}
