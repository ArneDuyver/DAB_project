package be.kuleuven.csa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pakketbeschrijving {
    @Id
    @GeneratedValue
    private int pakketBeschrijvingId;

    @Column
    private String naam;
    @Column
    private String grootte;
    @Column
    private int volwassenen;
    @Column
    private int kinderen;

    public Pakketbeschrijving(String naam, int volwassenen, int kinderen) {
        this.naam = naam;
        this.volwassenen = volwassenen;
        this.kinderen = kinderen;
        this.grootte  = ""+naam+volwassenen+kinderen;
    }

    public void setNaam(String naam) {
        this.naam = naam;
        this.grootte  = ""+naam+volwassenen+kinderen;
    }

    public void setVolwassenen(int volwassenen) {
        this.volwassenen = volwassenen;
        this.grootte  = ""+naam+volwassenen+kinderen;
    }

    public void setKinderen(int kinderen) {
        this.kinderen = kinderen;
        this.grootte  = ""+naam+volwassenen+kinderen;

    }

    public int getPakketBeschrijvingId() {
        return pakketBeschrijvingId;
    }

    public String getNaam() {
        return naam;
    }

    public String getGrootte() {
        return grootte;
    }

    public int getVolwassenen() {
        return volwassenen;
    }

    public int getKinderen() {
        return kinderen;
    }
}
