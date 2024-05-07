package it.epicodeGruppo2.Classi.Titoli;

public class Biglietto extends TitoloDiViaggio {
    private boolean attivato = false;


    public Biglietto(){

    }

    public Biglietto(boolean attivato) {
        this.attivato = attivato;
    }

    public boolean isAttivato() {
        return attivato;
    }

    public void setAttivato(boolean attivato) {
        this.attivato = attivato;
    }
}