// creating Rectangle class extending Shape Class
class Rectangle extends Shape {
    protected double width; //instances variable width
    protected double height;//instances variable height

    //constructor
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);//retrieving the properties for super class
        this.width = width;//assigning width variable
        this.height = height;//assigning height variable
    }

    //creating method getArea
    @Override
    public double getArea() {

        return width * height;//returning the calculation of rectangle area
    }

    //creating method getPerimeter
    @Override
    public double getPerimeter() {

        return width * 2 + height * 2;//returning the calculation of rectangle perimeter
    }
}
