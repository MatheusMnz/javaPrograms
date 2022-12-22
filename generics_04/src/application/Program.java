package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.5));
        myCircles.add(new Circle(4.0));

        System.out.println("Total Area: " + totalArea(myShapes));
        System.out.println("Total Area Circles: " + totalArea(myCircles));
    }

    // Lista que qualquer tipo que seja subtipo de Shape
    public static double totalArea(List<? extends Shape> list){
        // Caso tente adicionar na Lista, ele reclama, pois pode ser que o tipo não seja compatível
        double sum = 0.0;
        for(Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}