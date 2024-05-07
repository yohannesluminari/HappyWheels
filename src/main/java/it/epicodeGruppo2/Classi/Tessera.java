package it.epicodeGruppo2.Classi;

import it.epicodeGruppo2.Classi.Titoli.Abbonamento;

import java.util.Date;

public class Tessera extends BaseEntity{
    private Long codiceTessera;
    private Date dataErogazione;
    private Date dataScadenza;
    private Abbonamento abbonamento;

    public Tessera(){

    }

    @Override
    public String toString() {
        return "Tessera{" +
                "codiceTessera=" + codiceTessera +
                ", dataErogazione=" + dataErogazione +
                ", dataScadenza=" + dataScadenza +
                ", abbonamento=" + abbonamento +
                '}';
    }

    public Tessera(Long codiceTessera, Date dataErogazione, Date dataScadenza, Abbonamento abbonamento) {
        this.codiceTessera = codiceTessera;
        this.dataErogazione = dataErogazione;
        this.dataScadenza = dataScadenza;
        this.abbonamento = abbonamento;
    }

    public Long getCodiceTessera() {
        return codiceTessera;
    }

    public void setCodiceTessera(Long codiceTessera) {
        this.codiceTessera = codiceTessera;
    }

    public Date getDataErogazione() {
        return dataErogazione;
    }

    public void setDataErogazione(Date dataErogazione) {
        this.dataErogazione = dataErogazione;
    }

    public Date getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(Date dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public Abbonamento getAbbonamento() {
        return abbonamento;
    }

    public void setAbbonamento(Abbonamento abbonamento) {
        this.abbonamento = abbonamento;
    }
}
