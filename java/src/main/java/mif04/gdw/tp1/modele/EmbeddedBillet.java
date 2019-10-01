/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mif04.gdw.tp1.modele;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author lucas
 */
@Embeddable
public class EmbeddedBillet implements Serializable {
    
    @ManyToOne
    public Categorie categorie;
    @Column(name="TITRE")
    public String titre;
    
    public EmbeddedBillet(Categorie categorie,String titre){
        this.categorie= categorie;
        this.titre = titre;
    } 
}
