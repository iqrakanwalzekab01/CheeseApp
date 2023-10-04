package com.example.hp.myapplication.Model;

public class Cheese {


    private String Name;
    private String Description;
    private String image;
    private String price;
public Cheese(){



}
    public Cheese(String name, String description, String image, String price) {
        Name = name;
        Description = description;
        this.image = image;
        this.price = price;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
