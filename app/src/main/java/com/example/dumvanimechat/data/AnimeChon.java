package com.example.dumvanimechat.data;

public class AnimeChon {
    String name;
    String cap;
    int avata;

    public AnimeChon(int avata,String name, String cap) {
        this.name = name;
        this.cap = cap;
        this.avata = avata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public int getAvata() {
        return avata;
    }

    public void setAvata(int avata) {
        this.avata = avata;
    }
}
