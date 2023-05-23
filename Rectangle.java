/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author Asus
 */
public class Rectangle extends Shape {
    private int width;
    private int length;

    public void setwidth(int w){
        width=w;
    }
    public void setlength(int l){
        length=l;
    }

    @Override
    public double getArea() {
       return (width*length);
    }
    @Override 
    public double getPerimeter(){
        return (2*(width+length));
        
    }
    
}
