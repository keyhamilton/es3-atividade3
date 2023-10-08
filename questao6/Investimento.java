package questao6;

public class Investimento implements Auditavel {
    private int id;
    private double valor;
    private TipoInvestimento tipo;
    private ContaCorrente conta;

    public Investimento(int id, double valor, TipoInvestimento tipo, ContaCorrente conta) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
        this.conta = conta;
    }

    public String avaliarRisco() {
        InvestimentoService investimentoService = new InvestimentoService();
        // retorna a string "RISCO ALTO" caso o tipo de investimento seja renda
        // variável.
        // retorna a string "RISCO BAIXO" no caso de o tipo de investimento renda fixa.
        return investimentoService.avaliarRisco(this);
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public TipoInvestimento getTipo() {
        return tipo;
    }

    public ContaCorrente getConta() {
        return this.conta;
    }

    @Override
    public void auditar() {

        InvestimentoService investimentoService = new InvestimentoService();
        // emite alerta para valores acima de 20% do saldo da conta investidora
        investimentoService.auditar(this);

    }
}
