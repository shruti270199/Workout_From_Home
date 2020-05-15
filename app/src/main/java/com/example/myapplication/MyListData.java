package com.example.myapplication;

public class MyListData {
    private String mainText;
    private String description;
    private int imgid;

    public MyListData(String mainText, String description, int imgid) {
        this.mainText = mainText;
        this.description =  description;
        this.imgid = imgid;
    }

    public String getMainText() {
        return mainText;
    }

    public String getDescription() {
        return description;
    }

    public int getImgid() {
        return imgid;
    }

    public void setMainText(String mainText){
        this.mainText = mainText;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setImgid(int imgid){
        this.imgid = imgid;
    }
}
