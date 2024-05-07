package it.epicodeGruppo2.Classi.MezziDiTrasporto;

import it.epicodeGruppo2.Classi.BaseEntity;

import java.util.Date;

public class StatoMezzi extends BaseEntity {
    private StatoMezziEnum stato;
    private Date dataInizio;
    private Date dataFine;

    public StatoMezzi(StatoMezziEnum stato, Date dataInizio, Date dataFine) {
        this.stato = stato;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    public StatoMezziEnum getStato() {
        return stato;
    }

    public void setStato(StatoMezziEnum stato) {
        this.stato = stato;
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public void setDataFine(Date dataFine) {
        this.dataFine = dataFine;
    }
}
