package thisVsSuperKeyword.ExampleTwo;

class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


public class Rectangle extends Shape{

    private int width;
    private int height;

    // 1st Constructor
    public Rectangle(int x, int y) {
        this(x,y,0,0); // calls 2nd Constructor
    }

    // 2nd Constructor
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);            // calls constructor from parent (Shape)
        this.width = width;
        this.height = height;
    }
}




















