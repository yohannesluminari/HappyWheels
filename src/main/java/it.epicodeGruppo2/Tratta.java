package it.epicodeGruppo2;

public class Tratta {
    private String zonaPartenza;
    private String capolinea;
    private int numeroPercorsoPercorsi;
    private double tempoTragitto;

    @Override
    public String toString() {
        return "Tratta{" +
                "zonaPartenza='" + zonaPartenza + '\'' +
                ", capolinea='" + capolinea + '\'' +
                ", numeroPercorsoPercorsi=" + numeroPercorsoPercorsi +
                ", tempoTragitto=" + tempoTragitto +
                '}';
    }

    public Tratta(String zonaPartenza, String capolinea, int numeroPercorsoPercorsi, double tempoTragitto) {
        this.zonaPartenza = zonaPartenza;
        this.capolinea = capolinea;
        this.numeroPercorsoPercorsi = 0;
        this.tempoTragitto = 0;
    }

    public String getZonaPartenza() {
        return zonaPartenza;
    }

    public void setZonaPartenza(String zonaPartenza) {
        this.zonaPartenza = zonaPartenza;
    }

    public String getCapolinea() {
        return capolinea;
    }

    public void setCapolinea(String capolinea) {
        this.capolinea = capolinea;
    }

    public int getNumeroPercorsoPercorsi() {
        return numeroPercorsoPercorsi;
    }

    public void setNumeroPercorsoPercorsi(int numeroPercorsoPercorsi) {
        this.numeroPercorsoPercorsi = numeroPercorsoPercorsi;
    }

    public double getTempoTragitto() {
        return tempoTragitto;
    }

    public void setTempoTragitto(double tempoTragitto) {
        this.tempoTragitto = tempoTragitto;
    }
}
