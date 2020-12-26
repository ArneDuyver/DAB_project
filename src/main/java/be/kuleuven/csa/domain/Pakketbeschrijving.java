package be.kuleuven.csa.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pakketbeschrijving {
    @Id
    @GeneratedValue
    private int pakketBeschrijvingId;

    @Column
    private String naam;
    @Column
    private int volwassenen;
    @Column
    private int kinderen;
    @OneToMany(mappedBy = "boerderij")
    private List<Verkoopt> verkooptList;


    public Pakketbeschrijving(String naam, int volwassenen, int kinderen) {
        this.naam = naam;
        this.volwassenen = volwassenen;
        this.kinderen = kinderen;
        this.verkooptList = new ArrayList<Verkoopt>();
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVolwassenen(int volwassenen) {
        this.volwassenen = volwassenen;
    }

    public void setKinderen(int kinderen) {
        this.kinderen = kinderen;
    }

    public int getPakketBeschrijvingId() {
        return pakketBeschrijvingId;
    }

    public String getNaam() {
        return naam;
    }

    public int getVolwassenen() {
        return volwassenen;
    }

    public int getKinderen() {
        return kinderen;
    }

    public List<Verkoopt> getVerkooptList() {
        return verkooptList;
    }

    @Override
    public String toString() {
        return "Pakketbeschrijving{" +
                "pakketBeschrijvingId=" + pakketBeschrijvingId +
                ",naam='" + naam + '\'' +
                ", volwassenen=" + volwassenen +
                ", kinderen=" + kinderen +
                '}';
    }
}
