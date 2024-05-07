package it.epicodeGruppo2.Classi.Titoli;

import it.epicodeGruppo2.Classi.BaseEntity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class TitoloDiViaggio extends BaseEntity {

    private long codiceUnivoco;

    public long getCodiceUnivoco() {
        return codiceUnivoco;
    }

    public void setCodiceUnivoco(long codiceUnivoco) {
        this.codiceUnivoco = codiceUnivoco;
    }
}
