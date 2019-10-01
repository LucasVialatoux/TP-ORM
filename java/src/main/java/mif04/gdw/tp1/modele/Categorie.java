package mif04.gdw.tp1.modele;

import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import javax.persistence.*;

/**
 * Created by ecoquery on 25/09/2016.
 */
@Entity
@Table(name="CATEGORIE")
public class Categorie implements Serializable {
    
    @Id
    @Column(name="ID_CAT")
    @GeneratedValue()
    private int id_cat;
    
    private String nom;

    private static final Logger LOG = LoggerFactory.getLogger(Categorie.class);
    
    public Categorie(String nom){
        this.nom = nom;
    }

    /**
     * Renvoie le nom de la catégorie
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Renvoie les billets attachés à cette collection
     *
     * @return
     */
    public Collection<Billet> getBillets() {
        // TODO: à compléter
        return null;
    }

    public String getNomEncode() {
        try {
            return URLEncoder.encode(getNom(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            LOG.error("erreur d'encodage", e);
            return "erreur";
        }
    }
}
