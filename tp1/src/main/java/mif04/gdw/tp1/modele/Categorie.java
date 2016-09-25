package mif04.gdw.tp1.modele;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;

/**
 * Created by ecoquery on 25/09/2016.
 */
public class Categorie {

    private static final Logger LOG = LoggerFactory.getLogger(Categorie.class);

    /**
     * Renvoie le nom de la catégorie
     *
     * @return
     */
    public String getNom() {
        // TODO: à compléter
        return null;
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
