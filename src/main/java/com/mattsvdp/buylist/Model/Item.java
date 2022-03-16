package com.mattsvdp.buylist.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int amount;

    public Item(){}

    public Item(String name, int amount){
        this.name = name;
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
}
