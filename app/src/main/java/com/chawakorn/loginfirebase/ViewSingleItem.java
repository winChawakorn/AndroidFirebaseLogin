package com.chawakorn.loginfirebase;

public class ViewSingleItem {
    private String Image_URL, Image_Title;

    public ViewSingleItem(String Image_URL, String Image_Title) {
        this.Image_URL = Image_URL;
        this.Image_Title = Image_Title;
    }

    public ViewSingleItem() {

    }

    public String getImage_URL() {
        return this.Image_URL;
    }

    public void setImage_URL(String Image_URL) {
        this.Image_URL = Image_URL;
    }

    public String getImage_Title() {
        return this.Image_Title;
    }

    public void setImage_Title(String Image_Title) {
        this.Image_Title = Image_Title;
    }
}
