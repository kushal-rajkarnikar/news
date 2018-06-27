package com.example.aero.myapplication;

public class News {

    private int id;
    private String title, published_date;
    private int image;

    public News(int id, String title, String published_date, int image) {
        this.id = id;
        this.title = title;
        this.published_date = published_date;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublished_date() {
        return published_date;
    }

    public int getImage() {
        return image;
    }
}
