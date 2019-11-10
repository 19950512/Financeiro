package System.bank;

public class Receber implements Transacoes {

    private Double valor;
    private String conta;
    private String tipo;
    private Integer data;
    private String descricao;

    @Override
    public Double pedidoTrans(Double valor) {
        return null;
    }

    @Override
    public String pedidoConta(String conta) {
        return null;
    }

    @Override
    public String pedidoTipo(String tipo) {
        return null;
    }

    @Override
    public Integer pedidoData(Integer data) {
        return null;
    }

    @Override
    public String pedidoDes(String descricao) {
        return null;
    }
}
