package com.example.android.samisg4.models;

import com.google.gson.annotations.SerializedName;

import java.security.PrivateKey;
import java.util.List;
import java.util.jar.Attributes;

public class BaseClass {


        @SerializedName("items")
    private List <Item> items = null;

    public BaseClass(List <Item> items) {
        this.items = items;
    }

    public List <Item> getItems() {
        return items;
    }


}
