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
public class Sphere extends Shape3d{
    
        private double Radius;
    
        public Sphere(String name) {
        super(name);
    }

    @Override
    public double getSa() {
        double area = 4 * 3.14 * Radius * Radius;
        return area;
    }

    @Override
    public double getVolume() {
        double volume = 4 * 3.12 * Radius * Radius * Radius;
        return volume;
    }

     
    
}
