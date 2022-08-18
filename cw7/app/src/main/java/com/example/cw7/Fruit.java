package com.example.cw7;

public class Fruit {

    private String fruitName ;
    private String fruitColor ;
    private int imageFurit ;

    public Fruit(String fruitName, String fruitColor, int imageFurit) {
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
        this.imageFurit = imageFurit;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }

    public int getImageFurit() {
        return imageFurit;
    }

    public void setImageFurit(int imageFurit) {
        this.imageFurit = imageFurit;
    }
}
