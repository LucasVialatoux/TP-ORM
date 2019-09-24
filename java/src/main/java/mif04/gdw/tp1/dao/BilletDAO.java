package mif04.gdw.tp1.dao;

import mif04.gdw.tp1.modele.Billet;
import mif04.gdw.tp1.modele.Categorie;
import mif04.gdw.tp1.modele.User;

import javax.persistence.EntityManager;

/**
 * Created by ecoquery on 25/09/2016.
 */
public class BilletDAO {
    public BilletDAO(EntityManager em) {
        // TODO: compléter le constructeur
    }

    /**
     * Cherche un billet en fonction du titre et de la catégorie
     * @param titre le titre du billet cherché
     * @param categorie le nom de la catégorie du billet cherché
     * @return le billet cherché ou null s'il n'y a pas de billet correspondant
     */
    public Billet getBilletByTitreAndCategorie(String titre, String categorie) {
        // TODO: à compléter
        return null;
    }

    /**
     * Créée un nouveau billet
     * @param titre
     * @param categorie
     * @param contenu
     * @param user
     * @return le billet créé
     */
    public Billet create(String titre, Categorie categorie, String contenu, User user) {
        // TODO: compléter cette méthode
        return null;
    }
}
