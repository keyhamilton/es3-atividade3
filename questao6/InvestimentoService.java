package questao6;

public class InvestimentoService  {
    public String avaliarRisco(Investimento investimento) {
        
        if(investimento.getTipo() == TipoInvestimento.RENDA_VARIAVEL) {
            return "RISCO ALTO";
        }

        return "RISCO BAIXO";
    }

    public void auditar(Investimento investimento) {
        ContaCorrente contaCorrente = investimento.getConta();
        double saldo = contaCorrente.getSaldo();
        double percentual = saldo * 0.2;

        if(investimento.getValor() > percentual) {
            System.out.println("\nValor do investimento excede 20% do saldo corrente");
            System.out.println("Conta de nº: " + contaCorrente.getNumero() + "\n");
        }
    }
}
