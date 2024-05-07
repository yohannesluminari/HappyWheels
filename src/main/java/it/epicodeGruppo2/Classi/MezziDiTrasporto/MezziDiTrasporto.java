package it.epicodeGruppo2.Classi.MezziDiTrasporto;

import it.epicodeGruppo2.Classi.BaseEntity;

public class MezziDiTrasporto extends BaseEntity {
    private String targa;
    private StatoMezzi stato;
    private Tratta trattaAssegnata;
    private static int numeroBigliettiVidimati = 0;

    public MezziDiTrasporto(){

    }

    public MezziDiTrasporto(String targa, StatoMezzi stato, Tratta trattaAssegnata) {
        this.targa = targa;
        this.stato = stato;
        this.trattaAssegnata = trattaAssegnata;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public StatoMezzi getStato() {
        return stato;
    }

    public void setStato(StatoMezzi stato) {
        this.stato = stato;
    }

    public Tratta getTrattaAssegnata() {
        return trattaAssegnata;
    }

    public void setTrattaAssegnata(Tratta trattaAssegnata) {
        this.trattaAssegnata = trattaAssegnata;
    }

    public static int getNumeroBigliettiVidimati() {
        return numeroBigliettiVidimati;
    }

    public static void setNumeroBigliettiVidimati(int numeroBigliettiVidimati) {
        MezziDiTrasporto.numeroBigliettiVidimati = numeroBigliettiVidimati;
    }

}



