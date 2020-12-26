package be.kuleuven.csa.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PakketInhoud {
    @GeneratedValue
    @Id
    private int pakketInhoudId;
    @Column
    private String naam;
    @OneToMany(mappedBy = "pakketInhoud")
    private List<BehoortTot> behoortTotList;
    @OneToMany(mappedBy = "pakketInhoud")
    private List<Bevat> bevatList;


    public PakketInhoud(String naam) {
        this.naam = naam;
        this.behoortTotList = new ArrayList<>();
        this.bevatList = new ArrayList<>();
    }

    public List<Bevat> getBevatList() {
        return bevatList;
    }

    public List<BehoortTot> getBehoortTotList() {
        return behoortTotList;
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
