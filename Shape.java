//creating the shape class
public class Shape {
    protected String color;//instances variables
    protected boolean filled;//instances variables

    //constructor
    public Shape(String color, boolean filled) {
        this.color = color; //assigning color variable
        this.filled = filled; //assigning filled variable
    }
    //first method getArea
    public double getArea() {

        return 0.0;
    }
    // second method getPerimeter
    public double getPerimeter() {

        return 0.0;
    }
    //method toString()
    public String toString(){
        String thisString = "Color: "+color+"  Filled: "+filled;
        return thisString; //returning thisString variable
    }

}

