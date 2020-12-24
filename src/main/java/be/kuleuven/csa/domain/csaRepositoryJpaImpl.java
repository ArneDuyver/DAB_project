package be.kuleuven.csa.domain;

import javax.persistence.EntityManager;
import java.util.List;

public class csaRepositoryJpaImpl implements csaRepository {

    private final EntityManager entityManager;

    public csaRepositoryJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Boerderij> getBoerderijByName(String boerderij) {
        var criteriaBuilder = entityManager.getCriteriaBuilder();
        var query = criteriaBuilder.createQuery(Boerderij.class);
        var root = query.from(Boerderij.class);

        query.where(criteriaBuilder.equal(root.get("naam"), boerderij));
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void saveNewBoerderij(Boerderij boerderij) {
        entityManager.getTransaction().begin();
        entityManager.persist(boerderij);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateBoerderij(Boerderij boerderij) {
        entityManager.getTransaction().begin();
        entityManager.merge(boerderij);
        entityManager.getTransaction().commit();

    }

    @Override
    public void deleteBoerderij(Boerderij boerderij) {
        entityManager.getTransaction().begin();
        entityManager.remove(boerderij);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Product> getProductByName(String product) {
        var criteriabuilder = entityManager.getCriteriaBuilder();
        var query = criteriabuilder.createQuery(Product.class);
        var root = query.from(Product.class);

        query.where(criteriabuilder.equal(root.get("naam"), product));
        return entityManager.createQuery(query).getResultList() ;
    }

    @Override
    public void saveNewProduct(Product product) {
        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateProduct(Product product) {
        entityManager.getTransaction().begin();
        entityManager.merge(product);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteProduct(Product product) {
        entityManager.getTransaction().begin();
        entityManager.remove(product);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Klant> getKlantByName(String klant) {
        var criteriabuilder = entityManager.getCriteriaBuilder();
        var query = criteriabuilder.createQuery(Klant.class);
        var root = query.from(Klant.class);

        query.where(criteriabuilder.equal(root.get("naam"), klant));
        return entityManager.createQuery(query).getResultList() ;
    }

    @Override
    public void saveNewKlant(Klant klant) {
        entityManager.getTransaction().begin();
        entityManager.persist(klant);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateKlant(Klant klant) {
        entityManager.getTransaction().begin();
        entityManager.merge(klant);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteKlant(Klant klant) {
        entityManager.getTransaction().begin();
        entityManager.remove(klant);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Pakketbeschrijving> getPakketbeschrijvingByName(String pakketbeschrijving) {
        var criteriabuilder = entityManager.getCriteriaBuilder();
        var query = criteriabuilder.createQuery(Pakketbeschrijving.class);
        var root = query.from(Pakketbeschrijving.class);

        query.where(criteriabuilder.equal(root.get("naam"), pakketbeschrijving));
        return entityManager.createQuery(query).getResultList() ;
    }

    @Override
    public void saveNewPakketbeschrijving(Pakketbeschrijving pakketbeschrijving) {
        entityManager.getTransaction().begin();
        entityManager.persist(pakketbeschrijving);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updatePakketbeschrijving(Pakketbeschrijving pakketbeschrijving) {
        entityManager.getTransaction().begin();
        entityManager.merge(pakketbeschrijving);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deletePakketbeschrijving(Pakketbeschrijving pakketbeschrijving) {
        entityManager.getTransaction().begin();
        entityManager.remove(pakketbeschrijving);
        entityManager.getTransaction().commit();
    }

    @Override
    public void saveNewVerkoopt(Verkoopt verkoopt) {
        entityManager.getTransaction().begin();
        entityManager.persist(verkoopt);
        entityManager.getTransaction().commit();
    }
}
