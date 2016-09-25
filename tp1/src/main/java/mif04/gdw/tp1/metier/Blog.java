package mif04.gdw.tp1.metier;

import mif04.gdw.tp1.dao.BilletDAO;
import mif04.gdw.tp1.dao.CategorieDAO;
import mif04.gdw.tp1.dao.UserDAO;
import mif04.gdw.tp1.modele.Categorie;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by ecoquery on 25/09/2016.
 */
public class Blog {
    private BilletDAO billetDAO;
    private CategorieDAO categorieDAO;
    private UserDAO userDAO;
    private EntityManager em;

    public Blog(EntityManager em) {
        this.em = em;
        this.billetDAO = new BilletDAO(this.em);
        this.categorieDAO = new CategorieDAO(em);
        this.userDAO = new UserDAO(em);
    }

    public List<Categorie> getCategories() {
        return categorieDAO.getAllCategories();
    }
}
