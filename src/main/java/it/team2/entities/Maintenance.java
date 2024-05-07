package it.team2.entities;

//public class maintenance {
//la manutenzione è un elenco in cui devono essere comprese data di inizio data di fine e id oppure targa di un veicolo o di un mezzo
// che è andato in manutenzione. antonio dobbaimo lavorare insieme
//}


import java.util.Date;

public class Maintenance {
    private Long id;
    private Date startDate;
    private Date endDate;
    private Vehicle vehicle;

    public Maintenance(Date startDate, Vehicle veicolo) {
        this.startDate = startDate;
        this.vehicle = veicolo;
    }

    public Maintenance(Date startDate, Date endDate, Vehicle veicolo) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.vehicle = veicolo;
    }

    // Getters and setters
}


