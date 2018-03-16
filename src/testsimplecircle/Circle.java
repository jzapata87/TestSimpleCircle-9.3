/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsimplecircle;


public class Circle {
    
    double radius;
    
    static int numberOfObjects = 0;
    
    
    // define 2 constructors
    public Circle() {
        radius = 1;
        numberOfObjects++;
    }
    
    public Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
    
    static int getNumberOfObjects() {
        return numberOfObjects;
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
