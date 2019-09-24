/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mif04.gdw.tp1.modele;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author lucas
 */
@Embeddable
public class EmbeddedBillet implements Serializable {
    @Column(name="ID_CAT")
    private int id_cat;
    @Column(name="TITRE")
    private String titre;
    
    public EmbeddedBillet(int id_cat,String titre){
        this.id_cat= id_cat;
        this.titre = titre;
    }

    /**
     * @return l'identifiant de la catégorie
     */
    public int getId_cat() {
        return id_cat;
    }

    /**
     * @return le titre
     */
    public String getTitre() {
        return titre;
    }
    
    
}
