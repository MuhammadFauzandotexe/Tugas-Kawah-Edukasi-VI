public abstract class  Shape {
    public double getArea() {
        return 0;
    }
    public double getAround(){
        return 0;
    }
}
class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getAround(){
        return 2*width + 2*height;
    }
}

class Square extends Shape{
    private double widht;
    Square(double widht){
        this.widht = widht;
    }
    public double getArea(){
        return widht*widht;
    }
    public double getAround(){
        return 4*widht;
    }
}
class Circle extends Shape {
    final double phi = 3.14;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return phi * radius * radius;
    }
    public double getAround() {
        return 2*phi*radius;
    }
}
class Triangle extends Shape{
    private double width;
    private double height;
    private double side1;
    private double side2;
    public Triangle(double width, double height,double side1,double side2){
        this.width = width;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    public double getArea(){
        return 0.5*width*height;
    }
    public double getAround() {
        return side1+side2+width;
    }
}

