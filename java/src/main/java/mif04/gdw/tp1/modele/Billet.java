package mif04.gdw.tp1.modele;

import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ecoquery on 25/09/2016.
 */
@Entity
@Table(name="BILLET")
public class Billet implements Serializable {
    private static final Logger LOG = LoggerFactory.getLogger(Billet.class);
    @Column(name="CONTENU")
    private String contenu;
    @Column(name="USER_EMAIL")
    private String user_email;
    @EmbeddedId
    EmbeddedBillet emBillet;
    
    public Billet(String contenu, String user_email, String titre, int id_cat){
        emBillet = new EmbeddedBillet(id_cat,titre);
        this.contenu = contenu;
        this.user_email = user_email;
    }


    /**
     * Renvoie l'utilisateur ayant écrit ce billet
     *
     * @return
     */
    public User getUser() {
        return null;
    }

    /**
     * Renvoie la catégorie du billet
     *
     * @return la catégorie du billet
     */
    public Categorie getCategorie() {
        int id_cat = emBillet.getId_cat();
        return null;
    }

    /**
     * Renvoie le titre du billet
     *
     * @return le titre
     */
    public String getTitre() {
        return emBillet.getTitre();
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

