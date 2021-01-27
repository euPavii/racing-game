package org.fasttrackit;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello World!");

        Car carReference = new Car(); // tip de date+denumire
        carReference.name = "Ferrari";
        carReference.maxSpeed = 300;
        carReference.fuelLevel = 60;
        carReference.mileage = 12.5;
        carReference.totalTraveledDistance = 0;
        carReference.damaged = true;
        carReference.doorCount = 1;
        carReference.color = "Red";

        // concatenation
        System.out.println("Properties of car " + carReference.name);
        System.out.println("Max speed: " + carReference.maxSpeed);
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Total Traveled Distance: " + carReference.totalTraveledDistance);
        System.out.println("Damaged: " + carReference.damaged);
        System.out.println("Door Count: " + carReference.doorCount);
        System.out.println("Color: " + carReference.color);

        Car car2 = new Car();
        car2.name = "Renault";
        car2.fuelLevel = 70;
        car2.totalTraveledDistance = 100;
        System.out.println("Properties of car " + car2.name);
        System.out.println("Max speed: " + car2.maxSpeed);
        System.out.println("Fuel level: " + car2.fuelLevel);
        System.out.println("Mileage: " + car2.mileage);
        System.out.println("Total Traveled Distance: " + car2.totalTraveledDistance);
        System.out.println("Damaged: " + car2.damaged);
        System.out.println("Door Count: " + car2.doorCount);
        System.out.println("Color: " + car2.color);

        System.out.println("Initial name for car1: " + carReference.name);
        carReference.name = "Audi";
        System.out.println("Changed name for car1: " + carReference.name);


        // schimbarea valorilor unor variabile


        // stochez o alta masina
        // e nul pentru ca doar am instantiat, nu i-am atribuit nicio valoare
        carReference = new Car ();
        System.out.println("Name a new car: " + carReference.name);
        carReference.name = "BMW";

        // stochez in variabila carReference o copie a telecomenzii stocate in alta variabila
        carReference = car2;
        System.out.println("Name of car referenced from 2 variables. CarReference " + carReference.name);
        System.out.println("Name of car referenced from 2 variables. Car2 " + car2.name);

        car2.name = "Dacia";
        System.out.println("Updated name of car referenced from 2 variables. CarReference " + carReference.name);
        System.out.println("Updated name of car referenced from 2 variables. Car2 " + car2.name);


        car2 = null; // nu pot apela ceva de pe o valoare null !!!!
        System.out.println(carReference.name);
    }
}