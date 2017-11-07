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
public class Cylinder extends Shape3d {
    
    private double Radius;
    private double Height;

   
    public Cylinder(String name, double r, double h) {
        
        super(name);
        Radius = r;
        Height = h;
        
    }

    @Override
    public double getSa() {
        double area = (2 * 3.14 * Radius)*(Height + Radius);
        return area;
    }

    @Override
    public double getVolume() {
      double volume = 3.14 * Radius * Radius * Height;
        return volume;
    }
    
}
