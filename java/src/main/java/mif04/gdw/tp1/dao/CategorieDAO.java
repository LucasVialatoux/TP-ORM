package mif04.gdw.tp1.dao;

import mif04.gdw.tp1.modele.Categorie;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ecoquery on 25/09/2016.
 */
public class CategorieDAO {
    public CategorieDAO(EntityManager em) {
        // TODO: compléter ce constructeur
    }

    public List<Categorie> getAllCategories() {
        // TODO: compléter cette méthode
        return new ArrayList<>();
    }

    /**
     * Créée une nouvelle catégorie en fonction de son nom ou renvoie une catégorie si elle existe déjà.
     *
     * @param nomCategorie
     * @return
     */
    public Categorie getOrCreate(String nomCategorie) {
        // TODO: compléter cette méthode
        return null;
    }
}
