package entities;

public class Circle extends Shape {

    private Double radius;

    public Circle(Double radius, entities.enums.Color color) {
        super(color);
        this.radius = radius;
    }

    public Circle(entities.enums.Color color) {
        super(color);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        Double area = 3.14 * (radius * radius);
        return area;
    }

}
