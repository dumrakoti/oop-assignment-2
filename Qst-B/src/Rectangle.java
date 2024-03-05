public class Rectangle {
    private float length;
    private float width;

    // Constructors
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getter methods
    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    // Setter methods
    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // Method to calculate and return the area of the rectangle
    public float getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Test the Rectangle class
        Rectangle rectangle1 = new Rectangle(); // Creates a rectangle with default length and width
        System.out.println("Rectangle 1: Length = " + rectangle1.getLength() + ", Width = " + rectangle1.getWidth() + ", Area = " + rectangle1.getArea());

        Rectangle rectangle2 = new Rectangle(3.0f, 4.0f); // Creates a rectangle with specified length and width
        System.out.println("Rectangle 2: Length = " + rectangle2.getLength() + ", Width = " + rectangle2.getWidth() + ", Area = " + rectangle2.getArea());
    }
}
