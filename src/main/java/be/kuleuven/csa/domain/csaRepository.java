package be.kuleuven.csa.domain;

import java.util.List;

public interface csaRepository {

    List<Boerderij> getBoerderijByName(String boerderij);
    void saveNewBoerderij(Boerderij boerderij);
    void updateBoerderij(Boerderij boerderij);
    void deleteBoerderij(Boerderij boerderij);
    List<Product> getProductByName(String product);
    void saveNewProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
    List<Klant> getKlantByName(String klant);
    void saveNewKlant(Klant klant);
    void updateKlant(Klant klant);
    void deleteKlant(Klant klant);
    List<Pakketbeschrijving> getPakketbeschrijvingByName(String pakketbeschrijving);
    void saveNewPakketbeschrijving(Pakketbeschrijving pakketbeschrijving);
    void updatePakketbeschrijving(Pakketbeschrijving pakketbeschrijving);
    void deletePakketbeschrijving(Pakketbeschrijving pakketbeschrijving);
    void saveNewVerkoopt(Verkoopt verkoopt);
    void saveNewKoopt(Koopt koopt);
    void saveNewPakketinhoud(PakketInhoud pakketInhoud);




}