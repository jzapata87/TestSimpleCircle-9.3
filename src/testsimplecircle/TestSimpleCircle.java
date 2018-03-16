
package testsimplecircle;


public class TestSimpleCircle {

   
    public static void main(String[] args) {
        // Create a circle with radius 1
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + 
                Circle.numberOfObjects);
        
        Circle circle1 = new Circle();
        
        System.out.println("The area of the circle of radius " + circle1.radius
        + " is " + circle1.getArea());
        
        Circle circle2 = new Circle(25.0);
        
        System.out.println("The area of the circle of radius " + circle2.radius
        + " is " + circle2.getArea());
        
        Circle circle3 = new Circle(125);
        
        System.out.println("The area of the circle of radius " + circle3.radius
        + " is " + circle3.getArea());  
        
        circle2.radius = 100; 
        System.out.println("The area of the circle of radius " + circle2.radius
        + " is " + circle2.getArea());
        
        System.out.println("After creating objects");
        System.out.println("The number of Circle objects is " + 
                Circle.numberOfObjects);
        
        System.out.println("This is my first learning expierence");
        
    }
    
}
