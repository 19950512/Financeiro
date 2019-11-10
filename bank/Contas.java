package System.bank;

public class Contas {

    private String nome;
    private Double saldo;
    private Boolean estado; // informa se o cliente esta devendo

    public String getNome() {
        return nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Boolean getEstado() {
        return estado;
    }
}
