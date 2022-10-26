package org.example;

//import lombok.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Car {

    private double fuel;
    private double litersPer100km;
    private int yearOfInspection;


    public boolean isCanGo(){
        return (fuel > 0);
    }

    public boolean isCanBeUsed(int currentYear){
        return (currentYear-yearOfInspection <= 2);
    }

    public double howManyKmToStop(){

        if (litersPer100km == 0) {
            return 0;
        }

        return (100 * fuel / litersPer100km);

    }


}
