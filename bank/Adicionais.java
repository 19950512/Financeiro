package System.bank;

public class Adicionais {

    private String cliente;
    private Boolean estado;
    private Double impostoValor;
    private Double manutencaoValor;

    public Double imposto(Double saldo) {
        Double valorFinal = 0d;
        valorFinal = saldo + impostoValor;
        return valorFinal;
    }

    public Double manutencao(Double saldo) {
        Double valorFinal = 0d;
        valorFinal = saldo + impostoValor;
        return valorFinal;
    }
}
