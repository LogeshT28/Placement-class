//8. Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
// Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area 
//and perimeter of a circle.

import java.util.Scanner;

class Shape{
    Scanner s = new Scanner(System.in);
    int r =s.nextInt();
    int  getPerimeter(){
        return 1 ;
    }
    int getArea(){
        return 0;
    }
}
class Circle extends Shape{
    int getPerimeter(){
        return (int) (2*Math.PI*r);
    }
    int getArea(){
        return(int) Math.PI*r*r;
    }
}
public class Problem7 {
    
}
