package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class AppTest
{

    @Test
    public void shouldToGo()
    {

        Car car1 = new Car(20, 10, 2021);

        assertEquals(true, car1.isCanGo());
        assertEquals(true, car1.isCanBeUsed(2022));
        assertEquals(200.0, car1.howManyKmToStop(), 0.01);
    }

    @Test
    public void shouldToStop()
    {

        Car car1 = new Car(0, 12, 2019);

        assertNotEquals(true, car1.isCanGo());
        assertNotEquals(true, car1.isCanBeUsed(2022));
        assertEquals(0, car1.howManyKmToStop(), 0.01);

    }

    @Test
    public void shouldCreateCar()
    {

        Car car1 = new Car(20, 10, 2021);

        assertEquals(20.0, car1.getFuel(),0.01);
        assertEquals(10.0, car1.getLitersPer100km(), 0.01);
        assertEquals(2021, car1.getYearOfInspection());

        Car car2 = new Car();
        car2.setFuel(20);
        car2.setLitersPer100km(10);
        car2.setYearOfInspection(2021);

        assertEquals(20.0, car2.getFuel(),0.01);
        assertEquals(10.0, car2.getLitersPer100km(), 0.01);
        assertEquals(2021, car2.getYearOfInspection());


    }

}
