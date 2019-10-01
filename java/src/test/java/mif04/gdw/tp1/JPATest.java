package mif04.gdw.tp1;

import org.junit.Test;
import mif04.gdw.tp1.modele.Billet;
import mif04.gdw.tp1.modele.Categorie;
import mif04.gdw.tp1.modele.User;
import javax.persistence.*;

/**
 * Created by ecoquery on 26/09/2016.
 */
public class JPATest {

    @Test
    public void setupEMTest() {
        EntityManager em = Persistence.createEntityManagerFactory("pu-microblog").createEntityManager();
        /*User user1 = new User("testPseudo","testEmail");
        em.persist(user1);
        
        Categorie cat1 = new Categorie("testCat");
        em.persist(cat1);
        
        Billet billet1 = new Billet("testContenu", user1, "testTitre", cat1);
        em.persist(billet1);*/
        em.close();
    }

}
