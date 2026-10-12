package com.example.model.singletable;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "vehicule_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String marque;

    public Vehicule() {
    }

    public Vehicule(String marque) {
        this.marque = marque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
