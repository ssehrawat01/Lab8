package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private ArrayList<City> citylist = new ArrayList<>();

    @Test
    public void testAddCity() {

        CustomList cityList = new CustomList(null, citylist);
        City city = new City("Edmonton", "AB");
        cityList.addCity(city);
        assertEquals(1, cityList.getCount());
    }

    @Test
    void testHasCity() {
        CustomList cityList = new CustomList(null, citylist);
        City city1 = new City("Mumbai", "Maharashtra");
        cityList.addCity(city1);
        City city2 = new City("Jaipur", "Rajasthan");
        assertTrue(cityList.hasCity(city1));
        assertFalse(cityList.hasCity(city2));
    }

    @Test
    void testCountCities() throws Exception {
        CustomList cityList = new CustomList(null, citylist);
        City city1 = new City("Mumbai", "Maharashtra");
        cityList.add(city1);
        City city2 = new City("Jaipur", "Rajasthan");
        cityList.add(city2);
        assertEquals(3, cityList.countCities());
    }
}
