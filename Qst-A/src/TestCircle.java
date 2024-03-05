public class TestCircle {
    public static void main( String[] args ) {

        Circle circle = new Circle(5, "Blue");

        //System.out.println(circle.radius);
        //Cannot directly access radius variable
        // because radius is private variable
        // and cannot be accessed directly outside the class
        System.out.println(circle.getRadius());


        Circle c4 = new Circle(2.3, "Red");
        c4.setRadius(5.5);
        System.out.println("Radius is " + c4.getRadius());
        c4.setColor("Golden");
        System.out.println("Color is " + c4.getColor());

        //setRadius() return void which cannot be printed
        //System.out.println(c4.setRadius(4.4));

        //explicit call to toString()
        System.out.println(c4.toString());
        //implicit call to toString()
        System.out.println(c4);
    }
}
