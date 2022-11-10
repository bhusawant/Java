class Circle{
    int radius;
    Circle()
    {
        radius = 1;
    }
    Circle(int r)
    {
        radius = r;
    }
    void calcArea()
    {
        double area;
        area = 3.14*radius*radius;
        System.out.println("Area of circle is: "+ area);
    }
}

public class Constructor_overloading{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Unit Circle");
        c1.calcArea();
        Circle c2 = new Circle(5);
        System.out.println("Circle with radius five");
        c2.calcArea();
    }
}