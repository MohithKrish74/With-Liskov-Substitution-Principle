package com.keyword;


class Birds
{
    public void fly()
    {
        System.out.println("Birds Classification");
    }
}
class FlyingBird extends Birds
{
    public void fly()
    {
        System.out.println("Birds fly");
    }
}

class Ducks extends FlyingBird
{
    public void fly()
    {
        System.out.println("Duck Flies");
    }
}

class Ostriches extends Birds // Child class is completely replacing Base class
{
    public void fly()
    {
        System.out.println("Ostriches wont Flies");
    }
}

public class LiskovSubstitutionPrincipleUsing
{
    public static void main(String[] args)
    {
        Ducks ducks = new Ducks();
        Ostriches ostriches = new Ostriches();
        ducks.fly();
        ostriches.fly();

    }
}
