package com.example.tcc.models;

import java.util.List;

public class Cart {
    private int prod_id;
    private String prod_name;
    private String prod_price;
    private String prod_img;

    public Cart(String prod_name, String prod_price, String prod_img) {
        this.prod_name = prod_name;
        this.prod_price = prod_price;
        this.prod_img = prod_img;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getProd_price() {
        return prod_price;
    }

    public void setProd_price(String prod_price) {
        this.prod_price = prod_price;
    }

    public String getProd_img() {
        return prod_img;
    }

    public void setProd_img(String prod_img) {
        this.prod_img = prod_img;
    }
}
