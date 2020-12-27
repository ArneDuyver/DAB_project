package be.kuleuven.csa.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Verkoopt {
    @Id
    @GeneratedValue
    private int verkooptId;
    @Column
    private int prijs;
    @Column
    private String startdatum;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "boerderijId")
    private Boerderij boerderij;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PakketbeschrijvingId")
    private Pakketbeschrijving pakketbeschrijving;
    @OneToMany(mappedBy = "verkoopt")
    private List<Koopt> kooptList;
    @OneToMany(mappedBy = "verkoopt")
    private List<BehoortTot> behoortTotList;


    public Verkoopt(int prijs, String startdatum, Boerderij boerderij,Pakketbeschrijving pakketbeschrijving) {
        this.prijs = prijs;
        this.startdatum = startdatum;
        this.boerderij = boerderij;
        boerderij.getVerkooptList().add(this);
        this.pakketbeschrijving = pakketbeschrijving;
        pakketbeschrijving.getVerkooptList().add(this);
        this.kooptList = new ArrayList<Koopt>();
        this.behoortTotList = new ArrayList<>();
    }

    public List<BehoortTot> getBehoortTotList() {
        return behoortTotList;
    }

    public List<Koopt> getKooptList() {
        return kooptList;
    }

    public int getPrijs() {
        return prijs;
    }

    public String getStartdatum() {
        return startdatum;
    }

    public Boerderij getBoerderij() {
        return boerderij;
    }


    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public void setStartdatum(String startdatum) {
        this.startdatum = startdatum;
    }

    public void setBoerderij(Boerderij boerderij) {
        this.boerderij = boerderij;
    }

}
