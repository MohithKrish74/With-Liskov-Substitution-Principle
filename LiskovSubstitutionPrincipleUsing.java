package com.keyword;

class HaveEngine
{
    public void haveEngine()
    {
        System.out.println("Engine is present");
    }
}

class DoesNotHaveEngine
{
    public void doesNotHaveEngine()
    {
        System.out.println("Engine is absent");
    }
}

class Bikes extends HaveEngine  // child class substitute parent class perfectly.
{
    public void bikeEngine()
    {
        System.out.println("Bike has Engine");
    }
}

class Cars extends HaveEngine
{
    public void carEngine()
    {
        System.out.println("Car has Engine");
    }
}

class Trucks extends HaveEngine
{
    public void truckEngine()
    {
        System.out.println("Truck has Engine");
    }
}

class Ships extends HaveEngine
{
    public void shipEngine()
    {
        System.out.println("Ship has Engine");
    }
}

class Cycles extends DoesNotHaveEngine
{
    public void cycle()
    {
        System.out.println("Cycle has no Engine");
    }
}

public class LiskovSubstitutionPrincipleUsing
{
    public static void main(String[] args)
    {
        Bikes bike = new Bikes();
        Cars car = new Cars();
        Trucks truck = new Trucks();
        Ships ship = new Ships();
        Cycles bicycle = new Cycles();
        bike.bikeEngine();
        car.carEngine();
        truck.truckEngine();
        ship.shipEngine();
        bicycle.cycle();

    }
}
