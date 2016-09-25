package mif04.gdw.tp1.itf;

import mif04.gdw.tp1.modele.Billet;
import mif04.gdw.tp1.modele.Categorie;
import mif04.gdw.tp1.modele.User;

import java.util.List;

/**
 * Created by ecoquery on 25/09/2016.
 */
public class ViewContext {
    private User user;
    private Billet billet;
    private List<Categorie> categories;

    public ViewContext(User user, Billet billet, List<Categorie> categories) {
        this.user = user;
        this.billet = billet;
        this.categories = categories;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Billet getBillet() {
        return billet;
    }

    public void setBillet(Billet billet) {
        this.billet = billet;
    }

    public List<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }
}
