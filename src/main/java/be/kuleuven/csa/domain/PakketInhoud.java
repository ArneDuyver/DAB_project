package be.kuleuven.csa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PakketInhoud {
    @GeneratedValue
    @Id
    private int pakketInhoudId;
    @Column
    private String naam;

    public PakketInhoud(String naam) {
        this.naam = naam;
    }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPakketInhoudId() {
        return pakketInhoudId;
    }
}
