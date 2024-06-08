//3) write a Java program to create a class called shape with a method called getarea().
// create a subclass called rectangle that overrides a getarea method to calculate the area of the rectangle 

import java.util.Scanner;

class Shape{
    public int getArea(int length,int width){
        int l = length;
        int w = width;
        return l*w;
        
    }
}
class Rectangle extends Shape{
    public int getArea(int length,int width){
        return length*width;
    }
}
public class Problem3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int w = s.nextInt();
        Rectangle o = new Rectangle();
        System.out.println(o.getArea(l,w));
    }
}
