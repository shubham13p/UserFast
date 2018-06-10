package com.example.shubhampatel.fastrack;

import android.app.LauncherActivity;

public class ListItem extends LauncherActivity.ListItem {
    private String item;

    public ListItem(){

    }

    public ListItem(String item){
        this.item = item;
    }

    public String getItem(){
        return item;
    }

    public void setItem(String item){
        this.item = item;
    }
}
