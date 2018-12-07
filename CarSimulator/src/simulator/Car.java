package simulator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Piotr
 */
public class Car {
    private String nazwa;
    private int bieg;
    private int maxVelocity;
    private int maxRpm;
    
    Car(String nazwa, int vel, int rpm)
    {
        this.nazwa = nazwa;
        this.maxVelocity = vel;
        this.maxRpm = rpm;
    }
    
    public String getNazwa()
    {
        return this.nazwa;
    }
    
    public int getVelocity()
    {
        return this.maxVelocity;
    }
    
    public int getRpm()
    {
        return this.maxRpm;
    }
    
    @Override
    public String toString()
    {
        return "Samochod: "+this.nazwa;
    }
    
    
}
