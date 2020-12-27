package be.kuleuven.csa.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Boerderij {
    @Id
    @GeneratedValue
    private int boerderijId;

    @Column
    private String naam;
    @Column
    private String adres;
    @Column
    private String email;
    @Column
    private String rekeningnummer;
    @Column
    private int opbrengst;
    @OneToMany(mappedBy = "boerderij")
    private List<Verkoopt> verkooptList;

    public Boerderij() {
    }

    public Boerderij(String naam, String adres, String email, String rekeningnummer) {
        this.naam = naam;
        this.adres = adres;
        this.email = email;
        this.rekeningnummer = rekeningnummer;
        this.verkooptList = new ArrayList<Verkoopt>();
    }

    public List<Verkoopt> getVerkooptList() {
        return verkooptList;
    }

    public int getBoerderijId() {
        return boerderijId;
    }

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }

    public String getEmail() {
        return email;
    }

    public String getRekeningnummer() {
        return rekeningnummer;
    }

    public int getOpbrengst() {
        return opbrengst;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRekeningnummer(String rekeningnummer) {
        this.rekeningnummer = rekeningnummer;
    }

    public void setOpbrengst(int opbrengst) {
        this.opbrengst = opbrengst;
    }

   // public Set<Verkoopt> getPakketbeschrijvingen() {
     //   return pakketbeschrijvingen;
    //}

    @Override
    public String toString() {
        return "Boerderij{" +
                "BoerderijId=" + boerderijId +
                ",naam='" + naam + '\'' +
                ", adres='" + adres + '\'' +
                ", email=" + email +
                ", rekeningnummer=" + rekeningnummer +
                ", opbrengst=" + opbrengst +
                '}';
    }
}
