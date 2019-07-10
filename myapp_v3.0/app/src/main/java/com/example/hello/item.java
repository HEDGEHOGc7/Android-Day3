package com.example.hello;

public class item {
    private String name;
    private String num;
    private int imageId;
    public item(String name, int imageId,String number) {
        this.name = name;
        this.imageId = imageId;
        this.num = number;
    }
    public String getName() {
        return name;
    }
    public String getNum() {
        return num;
    }
    public int getImageId() {
        return imageId;
    }
}
