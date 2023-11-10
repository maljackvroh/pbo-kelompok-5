package percobaan_7.akmal_dzaki;

import java.util.ArrayList;
import java.util.List;

abstract class shape{
    protected double area;
    public abstract void calculateArea();
    public void displayArea(){
        System.out.println("Area of the shape is: "+area);
    }
}

class circle extends shape{
    private double radius;
    public circle(double newRadius) {
        this.radius = newRadius;
    }

    @Override
    public void calculateArea(){
        area = Math.PI * Math.pow(radius,2);
    }
}

// public class rectangle extends shape {
//     private double width;
//     private double height;

//     public rectangle(double width, double height){
//         this.width = width;
//         this.height = height;
//     }

//     @Override
//     public void calculateArea(){
//         area = width * height;
//     }
// }

class triangle extends shape{
    private double a;
    private double b;
    private double c;

    public triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calculateArea(){
        double s = (a+b+c)/2;

        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}



public class js2 {

    public static void main(String[] args) {
        List<shape> shapes = new ArrayList<>();
        shapes.add(new circle(4.0));
        // shapes.add(new rectangle(8, 18.0));
        shapes.add(new triangle(3.0, 4.0, 5.0));

        for(shape shape: shapes){
            if(shape instanceof circle){
                System.out.println("Circle : ");
                circle circle = (circle) shape;
                circle.calculateArea();
                circle.displayArea();
            // } else if (shape instanceof rectangle){
            //     System.out.println("Rectangle : ");
            //     rectangle rectangle = (rectangle) shape;
            //     rectangle.calculateArea();
            //     rectangle.displayArea();
            } else if (shape instanceof triangle){
                System.out.println("Traingle: ");
                triangle triangle = (triangle) shape;
                triangle.calculateArea();
                triangle.displayArea();
            }
        }
    }
}

