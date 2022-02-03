package com.company.service;

import com.company.model.Item;
import com.company.model.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Shedule {


    public void printExampleToDo() {
        Person person1;
        Person person2;
        try {
            person1 = new Person("Jonas", "Jonaitis", new SimpleDateFormat("yyyy-MM-dd").parse("1986-09-04"));
            person2 = new Person("Petras", "Petraitis", new SimpleDateFormat("yyyy-MM-dd").parse("1999-12-04"));

            person1.addItemToList(new Item("Do dishes till tomorrow."));
            person1.addItemToList(new Item("Sleep a bit."));

            for(Item item:person1.getItemsList()){
                System.out.println(item.getItem());
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
