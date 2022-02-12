package com.models;

import javax.persistence.*;

@Entity
@Table(name = "colors")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int cat_id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
