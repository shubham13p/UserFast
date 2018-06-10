package com.example.shubhampatel.fastrack;

import android.app.LauncherActivity;

import java.util.ArrayList;

public class UserList {

    private String listName;
    private String userID;
    private ArrayList<LauncherActivity.ListItem> listItems = new ArrayList<LauncherActivity.ListItem>();

    public UserList(){

    }

    public UserList(String listName){
        this.listName = listName;
    }



    public String getListName(){
        return listName;
    }

    public void setListName(String listName){
        this.listName = listName;
    }

    public ArrayList<LauncherActivity.ListItem> getListItems() {
        return listItems;
    }

    public void setListItems(ArrayList<LauncherActivity.ListItem> listItems) {
        this.listItems = listItems;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}


