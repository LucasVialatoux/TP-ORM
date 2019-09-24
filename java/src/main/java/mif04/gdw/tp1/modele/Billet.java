package mif04.gdw.tp1.modele;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by ecoquery on 25/09/2016.
 */
public class Billet {
    private static final Logger LOG = LoggerFactory.getLogger(Billet.class);


    /**
     * Renvoie l'utilisateur ayant écrit ce billet
     *
     * @return
     */
    public User getUser() {
        // TODO: à compléter
        return null;
    }

    /**
     * Renvoie la catégorie du billet
     *
     * @return la catégorie du billet
     */
    public Categorie getCategorie() {
        // TODO: à compléter
        return null;
    }

    /**
     * Renvoie le titre du billet
     *
     * @return le titre
     */
    public String getTitre() {
        // TODO: à compléter
        return null;
    }

    /**
     * Renvoie le texte du billet
     * @return
     */
    public String getContenu() {
        // TODO: à compléter
        return null;
    }

    /**
     * Met à jour le contenu du billet
     *
     * @param contenu
     */
    public void setContenu(String contenu) {
        // TODO: à compléter
    }

    /**
     * Le titre du billet encode pour les urls
     *
     * @return
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
