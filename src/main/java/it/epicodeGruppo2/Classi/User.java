package it.epicodeGruppo2.Classi;

import java.util.Date;

public class User extends BaseEntity {
    private Long idUser;
    private String nome;
    private String cognome;
    private Date dataNascita;
    private Tessera tessera;

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", tessera=" + tessera +
                '}';
    }

    public User(){

    }
    public User(Long idUser, String nome, String cognome, Date dataNascita, Tessera tessera) {
        this.idUser = idUser;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.tessera = tessera;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Tessera getTessera() {
        return tessera;
    }

    public void setTessera(Tessera tessera) {
        this.tessera = tessera;
    }

}
