/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsimplecircle;


public class Circle {
    
    double radius;
    
    
    // define 2 constructors
    public Circle() {
        radius = 1;
    }
    
    public Circle(double newRadius){
        radius = newRadius;
    }
    
    /** return the area of this circle **/
    public double getArea(){
        return radius*radius*Math.PI;
    }
    // return the perimeter of the circle
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    
}
