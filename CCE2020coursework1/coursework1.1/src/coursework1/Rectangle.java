/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;

/**
 *
 * @author m00609532
 */
public class Rectangle extends Shape2d{

        private double length;
        private double breadth;
    public Rectangle(String name, double l, double b) {
        super(name);
        length = l;
        breadth = b;
    }

    public double getArea() {
        double area = length * breadth;
        return area;
    }

    
    public double getPerimeter() {
        double perimeter = length + breadth;
        return perimeter;       
    }
    
    
}
