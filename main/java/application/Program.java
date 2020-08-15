package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.println("Rectangle or Cicle (r/c): ");
            char type = sc.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED)?");
            String color = sc.next();
            switch (type) {
                case 'r':
                    System.out.println("Width: ");
                    Double width = sc.nextDouble();
                    System.out.println("Height: ");
                    Double height = sc.nextDouble();
                    Rectangle rec = new Rectangle(width, height, Color.valueOf(color));
                    shapes.add(rec);
                    break;

                case 'c':
                    System.out.println("Radius: ");
                    Double radius = sc.nextDouble();
                    Circle cir = new Circle(radius, Color.valueOf(color));
                    shapes.add(cir);
                    break;

                default:
                    throw new IllegalStateException();
            }

            System.out.println("SHAPE AREAS: ");
            for (Shape s : shapes) {

                System.out.println(s.area());
            }

        }

        sc.close();

    }

}
