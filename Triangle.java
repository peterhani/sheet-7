/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author Asus
 */
public class Triangle extends Shape {
    private int side1;
    private int side2;
    private int side3;
    
    public void setside1(int s1){
        side1=s1;
    }
    public void setside2(int s2){
        side2=s2;
    }
    public void setside3(int s3){
        side3=s3;
    }
    
    @Override
    public double getArea(){
         double s=(side1+side2+side3)/2;
        return (Math.sqrt(s*(s-side1)*(s-side2)*(s-side3))); 
    }
    @Override
    public double getPerimeter(){
        return (side1+side2+side3);
    }
    
}

