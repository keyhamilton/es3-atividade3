package questao5;

public class TestaInvestimento {
    public static void main(String[] args) {
        Investimento investimento = new Investimento(1, 5000.0, TipoInvestimento.RENDA_FIXA);
        String risco = investimento.avaliarRisco();
        System.out.println(risco);
    }
}
