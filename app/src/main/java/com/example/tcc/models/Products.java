package com.example.tcc.models;

import java.io.Serializable;

public class  Products implements Serializable {

    private int prod_id;
    private String prod_name;
    private String prod_desc;
    private String prod_brand;
    private String prod_price;
    private int prod_quant;
    private String prod_img;
    private int prod_min_quant;
    private int fk_category;

    public int getProd_id() {
        return prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public String getProd_desc() {
        return prod_desc;
    }

    public String getProd_brand() {
        return prod_brand;
    }

    public String getProd_price() {
        return prod_price;
    }

    public int getProd_quant() {
        return prod_quant;
    }

    public String getProd_img() {
        return prod_img;
    }

    public int getProd_min_quant() {
        return prod_min_quant;
    }

    public int getFk_category() {
        return fk_category;
    }

    @Override
    public String toString() {
        return "ProductsGET{" +
                "prod_id=" + prod_id +
                ", prod_name='" + prod_name + '\'' +
                ", prod_desc='" + prod_desc + '\'' +
                ", prod_brand='" + prod_brand + '\'' +
                ", prod_price='" + prod_price + '\'' +
                ", prod_quant=" + prod_quant +
                ", prod_img='" + prod_img + '\'' +
                ", prod_min_quant=" + prod_min_quant +
                ", fk_category=" + fk_category +
                '}';
    }
}
