// creating the Main Class
class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5, "red", true);//creating the circle1 object with their properties

        //printing circle properties using toString method, and getArea and getPerimeter methods
        System.out.printf("Properties of circle object: %s Area: %.2f Perimeter %.2f%n", circle1.toString(), circle1.getArea(), circle1.getPerimeter());//applying format to the output
        System.out.println();

        Rectangle rectangle1 = new Rectangle(12, 9, "blue", false);//creating the rectangle1 object with their properties
        //printing rectangle properties using toString method, and getArea and getPerimeter methods
        System.out.printf("Properties of rectangle object: %s Area: %.2f Perimeter %.2f%n", rectangle1.toString(), rectangle1.getArea(), rectangle1.getPerimeter());//applying format to the output

    }
}
