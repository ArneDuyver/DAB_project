package be.kuleuven.csa.domain;

import javax.persistence.Persistence;

public class dbTest {
        public static void main(String[] args) {
            System.out.println("Bootstrapping JPA/Hibernate...");
            var sessionFactory = Persistence.createEntityManagerFactory("be.kuleuven.csa.domain");
            var entityManager = sessionFactory.createEntityManager();

            System.out.println("Bootstrapping Repository...");
            var repo = new csaRepositoryJpaImpl(entityManager);

            System.out.println("Persisting nieuwehuis,appel, Kamiel...");
            var nieuwhuis = new Boerderij("nieuwhuis", "Boshoeve 11", "kamiel.allard@hotmail.com","BE45 4555 4555 4555");
            var appel = new Product("appel", "fruit");
            var Kamiel = new Klant("Allard Kamiel","Boshoeve 11", "kamiel.allard@hotmail.com", "0497688279");
            var medium = new Pakketbeschrijving("medium",2,1);
            var verkoopt = new Verkoopt(200,"2020-12-24",nieuwhuis,medium);
            var verkoopt2 = new Verkoopt(300, "2020-12-24",nieuwhuis,medium);
            repo.saveNewBoerderij(nieuwhuis);
            repo.saveNewProduct(appel);
            repo.saveNewKlant(Kamiel);
            repo.saveNewPakketbeschrijving(medium);
            repo.saveNewVerkoopt(verkoopt);
            nieuwhuis.setAdres("Boshoeve 12");
            appel.setNaam("jonagold");
            Kamiel.setEmail("kamiel.allard@student.uhasselt.com");
            repo.updateBoerderij(nieuwhuis);
            repo.updateProduct(appel);
            repo.updateKlant(Kamiel);
            var testdelete =new Boerderij("nieuwhuis", "Boshoeve 11", "kamiel.allard@hotmail.com","BE45 4555 4555 4555");
            //repo.deleteBoerderij(testdelete);// werkt niet want id gaat omhoog
            //repo.deleteBoerderij(nieuwhuis);// werkt wel

            isBoerderijEr(repo);
            isKlantEr(repo);
            isProductEr(repo);



        }

        private static void isBoerderijEr(csaRepositoryJpaImpl repo) {
            System.out.println("Is Boerderij er?");
            for(var eenStudent : repo.getBoerderijByName("nieuwhuis")) {
                System.out.println(eenStudent);
            }
        }
        private static void isProductEr(csaRepositoryJpaImpl repo) {
            System.out.println("Is Product er?");
            for(var eenStudent : repo.getProductByName("jonagold")) {
                System.out.println(eenStudent);
            }
        }
        private static void isKlantEr(csaRepositoryJpaImpl repo) {
            System.out.println("Is Klant er?");
            for(var eenStudent : repo.getKlantByName("Allard Kamiel")) {
                System.out.println(eenStudent);
            }
        }
}

