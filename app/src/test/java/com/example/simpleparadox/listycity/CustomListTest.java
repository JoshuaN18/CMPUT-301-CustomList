package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize + 1, list.getCount());
    }

    @Test
    public void hasCity(){
        list.addCity(new City("Edmonton", "Alberta"));
        assertTrue(list.hasCity("Edmonton"));
    }

    @Test
    public void deleteCity(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        list.deleteCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize, list.getCount());
    }
}