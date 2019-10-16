
package Feladat_3;

public class Teszt {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(3.5, 3.5, 3.5);
        
        System.out.println(t1.toString());
        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());
        System.out.println(t2.toString());
        System.out.println(t2.getArea());
        System.out.println(t2.getPerimeter());
        
        
        
    }
}
