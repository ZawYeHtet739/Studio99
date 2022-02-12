package com.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int cat_id;

    private String name;

    private String image_01;

    private String image_02;

    private String image_03;

    private String image_04;

    private int price;

    private String stock;

    private String description;

    private String details;


    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false, insertable = false)
    private Timestamp created_at;

    @CreationTimestamp
    @Column(name = "updated_at", nullable = false, updatable = false, insertable = false)
    private Timestamp updated_at;

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

    public String getImage_01() {
        return image_01;
    }

    public void setImage_01(String image_01) {
        this.image_01 = image_01;
    }

    public String getImage_02() {
        return image_02;
    }

    public void setImage_02(String image_02) {
        this.image_02 = image_02;
    }

    public String getImage_03() {
        return image_03;
    }

    public void setImage_03(String image_03) {
        this.image_03 = image_03;
    }

    public String getImage_04() {
        return image_04;
    }

    public void setImage_04(String image_04) {
        this.image_04 = image_04;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

}
