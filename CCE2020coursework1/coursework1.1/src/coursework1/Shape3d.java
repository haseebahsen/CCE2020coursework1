/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;


public abstract class Shape3d extends Shape{
    
   
    public Shape3d(String name)
    {
        super(name);
    }
    
    public abstract double getSa();
    public abstract double getVolume();
    
}
