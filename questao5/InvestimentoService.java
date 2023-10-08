package questao5;

public class InvestimentoService  {
    public String avaliarRisco(Investimento investimento) {
        
        if(investimento.getTipo() == TipoInvestimento.RENDA_VARIAVEL) {
            return "RISCO ALTO";
        }

        return "RISCO BAIXO";
    }
}
