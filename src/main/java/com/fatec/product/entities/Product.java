package com.fatec.product.entities;

public class Product {
    private Integer id;
    private String name;
    private String desc;
    private Number price;
    private Number qnt;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public Number getPrice() {
        return price;
    }
    public void setPrice(Number price) {
        this.price = price;
    }
    public Number getQnt() {
        return qnt;
    }
    public void setQnt(Number qnt) {
        this.qnt = qnt;
    }
    
}
