package entities;

public class Rectangle extends Shape {

    private Double widht;
    private Double height;

    public Rectangle(Double widht, Double height, entities.enums.Color color) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    public Rectangle(entities.enums.Color color) {
        super(color);
    }

    public Double getWidht() {
        return widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        Double area = widht * height;
        return area;
    }

}
