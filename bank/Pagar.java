package System.bank;

public class Pagar implements Transacoes {

    Double valor;
    String conta;
    String tipo;
    Integer data;
    String descricao;

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
