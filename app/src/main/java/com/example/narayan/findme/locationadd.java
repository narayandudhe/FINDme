package com.example.narayan.findme;

public class locationadd {
    String titleLoc;
    String addressLoc;

    public locationadd() {
    }

    public locationadd(String titleLoc, String addressLoc) {
        this.titleLoc = titleLoc;
        this.addressLoc = addressLoc;
    }

    public String getTitleLoc() {
        return titleLoc;
    }

    public void setTitleLoc(String titleLoc) {
        this.titleLoc = titleLoc;
    }

    public String getAddressLoc() {
        return addressLoc;
    }

    public void setAddressLoc(String addressLoc) {
        this.addressLoc = addressLoc;
    }
}
