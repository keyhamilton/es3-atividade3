package questao4;

public class ValidacaoCpf implements ValidacaoImposto {

    @Override
    public void validar(ImpostoDeRenda impostoDeRenda) throws Exception {
        String cpf = impostoDeRenda.getCpfContribuinte().replaceAll("\\s+", "");

        if(cpf == "") {
            throw new Exception("CPF inválido: cpf vazio");
        }

        if(cpf.length() < 11) {
            
            throw new Exception("CPF inválido: cpf com menos de 11 caracteres");
        }

        
    }
    
}
