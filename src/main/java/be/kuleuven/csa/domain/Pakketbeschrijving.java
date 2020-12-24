package be.kuleuven.csa.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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
    @OneToMany(mappedBy = "Pakketbeschrijving")
    private Set<Verkoopt> boerderijen = new HashSet<Verkoopt>(); ;


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

    public Set<Verkoopt> getBoerderijen() {
        return boerderijen;
    }

    @Override
    public String toString() {
        return "Pakketbeschrijving{" +
                "pakketBeschrijvingId=" + pakketBeschrijvingId +
                ",naam='" + naam + '\'' +
                ", grootte='" + grootte + '\'' +
                ", volwassenen=" + volwassenen +
                ", kinderen=" + kinderen +
                '}';
    }
}
