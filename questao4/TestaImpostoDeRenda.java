package questao4;

import java.util.ArrayList;
import java.util.List;

// obs: não sei como parar execução do programa caso ocorra um erro
// erros estão sendo relatados mas não tratados

public class TestaImpostoDeRenda {
    public static void main(String[] args) throws Exception {
        // criando rendimentos
        List<Double> rendimentos = new ArrayList<Double>();
        // criando despesas
        List<Double> despesas = new ArrayList<Double>();
        // criando validações
        List<ValidacaoImposto> validacoes = new ArrayList<ValidacaoImposto>();
        // criando validação para o cpf
        ValidacaoCpf validacaoCpf = new ValidacaoCpf();
        // criando validação para os rendimentos
        ValidacaoRendimentos validacaoRendimentos = new ValidacaoRendimentos();
        // criando validação para as despesas
        ValidacaoDespesas validacaoDespesas = new ValidacaoDespesas();
        // adicionando as validações específicas ao array de validações
        validacoes.add(validacaoCpf);
        validacoes.add(validacaoRendimentos);
        validacoes.add(validacaoDespesas);
        // adicionando rendimentos ao array de rendimentos
        rendimentos.add( 2500.0);
        rendimentos.add(300.0);
        rendimentos.add(300.0);
        rendimentos.add(300.0);
        rendimentos.add(300.0);
        // adicionando despesas
        despesas.add(-10.0);
        // criando imposto de renda
        ImpostoDeRenda impostoDeRenda = new ImpostoDeRenda(
                "87545560112", rendimentos, despesas);
        try {
            impostoDeRenda.processar(validacoes);
            
        } catch (Exception e) {
            throw e;
        }
    }
}
