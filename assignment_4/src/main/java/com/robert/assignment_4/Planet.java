package com.robert.assignment_4;



import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Planet implements Serializable{
    String name;
    Drawable image;
    String radius;
    String temp;
    String text;

    public Planet (String name, Drawable image, String radius, String temp, String text){
        this.name = name;
        this.image = image;
        this.radius = radius;
        this.temp = temp;
        this.text = text;

    }

    public String getName() {
        return name;
    }

    public Drawable getImage() {
        return image;
    }

    public String getRadius() {
        return radius;
    }

    public String getTemp(){
        return temp;
    }

    public String getText(){
        return text;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setImage (Drawable image){
        this.image = image;
    }

    public void setRadius(String radius){
        this.radius = radius;
    }

    public void setTemp (String temp){
        this.temp = temp;
    }

    public void setText(String text){
        this.text = text;
    }
}