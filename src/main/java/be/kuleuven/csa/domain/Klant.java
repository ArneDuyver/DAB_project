package be.kuleuven.csa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Klant {
    @Id
    @GeneratedValue
    private int klantId;
    @Column
    private String naam;
    @Column
    private String adres;
    @Column
    private String email;
    @Column
    private String telefoonnummer;

    public Klant(String naam, String adres, String email, String telefoonnummer) {
        this.naam = naam;
        this.adres = adres;
        this.email = email;
        this.telefoonnummer = telefoonnummer;
    }

    public int getKlantId() {
        return klantId;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }
    @Override
    public String toString() {
        return "Klant{" +
                "klantId=" + klantId +
                ",naam='" + naam + '\'' +
                ", adres='" + adres + '\'' +
                ", email=" + email +
                ", telefoonnummer=" + telefoonnummer +
                '}';
    }
}
