package br.com.dsm.atividadetddjava.domain;

public class Cliente {

    private static final String STATUS_LIBERADO = "LIBERADO";
    private static final String STATUS_BLOQUEADO = "BLOQUEADO";
    private static final String MENSAGEM_STATUS_INVALIDO = "Status deve ser LIBERADO ou BLOQUEADO";

    private Long id;
    private String nome;
    private String status; // LIBERADO ou BLOQUEADO

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void definirStatus(String status) {
        if (statusInvalido(status)) {
            throw new IllegalArgumentException(MENSAGEM_STATUS_INVALIDO);
        }
        this.status = status;
    }

    public void bloquear() {
        definirStatus(STATUS_BLOQUEADO);
    }

    public void liberar() {
        definirStatus(STATUS_LIBERADO);
    }

    private boolean statusInvalido(String status) {
        return !STATUS_LIBERADO.equals(status) && !STATUS_BLOQUEADO.equals(status);
    }
}
