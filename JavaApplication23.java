/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Rectangle r=new Rectangle();
        System.out.println("Enter the length of rectangle:");
        int l=input.nextInt();
        r.setlength(l);
        System.out.println("Enter the width of rectangle:");
        int w=input.nextInt();
        r.setwidth(w);
        System.out.println("The area  of rectangle= " +r.getArea());
        System.out.println("The perimeter of rectangle= "+r.getPerimeter());
        Triangle t=new Triangle();
        System.out.println("Enter the first side  of triangle:");
        int s1=input.nextInt();
        t.setside1(s1);
        System.out.println("Enter the second side of triangle:");
        int s2=input.nextInt();
        t.setside2(s2);
        System.out.println("Enter the third side of triangle:");
        int s3=input.nextInt();
        t.setside3(s3);
        System.out.println("The area  of triangle= " +t.getArea());
        System.out.println("The perimeter of triangle= "+t.getPerimeter());
        
    
    }
    
}
