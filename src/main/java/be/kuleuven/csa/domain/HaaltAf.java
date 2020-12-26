package be.kuleuven.csa.domain;

import javax.persistence.*;

@Entity
public class HaaltAf {
    @GeneratedValue
    @Id
    private int haaltAfId;
    @Column
    private boolean afgehaald;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BehoortTotId")
    private BehoortTot behoortTot;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KlantId")
    private Klant klant;

    public HaaltAf(BehoortTot behoortTot, Klant klant) {
        this.behoortTot = behoortTot;
        behoortTot.getHaaltAfList().add(this);
        this.klant = klant;
        klant.getHaaltAfList().add(this);
        this.afgehaald = false;
    }

    public void setAfgehaald(boolean afgehaald) {
        this.afgehaald = afgehaald;
    }

    public void setBehoortTot(BehoortTot behoortTot) {
        this.behoortTot = behoortTot;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public boolean isAfgehaald() {
        return afgehaald;
    }

    public BehoortTot getBehoortTot() {
        return behoortTot;
    }

    public Klant getKlant() {
        return klant;
    }
}
