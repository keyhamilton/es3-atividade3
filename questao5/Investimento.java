package questao5;

public class Investimento {
    private int id;
    private double valor;
    private TipoInvestimento tipo;


    public Investimento(int id, double valor, TipoInvestimento tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    
    public String avaliarRisco() {
        InvestimentoService investimentoService = new InvestimentoService();
        // retorna a string "RISCO ALTO" caso o tipo de investimento seja renda variável. 
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
}
