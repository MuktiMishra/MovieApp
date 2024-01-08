package com.example.movieapp;

public class item_model {
    private int image;
    private String movie;
    private String date;

    public item_model(int image, String movie, String date){

        this.image= image;
        this.movie=movie;
        this.date= date;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
