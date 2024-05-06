package it.epicodeGruppo2;

import java.util.Date;

public class Abbonamento {
    private Long idAbbonamento;
    private Date dataInizio;
    private boolean validità;
    private User user;
    private AbbonamentoEnum abbonamento;

    @Override
    public String toString() {
        return "Abbonamento{" +
                "idAbbonamento=" + idAbbonamento +
                ", dataInizio=" + dataInizio +
                ", validità=" + validità +
                ", user=" + user +
                ", abbonamento=" + abbonamento +
                '}';
    }

    public Abbonamento(Long idAbbonamento, Date dataInizio, boolean validità, User user, AbbonamentoEnum abbonamento) {
        this.idAbbonamento = idAbbonamento;
        this.dataInizio = dataInizio;
        this.validità = validità;
        this.user = user;
        this.abbonamento = abbonamento;
    }

    public Long getIdAbbonamento() {
        return idAbbonamento;
    }

    public void setIdAbbonamento(Long idAbbonamento) {
        this.idAbbonamento = idAbbonamento;
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public boolean isValidità() {
        return validità;
    }

    public void setValidità(boolean validità) {
        this.validità = validità;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AbbonamentoEnum getAbbonamento() {
        return abbonamento;
    }

    public void setAbbonamento(AbbonamentoEnum abbonamento) {
        this.abbonamento = abbonamento;
    }
}
