package com.company.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private Date bornDate;
    private List<Item> itemsList;

    public Person(String firstName, String lastName, Date bornDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornDate = bornDate;
        this.itemsList = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public void addItemToList(Item item){
        itemsList.add(item);
    }

    public List<Item> getItemsList() {
        return itemsList;
    }
}
