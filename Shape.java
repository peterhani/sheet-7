/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author Asus
 */
public abstract class Shape {
    private int numSides;
    
    public Shape(){
        numSides=0;
    }
    public void setnumsides(int n){
        numSides=n;
    }
    public int getnumsides(){
        return numSides;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
    

