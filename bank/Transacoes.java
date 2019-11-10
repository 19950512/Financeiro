package System.bank;

public interface Transacoes {

    Double pedidoTrans(Double valor);

    String pedidoConta(String conta);

    String pedidoTipo(String tipo);

    Integer pedidoData(Integer data);

    String pedidoDes(String descricao);

}
