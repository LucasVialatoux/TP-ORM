package mif04.gdw.tp1.dao;

import mif04.gdw.tp1.modele.User;

import javax.persistence.EntityManager;

/**
 * Created by ecoquery on 25/09/2016.
 */
public class UserDAO {
    public UserDAO(EntityManager em) {
        // TODO: compléter ce constructeur
    }

    /**
     * Renvoie l'utilisateur correspondant à cet email
     * @param email l'email de l'utilisateur
     * @return l'utilisateur ou null s'il n'existe pas
     */
    public User getUserByEmail(String email) {
        // TODO: compléter cette méthode
        return null;
    }

    /**
     * Créée un nouvel utilisateur ou met à jour son pseudo
     * @param email
     * @param pseudo
     * @return l'utilisateur créé ou lis à jour
     */
    public User createOrUpdate(String email, String pseudo) {
        // TODO: compléter cette méthode
        return null;
    }
}
