//creating a class Circle which extends ShapeClass
class Circle extends Shape {
    protected double radius;//instance variable radius

    //constructor
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); //retrieving the properties for super class
        this.radius = radius; //assigning radius variable
    }

    //creating method getRadius
    public double getRadius() {

        return radius;// returning radius variable
    }

    //creating method setRadius
    public void setRadius(double radius) {

        this.radius = radius; //setting radius variable
    }

    //creating method getArea()
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2); //returning the calculation of circle area
    }

    //creating method getPerimeter
    @Override
    public double getPerimeter() {

        return 2 * Math.PI * radius; //returning the calculation of circle perimeter
    }
}
