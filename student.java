/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;


public abstract class student {
    private String name ;
    private int id ;

    public student() {
        this.name = name;
        this.id = id;
    }
    
    public void setid(int i){
        id=i;
    }
    public void setname(String n){
        name=n;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public abstract double getfees();

}
