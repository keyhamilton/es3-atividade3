package questao5;



public class Transacao {
    private int id;
    private double valor;
    private TipoTransacao tipo;

    public Transacao(int id, double valor, TipoTransacao tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    
    public boolean verificarFraude() {
        TransacaoService transacaoService = new TransacaoService();
        // retorna true caso valor da transação seja negativo ou nulo. Senão, retorna false.
        return transacaoService.verificarFraude(this);
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

}
