/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Asus
 */
public class senior extends student {

    public senior() {
    }
  
    private double basicfees =300+(300*0.2);
    public double getfees(){
        return basicfees;
    }
}
