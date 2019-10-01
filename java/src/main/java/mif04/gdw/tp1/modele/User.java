package mif04.gdw.tp1.modele;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Created by ecoquery on 25/09/2016.
 */
@Entity
@Table(name="USERS")
public class User implements Serializable {
    private String pseudo;
    
    @Column(name="EMAIL")
    @Id String email;

    public User(String pseudo, String email) {
        this.pseudo = pseudo;
        this.email = email;
    }
    /**
     * Renvoie le pseudo de l'utilisateur
     * @return pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * Renvoie l'email de l'utilisateur
     * @return email
     */
    public String getEmail() {
        return email;
    }
}
