package mif04.gdw.tp1.modele;

import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.persistence.*;

/**
 * Created by ecoquery on 25/09/2016.
 */
@Entity
@Table(name="BILLET")
public class Billet implements Serializable {
    private static final Logger LOG = LoggerFactory.getLogger(Billet.class);
    
    @Column(name="CONTENU")
    @Lob
    private String contenu;
    
    @ManyToOne
    private User user;
    
    @EmbeddedId
    EmbeddedBillet emBillet;
    
    public Billet(String contenu, User user, String titre, Categorie cat){
        emBillet = new EmbeddedBillet(cat,titre);
        this.contenu = contenu;
        this.user = user;
    }


    /**
     * Renvoie l'utilisateur ayant écrit ce billet
     *
     * @return
     */
    public User getUser() {
        return user;
    }

    /**
     * Renvoie la catégorie du billet
     *
     * @return la catégorie du billet
     */
    public Categorie getCategorie() {
        return emBillet.categorie;
    }

    /**
     * Renvoie le titre du billet
     *
     * @return le titre
     */
    public String getTitre() {
        return emBillet.titre;
    }

    /**
     * Renvoie le texte du billet
     * @return le contenu
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * Met à jour le contenu du billet
     *
     * @param contenu
     */
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    /**
     * Le titre du billet encode pour les urls
     *
     * @return titre encodé
     */
    public String getTitreEncode() {
        try {
            return URLEncoder.encode(getTitre(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            LOG.error("erreur d'encodage", e);
            return "erreur";
        }
    }
}

